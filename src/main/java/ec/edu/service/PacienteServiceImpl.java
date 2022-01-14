package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Paciente;
import ec.edu.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void pacienteNuevo(Paciente paciente) {
		// TODO Auto-generated method stub
		
		this.pacienteRepo.insertarPaciente(paciente);
	}

}
