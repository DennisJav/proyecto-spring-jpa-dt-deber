package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Chofer;
import ec.edu.repository.IChoferRepo;

@Service
public class ChoferServiceImpl implements IChoferService {

	@Autowired
	private IChoferRepo choferRepo;

	@Override
	public void choferNuevo(Chofer chofer) {
		// TODO Auto-generated method stub
		this.choferRepo.insertarChofer(chofer);
	}

	@Override
	public Chofer buscarChoferPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.choferRepo.buscarChofer(id);
	}

	@Override
	public void actualizarChofer(Chofer chofer) {
		// TODO Auto-generated method stub
		this.choferRepo.actualizarChofer(chofer);
	}

	@Override
	public void borrarChoferPorID(Integer id) {
		// TODO Auto-generated method stub
		this.choferRepo.borrarChofer(id);
	}

}
