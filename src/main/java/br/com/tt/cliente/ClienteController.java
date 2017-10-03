package br.com.tt.cliente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping
	String cliente (){
		return "cliente";
	}
	@GetMapping("/cadastro")
	String cadastro (){
		return "cliente-cadastro";
	}
}
