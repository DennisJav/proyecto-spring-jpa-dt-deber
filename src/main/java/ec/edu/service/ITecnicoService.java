package ec.edu.service;

import ec.edu.modelo.Tecnico;

public interface ITecnicoService {
	void tecnicoNuevo(Tecnico tecnico);
	void actualizarTecnicoPorID(Tecnico tecnico);
	void eliminarTecnico(Integer id);
	Tecnico buscarTecnicoPorID(Integer id);
}
