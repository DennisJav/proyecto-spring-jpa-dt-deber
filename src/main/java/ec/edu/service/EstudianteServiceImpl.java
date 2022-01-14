package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Estudiante;
import ec.edu.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	@Autowired
	private IEstudianteRepo estudianteRepo;
	@Override
	public void estudianteNuevo(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertarEstudiante(estudiante);
	}

}
