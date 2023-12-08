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

import es.sotero.integrado.business.entities.Maniobra;
import es.sotero.integrado.business.services.ManiobraManager;

@Controller
public class ManiobraController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ManiobraManager manManager;
    
    @RequestMapping(value="/getManiobraAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarManiobras view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaMan", this.manManager.getManiobraAll());
        
        System.out.println(this.manManager.getManiobraAll());

        return new ModelAndView("mostrarManiobras", "model", myModel);
    }
    
    @RequestMapping(value="/getManiobra.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarManiobra", "modeloManiobra", new Maniobra());
	}
	
	@RequestMapping(value="/searchManiobra.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloManiobra") Maniobra maniobra, BindingResult result, ModelMap model) {
        
		Maniobra myModel = new Maniobra();
        myModel = this.manManager.getManiobra(maniobra.getId());
        return new ModelAndView("resultadoManiobra", "model", myModel);
    }
}