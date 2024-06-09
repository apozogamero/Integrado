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

import es.sotero.integrado.business.dto.AeronaveDto;
import es.sotero.integrado.business.entities.Aeronave;
import es.sotero.integrado.business.services.AeronaveManager;

@Controller
public class AeronaveController {

    @Autowired
    private AeronaveManager aerManager;
    
    @RequestMapping(value="/getAeronave.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarAeronave", "modeloAeronave", new Aeronave());
	}
	
	@RequestMapping(value="/searchAeronave.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloAeronave") Aeronave aeronave, BindingResult result, ModelMap model) {
        
		Aeronave myModel = new Aeronave();
        myModel = this.aerManager.getAeronave(aeronave.getIdAeronave());
        return new ModelAndView("resultadoAeronave", "model", myModel);
    }
	
	@GetMapping("getAeronaveAll")
	public String getAeronaveAll(Model m) {
		m.addAttribute("model", aerManager.getAeronaveAll());
		
		return "mostrarAeronaves";
	}
	
	@GetMapping("addAeronave")
	public String addAeronave() {
		return "anadirAeronave";
	}
	
	@PostMapping("/insertAeronave")
	public String insertAeronave(@ModelAttribute("insertAeronave") Aeronave aer) {
		aerManager.addAeronave(aer);
		return "redirect:/getAeronaveAll";
	}
	
	@RequestMapping(value = "/editAeronave/{idAeronave}", method = RequestMethod.GET)
	public String editAeronave(@PathVariable(value="idAeronave") int id, Model m) {
		Aeronave aer = aerManager.getAeronave(id);
		
		AeronaveDto aerDto = new AeronaveDto();
		aerDto.setIdAeronave(aer.getIdAeronave());
		aerDto.setNombre(String.valueOf(aer.getNombre()));
		
		m.addAttribute("model", aerDto);
		return "editarAeronave";
	}
	
	@PostMapping("/editAeronave/updateAeronave")
	public String updateAeronave(@ModelAttribute("updateAeronave") AeronaveDto aerDto) {
		
		Aeronave aer = new Aeronave();
		aer.setIdAeronave(aerDto.getIdAeronave());
		aer.setNombre(aerDto.getNombre());
		
		aerManager.updateAeronave(aer);
		return "redirect:/getAeronaveAll";
	}
	
	@RequestMapping(value = "/deleteAeronave/{idAeronave}", method = RequestMethod.GET)
	public String deleteAeronave(@PathVariable(value="idAeronave") int id) {
		Aeronave aer = aerManager.getAeronave(id);
		aerManager.deleteAeronave(aer);
		return "redirect:/getAeronaveAll";
	}
}