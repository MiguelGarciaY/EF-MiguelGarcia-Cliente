package com.idat.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.cliente.modelo.Cliente;
import com.idat.cliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository repository;
	List<Cliente> listarCliente;
	@Override
	public List<Cliente> listar() {		
		return repository.findAll();
	}
	@Override
	public Cliente obtenerId(Integer id) {		
		return repository.findById(id).orElse(null);
	}
	@Override
	public void guardar(Cliente cliente) {
		repository.save(cliente);
		
	}
	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
		
	}
	@Override
	public void actualizar(Cliente cliente) {		
		repository.saveAndFlush(cliente);
	}
}
