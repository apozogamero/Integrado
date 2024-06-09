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

import es.sotero.integrado.business.dto.PatrullaDto;
import es.sotero.integrado.business.entities.Patrulla;
import es.sotero.integrado.business.services.PatrullaManager;

@Controller
public class PatrullaController {

    @Autowired
    private PatrullaManager patManager;
    
    @RequestMapping(value="/getPatrulla.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarPatrulla", "modeloPatrulla", new Patrulla());
	}
	
	@RequestMapping(value="/searchPatrulla.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloPatrulla") Patrulla patrulla, BindingResult result, ModelMap model) {
        
		Patrulla myModel = new Patrulla();
        myModel = this.patManager.getPatrulla(patrulla.getIdPatrulla());
        return new ModelAndView("resultadoPatrulla", "model", myModel);
    }
	
	@GetMapping("getPatrullaAll")
	public String getPatrullaAll(Model m) {
		m.addAttribute("model", patManager.getPatrullaAll());
		
		return "mostrarPatrullas";
	}
	
	@GetMapping("addPatrulla")
	public String addPatrulla() {
		return "anadirPatrulla";
	}
	
	@PostMapping("/insertPatrulla")
	public String insertPatrulla(@ModelAttribute("insertPatrulla") Patrulla pat) {
		patManager.addPatrulla(pat);
		return "redirect:/getPatrullaAll";
	}
	
	@RequestMapping(value = "/editPatrulla/{idPatrulla}", method = RequestMethod.GET)
	public String editPatrulla(@PathVariable(value="idPatrulla") int id, Model m) {
		Patrulla pat = patManager.getPatrulla(id);
		
		PatrullaDto patDto = new PatrullaDto();
		patDto.setIdPatrulla(pat.getIdPatrulla());
		patDto.setNombre(pat.getNombre());
		
		m.addAttribute("model", patDto);
		return "editarPatrulla";
	}
	
	@PostMapping("/editPatrulla/updatePatrulla")
	public String updatePatrulla(@ModelAttribute("updatePatrulla") PatrullaDto patDto) {
		
		Patrulla pat = new Patrulla();
		pat.setIdPatrulla(patDto.getIdPatrulla());
		pat.setNombre(patDto.getNombre());
		
		patManager.updatePatrulla(pat);
		return "redirect:/getPatrullaAll";
	}
	
	@RequestMapping(value = "/deletePatrulla/{idPatrulla}", method = RequestMethod.GET)
	public String deletePatrulla(@PathVariable(value="idPatrulla") int id) {
		Patrulla pat = patManager.getPatrulla(id);
		patManager.deletePatrulla(pat);
		return "redirect:/getPatrullaAll";
	}
}