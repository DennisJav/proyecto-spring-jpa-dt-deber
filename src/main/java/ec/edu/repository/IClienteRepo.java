package ec.edu.repository;

import ec.edu.modelo.Cliente;

public interface IClienteRepo {

	void insertarCliente(Cliente cliente);
	void borrarCliente(Integer id);
	void actualizarCliente(Cliente Cliente);
	Cliente buscarCliente(Integer id);
}
