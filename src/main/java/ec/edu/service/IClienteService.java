package ec.edu.service;

import ec.edu.modelo.Cliente;

public interface IClienteService {
	void clienteNuevo(Cliente cliente);
	void borrarClientePorID(Integer id);
	void actualizarCliente(Cliente Cliente);
	Cliente buscarClientePorID(Integer id);
}
