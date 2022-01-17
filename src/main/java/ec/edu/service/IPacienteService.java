package ec.edu.service;

import ec.edu.modelo.Paciente;

public interface IPacienteService {
	void pacienteNuevo(Paciente paciente);
	Paciente buscarPacientePorID(Integer id);
	void actualizarPaciente(Paciente paciente);
	void borrarPacientePorID(Integer id);
}
