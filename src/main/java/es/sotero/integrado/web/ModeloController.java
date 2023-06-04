package es.sotero.integrado.web;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.sotero.integrado.business.services.ModeloManager;

@Controller
public class ModeloController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ModeloManager modManager;
    
    @RequestMapping(value="/getModeloAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarModelos view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaMod", this.modManager.getModeloAll());

        return new ModelAndView("mostrarModelos", "model", myModel);
    }
}