package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Chofer;
import ec.edu.repository.IChoferRepo;

@Service
public class ChoferServiceImpl implements IChoferService{

	@Autowired
	private IChoferRepo choferRepo;
	
	@Override
	public void choferNuevo(Chofer chofer) {
		// TODO Auto-generated method stub
		this.choferRepo.insertarChofer(chofer);
	}
	
}
