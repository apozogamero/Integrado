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

import es.sotero.integrado.business.dto.ManiobraDto;
import es.sotero.integrado.business.entities.Maniobra;
import es.sotero.integrado.business.services.ManiobraManager;

@Controller
public class ManiobraController {

    @Autowired
    private ManiobraManager manManager;
    
    @RequestMapping(value="/getManiobra.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarManiobra", "modeloManiobra", new Maniobra());
	}
	
	@RequestMapping(value="/searchManiobra.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloManiobra") Maniobra maniobra, BindingResult result, ModelMap model) {
        
		Maniobra myModel = new Maniobra();
        myModel = this.manManager.getManiobra(maniobra.getIdManiobra());
        return new ModelAndView("resultadoManiobra", "model", myModel);
    }
	
	@GetMapping("getManiobraAll")
	public String getManiobraAll(Model m) {
		m.addAttribute("model", manManager.getManiobraAll());
		
		return "mostrarManiobras";
	}
	
	@GetMapping("addManiobra")
	public String addManiobra() {
		return "anadirManiobra";
	}
	
	@PostMapping("/insertManiobra")
	public String insertManiobra(@ModelAttribute("insertManiobra") Maniobra man) {
		manManager.addManiobra(man);
		return "redirect:/getManiobraAll";
	}
	
	@RequestMapping(value = "/editManiobra/{idManiobra}", method = RequestMethod.GET)
	public String editManiobra(@PathVariable(value="idManiobra") int id, Model m) {
		Maniobra man = manManager.getManiobra(id);
		
		ManiobraDto manDto = new ManiobraDto();
		manDto.setIdManiobra(man.getIdManiobra());
		manDto.setDescripcion(man.getDescripcion());
		manDto.setFecha(man.getFecha());
		
		m.addAttribute("model", manDto);
		return "editarManiobra";
	}
	
	@PostMapping("/editManiobra/updateManiobra")
	public String updateManiobra(@ModelAttribute("updateManiobra") ManiobraDto manDto) {
		
		Maniobra man = new Maniobra();
		man.setIdManiobra(manDto.getIdManiobra());
		man.setDescripcion(manDto.getDescripcion());
		man.setFecha(manDto.getFecha());
		
		manManager.updateManiobra(man);
		return "redirect:/getManiobraAll";
	}
	
	@RequestMapping(value = "/deleteManiobra/{idManiobra}", method = RequestMethod.GET)
	public String deleteManiobra(@PathVariable(value="idManiobra") int id) {
		Maniobra man = manManager.getManiobra(id);
		manManager.deleteManiobra(man);
		return "redirect:/getManiobraAll";
	}
}