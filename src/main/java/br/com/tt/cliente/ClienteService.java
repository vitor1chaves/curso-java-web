package br.com.tt.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public List<Cliente> consulta() {
		return repository.findAll();
	}
	
	public void salvar(Cliente cliente){
		repository.save(cliente);
	}

}
