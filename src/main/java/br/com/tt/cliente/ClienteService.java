package br.com.tt.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ClienteService {
	
	List<Cliente> consulta(){
		List<Cliente> clientes = new ArrayList<>();		
		clientes.add(new Cliente(1L,"Carlos","12345678910", new Date()));
		clientes.add(new Cliente(2L,"Maria","12345678910", new Date()));
		clientes.add(new Cliente(3L,"Jose","12345678910", new Date()));
		clientes.add(new Cliente(4L,"Opa","12345678910", new Date()));
		clientes.add(new Cliente(5L,"Daniel","12345678910", new Date()));
	return clientes;
		
	}

}
