package es.sotero.integrado.web;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.sotero.integrado.business.dto.AveriaDto;
import es.sotero.integrado.business.entities.Averia;
import es.sotero.integrado.business.services.AveriaManager;

@Controller
public class AveriaController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private AveriaManager aveManager;
    
    @RequestMapping(value="/getAveria.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarAveria", "modeloAveria", new Averia());
	}
	
	@RequestMapping(value="/searchAveria.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloAveria") Averia averia, BindingResult result, ModelMap model) {
        
		Averia myModel = new Averia();
        myModel = this.aveManager.getAveria(averia.getIdAveria());
        return new ModelAndView("resultadoAveria", "model", myModel);
    }
	
	@GetMapping("getAveriaAll")
	public String getAveriaAll(Model m) {
		m.addAttribute("model", aveManager.getAveriaAll());
		
		return "mostrarAverias";
	}
	
	@GetMapping("addAveria")
	public String addAveria() {
		return "anadirAveria";
	}
	
	@PostMapping("/insertAveria")
	public String insertAveria(@ModelAttribute("insertAveria") Averia ave) {
		aveManager.addAveria(ave);
		return "redirect:/getAveriaAll";
	}
	
	@RequestMapping(value = "/editAveria/{idAveria}", method = RequestMethod.GET)
	public String editAveria(@PathVariable(value="idAveria") int id, Model m) {
		Averia ave = aveManager.getAveria(id);
		
		AveriaDto aveDto = new AveriaDto();
		aveDto.setIdAveria(ave.getIdAveria());
		aveDto.setDescripcion(ave.getDescripcion());
		aveDto.setFecha(ave.getFecha());
		
		m.addAttribute("model", aveDto);
		return "editarAveria";
	}
	
	@PostMapping("/editAveria/updateAveria")
	public String updateAveria(@ModelAttribute("updateAveria") AveriaDto aveDto) {
		
		Averia ave = new Averia();
		ave.setIdAveria(aveDto.getIdAveria());
		ave.setDescripcion(aveDto.getDescripcion());
		ave.setFecha(aveDto.getFecha());
		
		aveManager.updateAveria(ave);
		return "redirect:/getAveriaAll";
	}
	
	@RequestMapping(value = "/deleteAveria/{idAveria}", method = RequestMethod.GET)
	public String deleteAveria(@PathVariable(value="idAveria") int id) {
		Averia ave = aveManager.getAveria(id);
		aveManager.deleteAveria(ave);
		return "redirect:/getAveriaAll";
	}
}