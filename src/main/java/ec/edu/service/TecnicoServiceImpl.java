package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Tecnico;
import ec.edu.repository.ITecnicoRepo;

@Service
public class TecnicoServiceImpl implements ITecnicoService{
	@Autowired
	private ITecnicoRepo tecnicoRepo;
	@Override
	public void tecnicoNuevo(Tecnico tecnico) {
		// TODO Auto-generated method stub
		this.tecnicoRepo.insertarTecnico(tecnico);
	}

}
