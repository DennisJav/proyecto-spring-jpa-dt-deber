package ec.edu.repository;

import ec.edu.modelo.Tecnico;

public interface ITecnicoRepo {
	void insertarTecnico(Tecnico tecnico);
	void actualizarTecnico(Tecnico tecnico);
	void eliminarTecnico(Integer id);
	Tecnico buscarTecnico(Integer id);
}
