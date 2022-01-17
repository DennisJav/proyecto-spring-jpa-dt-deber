package ec.edu.repository;

import ec.edu.modelo.Estudiante;

public interface IEstudianteRepo {
	void insertarEstudiante(Estudiante estudiante);
	void actualizarEstudiante(Estudiante estudiante);
	void eliminarEstudiante(Integer id);
	Estudiante buscarEstudiante(Integer id);
}
