package ec.edu.service;

import ec.edu.modelo.Estudiante;

public interface IEstudianteService {
	void estudianteNuevo(Estudiante estudiante);
	void actualizarEstudiantePorID(Estudiante estudiante);
	void eliminarEstudiante(Integer id);
	Estudiante buscarEstudiantePorID(Integer id);
}
