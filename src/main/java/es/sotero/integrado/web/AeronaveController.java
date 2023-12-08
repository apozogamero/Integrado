package es.sotero.integrado.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.sotero.integrado.business.entities.Aeronave;
import es.sotero.integrado.business.services.AeronaveManager;

@Controller
public class AeronaveController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private AeronaveManager aerManager;
    
    @RequestMapping(value="/getAeronaveAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarAeronaves view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaAer", this.aerManager.getAeronaveAll());

        return new ModelAndView("mostrarAeronaves", "model", myModel);
    }
    
    @RequestMapping(value="/getAeronave.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarAeronave", "modeloAeronave", new Aeronave());
	}
	
	@RequestMapping(value="/searchAeronave.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloAeronave") Aeronave aeronave, BindingResult result, ModelMap model) {
        
		Aeronave myModel = new Aeronave();
        myModel = this.aerManager.getAeronave(aeronave.getId());
        return new ModelAndView("resultadoAeronave", "model", myModel);
    }
	
	@RequestMapping(value="/deleteAeronave.htm", method = RequestMethod.POST)
	public ModelAndView submit(@Valid @ModelAttribute("modeloAeronave") Aeronave aeronave, BindingResult result) {
		
		aerManager.deleteAeronave(aeronave.getId());
		return new ModelAndView("datosBorrados");
	}
}