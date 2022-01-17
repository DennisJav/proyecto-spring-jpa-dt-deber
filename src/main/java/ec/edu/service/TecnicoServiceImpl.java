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
	@Override
	public void actualizarTecnicoPorID(Tecnico tecnico) {
		// TODO Auto-generated method stub
		this.tecnicoRepo.actualizarTecnico(tecnico);
	}
	@Override
	public void eliminarTecnico(Integer id) {
		// TODO Auto-generated method stub
		this.tecnicoRepo.eliminarTecnico(id);
	}
	@Override
	public Tecnico buscarTecnicoPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.tecnicoRepo.buscarTecnico(id);
	}

}
