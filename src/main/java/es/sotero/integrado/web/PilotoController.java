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

import es.sotero.integrado.business.entities.Piloto;
import es.sotero.integrado.business.services.PilotoManager;

@Controller
public class PilotoController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private PilotoManager pilManager;
    
    @RequestMapping(value="/getPilotoAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarPilotos view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaPil", this.pilManager.getPilotoAll());

        return new ModelAndView("mostrarPilotos", "model", myModel);
    }
    
    @RequestMapping(value="/getPiloto.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarPiloto", "modeloPiloto", new Piloto());
	}
	
	@RequestMapping(value="/searchPiloto.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloPiloto") Piloto piloto, BindingResult result, ModelMap model) {
        
		Piloto myModel = new Piloto();
        myModel = this.pilManager.getPiloto(piloto.getDni());
        return new ModelAndView("resultadoPiloto", "model", myModel);
    }
}