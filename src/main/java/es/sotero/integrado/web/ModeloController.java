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

import es.sotero.integrado.business.dto.ModeloDto;
import es.sotero.integrado.business.entities.Modelo;
import es.sotero.integrado.business.services.ModeloManager;

@Controller
public class ModeloController {

    @Autowired
    private ModeloManager modManager;
    
    @RequestMapping(value="/getModelo.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarModelo", "modeloModelo", new Modelo());
	}
	
	@RequestMapping(value="/searchModelo.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloModelo") Modelo modelo, BindingResult result, ModelMap model) {
        
		Modelo myModel = new Modelo();
        myModel = this.modManager.getModelo(modelo.getIdModelo());
        return new ModelAndView("resultadoModelo", "model", myModel);
    }
	
	@GetMapping("getModeloAll")
	public String getModeloAll(Model m) {
		m.addAttribute("model", modManager.getModeloAll());
		
		return "mostrarModelos";
	}
	
	@GetMapping("addModelo")
	public String addModelo() {
		return "anadirModelo";
	}
	
	@PostMapping("/insertModelo")
	public String insertModelo(@ModelAttribute("insertModelo") Modelo mod) {
		modManager.addModelo(mod);
		return "redirect:/getModeloAll";
	}
	
	@RequestMapping(value = "/editModelo/{idModelo}", method = RequestMethod.GET)
	public String editModelo(@PathVariable(value="idModelo") int id, Model m) {
		Modelo mod = modManager.getModelo(id);
		
		ModeloDto modDto = new ModeloDto();
		modDto.setIdModelo(mod.getIdModelo());
		modDto.setNombre(mod.getNombre());
		
		m.addAttribute("model", modDto);
		return "editarModelo";
	}
	
	@PostMapping("/editModelo/updateModelo")
	public String updateModelo(@ModelAttribute("updateModelo") ModeloDto modDto) {
		
		Modelo mod = new Modelo();
		mod.setIdModelo(modDto.getIdModelo());
		mod.setNombre(modDto.getNombre());
		
		modManager.updateModelo(mod);
		return "redirect:/getModeloAll";
	}
	
	@RequestMapping(value = "/deleteModelo/{idModelo}", method = RequestMethod.GET)
	public String deleteModelo(@PathVariable(value="idModelo") int id) {
		Modelo mod = modManager.getModelo(id);
		modManager.deleteModelo(mod);
		return "redirect:/getModeloAll";
	}
}