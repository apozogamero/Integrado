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

import es.sotero.integrado.business.dto.PilotoDto;
import es.sotero.integrado.business.entities.Piloto;
import es.sotero.integrado.business.services.AeronaveManager;
import es.sotero.integrado.business.services.PilotoManager;

@Controller
public class PilotoController {

    @Autowired
    private PilotoManager pilManager;
    
    @RequestMapping(value="/getPiloto.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarPiloto", "modeloPiloto", new Piloto());
	}
	
	@RequestMapping(value="/searchPiloto.htm", method = RequestMethod.POST)
    public ModelAndView submitSearch(@Valid @ModelAttribute("modeloPiloto") Piloto piloto, BindingResult result, ModelMap model) {
        
		Piloto myModel = new Piloto();
        myModel = this.pilManager.getPiloto(piloto.getIdPiloto());
        return new ModelAndView("resultadoPiloto", "model", myModel);
    }

	@GetMapping("getPilotoAll")
	public String getPilotoAll(Model m) {
		m.addAttribute("model", pilManager.getPilotoAll());
		
		return "mostrarPilotos";
	}
	
	@GetMapping("addPiloto")
	public String addPiloto() {
		return "anadirPiloto";
	}
	
	@PostMapping("/insertPiloto")
	public String insertPiloto(@ModelAttribute("insertPiloto") Piloto pil) {
		pilManager.addPiloto(pil);
		return "redirect:/getPilotoAll";
	}
	
	@RequestMapping(value = "/editPiloto/{idPiloto}", method = RequestMethod.GET)
	public String editPiloto(@PathVariable(value="idPiloto") int id, Model m) {
		Piloto pil = pilManager.getPiloto(id);
		
		PilotoDto pilDto = new PilotoDto();
		pilDto.setIdPiloto(pil.getIdPiloto());
		pilDto.setNombre(String.valueOf(pil.getNombre()));
		pilDto.setDni(String.valueOf(pil.getDni()));
		pilDto.setSexo(pil.getSexo());
		pilDto.setEdad(pil.getEdad());
//		pilDto.setIdAeronave(pil.getAeronave().getIdAeronave());
		
		m.addAttribute("model", pilDto);
		return "editarPiloto";
	}
	
	@PostMapping("/editPiloto/updatePiloto")
	public String updatePiloto(@ModelAttribute("updatePiloto") PilotoDto pilDto) {
		
		Piloto pil = new Piloto();
		pil.setIdPiloto(pilDto.getIdPiloto());
		pil.setNombre(pilDto.getNombre());
		pil.setDni(pilDto.getDni());
		pil.setSexo(pilDto.getSexo());
		pil.setEdad(pilDto.getEdad());
//		pil.setAeronave(aerManager.getAeronave(pilDto.getIdAeronave()));
		
		pilManager.updatePiloto(pil);
		return "redirect:/getPilotoAll";
	}
	
	@RequestMapping(value = "/deletePiloto/{idPiloto}", method = RequestMethod.GET)
	public String deletePiloto(@PathVariable(value="idPiloto") int id) {
		Piloto pil = pilManager.getPiloto(id);
		pilManager.deletePiloto(pil);
		return "redirect:/getPilotoAll";
	}
}