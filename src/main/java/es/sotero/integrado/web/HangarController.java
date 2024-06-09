package es.sotero.integrado.web;

import javax.validation.Valid;

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

import es.sotero.integrado.business.dto.HangarDto;
import es.sotero.integrado.business.entities.Hangar;
import es.sotero.integrado.business.services.HangarManager;

@Controller
public class HangarController {

    @Autowired
    private HangarManager hanManager;
    
    @RequestMapping(value="/getHangar.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarHangar", "modeloHangar", new Hangar());
	}
	
	@RequestMapping(value="/searchHangar.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloHangar") Hangar hangar, BindingResult result, ModelMap model) {
        
		Hangar myModel = new Hangar();
        myModel = this.hanManager.getHangar(hangar.getIdHangar());
        return new ModelAndView("resultadoHangar", "model", myModel);
    }
	
	@GetMapping("getHangarAll")
	public String getHangarAll(Model m) {
		m.addAttribute("model", hanManager.getHangarAll());
		
		return "mostrarHangares";
	}
	
	@GetMapping("addHangar")
	public String addHangar() {
		return "anadirHangar";
	}
	
	@PostMapping("/insertHangar")
	public String insertHangar(@ModelAttribute("insertHangar") Hangar han) {
		hanManager.addHangar(han);
		return "redirect:/getHangarAll";
	}
	
	@RequestMapping(value = "/editHangar/{idHangar}", method = RequestMethod.GET)
	public String editHangar(@PathVariable(value="idHangar") int id, Model m) {
		Hangar han = hanManager.getHangar(id);
		
		HangarDto hanDto = new HangarDto();
		hanDto.setIdHangar(han.getIdHangar());
		hanDto.setNombre(han.getNombre());
		hanDto.setCapacidad(han.getCapacidad());
		
		m.addAttribute("model", hanDto);
		return "editarHangar";
	}
	
	@PostMapping("/editHangar/updateHangar")
	public String updateHangar(@ModelAttribute("updateHangar") HangarDto hanDto) {
		
		Hangar han = new Hangar();
		han.setIdHangar(hanDto.getIdHangar());
		han.setNombre(hanDto.getNombre());
		han.setCapacidad(hanDto.getCapacidad());
		
		hanManager.updateHangar(han);
		return "redirect:/getHangarAll";
	}
	
	@RequestMapping(value = "/deleteHangar/{idHangar}", method = RequestMethod.GET)
	public String deleteHangar(@PathVariable(value="idHangar") int id) {
		Hangar han = hanManager.getHangar(id);
		hanManager.deleteHangar(han);
		return "redirect:/getHangarAll";
	}
}