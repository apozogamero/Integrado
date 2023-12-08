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

import es.sotero.integrado.business.entities.Averia;
import es.sotero.integrado.business.services.AveriaManager;

@Controller
public class AveriaController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private AveriaManager aveManager;
    
    @RequestMapping(value="/getAveriaAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarAverias view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaAve", this.aveManager.getAveriaAll());

        return new ModelAndView("mostrarAverias", "model", myModel);
    }
    
    @RequestMapping(value="/getAveria.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarAveria", "modeloAveria", new Averia());
	}
	
	@RequestMapping(value="/searchAveria.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("modeloAveria") Averia averia, BindingResult result, ModelMap model) {
        
		Averia myModel = new Averia();
        myModel = this.aveManager.getAveria(averia.getId());
        return new ModelAndView("resultadoAveria", "model", myModel);
    }
}