package ec.edu.repository;

import ec.edu.modelo.Facultad;

public interface IFacultadRepo {
	void insertarFacultad(Facultad facultad);
	void actualizarFacultad(Facultad facultad);
	void eliminarFacultad(Integer id);
	Facultad buscarFacultad(Integer id);
}
