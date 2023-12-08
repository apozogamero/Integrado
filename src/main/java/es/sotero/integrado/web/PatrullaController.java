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

import es.sotero.integrado.business.entities.Patrulla;
import es.sotero.integrado.business.services.PatrullaManager;

@Controller
public class PatrullaController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private PatrullaManager patManager;
    
    @RequestMapping(value="/getPatrullaAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarPatrullas view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaPat", this.patManager.getPatrullaAll());

        return new ModelAndView("mostrarPatrullas", "model", myModel);
    }
    
    @RequestMapping(value="/getPatrulla.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarPatrulla", "modeloPatrulla", new Patrulla());
	}
	
	@RequestMapping(value="/searchPatrulla.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloPatrulla") Patrulla patrulla, BindingResult result, ModelMap model) {
        
		Patrulla myModel = new Patrulla();
        myModel = this.patManager.getPatrulla(patrulla.getId());
        return new ModelAndView("resultadoPatrulla", "model", myModel);
    }
}