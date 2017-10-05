package br.com.tt.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;

	@GetMapping
	ModelAndView cliente() {
		ModelAndView mv = new ModelAndView("/cliente/index");
		mv.addObject("clientes",  service.consulta());
		return mv;
	}

	@GetMapping("/cadastro")
	String cadastro() {
		return "cliente/cadastro";
	}
}
