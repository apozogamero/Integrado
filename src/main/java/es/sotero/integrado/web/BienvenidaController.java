package es.sotero.integrado.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BienvenidaController {

	@RequestMapping(value = "/bienvenida.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("bienvenida");
	}
}
