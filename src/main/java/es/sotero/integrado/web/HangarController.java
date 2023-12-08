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

import es.sotero.integrado.business.entities.Hangar;
import es.sotero.integrado.business.services.HangarManager;

@Controller
public class HangarController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private HangarManager hanManager;
    
    @RequestMapping(value="/getHangarAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarHangares view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaHan", this.hanManager.getHangarAll());

        return new ModelAndView("mostrarHangares", "model", myModel);
    }
    
    @RequestMapping(value="/getHangar.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarHangar", "modeloHangar", new Hangar());
	}
	
	@RequestMapping(value="/searchHangar.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloHangar") Hangar hangar, BindingResult result, ModelMap model) {
        
		Hangar myModel = new Hangar();
        myModel = this.hanManager.getHangar(hangar.getId());
        return new ModelAndView("resultadoHangar", "model", myModel);
    }
}