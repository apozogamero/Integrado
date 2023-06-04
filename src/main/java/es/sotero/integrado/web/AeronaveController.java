package es.sotero.integrado.web;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}