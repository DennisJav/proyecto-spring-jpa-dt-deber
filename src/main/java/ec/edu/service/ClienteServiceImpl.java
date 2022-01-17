package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Cliente;
import ec.edu.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void clienteNuevo(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertarCliente(cliente);
	}

	@Override
	public void borrarClientePorID(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrarCliente(id);
	}

	@Override
	public void actualizarCliente(Cliente Cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizarCliente(Cliente);
	}

	@Override
	public Cliente buscarClientePorID(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarCliente(id);
	}

}
