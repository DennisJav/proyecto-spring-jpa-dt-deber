package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Facultad;
import ec.edu.repository.IFacultadRepo;

@Service
public class FacultadServiceImpl implements IFacultadService {
	@Autowired
	private IFacultadRepo facultadRepo;

	@Override
	public void facultadNuevo(Facultad facultad) {
		// TODO Auto-generated method stub
		this.facultadRepo.insertarFacultad(facultad);
	}

	@Override
	public void actualizarFacultadPorID(Facultad facultad) {
		// TODO Auto-generated method stub
		this.facultadRepo.actualizarFacultad(facultad);
	}

	@Override
	public void eliminarFacultad(Integer id) {
		// TODO Auto-generated method stub
		this.facultadRepo.eliminarFacultad(id);
	}

	@Override
	public Facultad buscarFacultadPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.facultadRepo.buscarFacultad(id);
	}

}
