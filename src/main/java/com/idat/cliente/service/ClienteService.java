package com.idat.cliente.service;

import java.util.List;

import com.idat.cliente.modelo.Cliente;


public interface ClienteService {
	List<com.idat.cliente.modelo.Cliente> listar();
	Cliente obtenerId(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);
}
