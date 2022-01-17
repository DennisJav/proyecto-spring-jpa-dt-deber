package ec.edu.service;

import ec.edu.modelo.Facultad;

public interface IFacultadService {
	void facultadNuevo(Facultad facultad);
	void actualizarFacultadPorID(Facultad facultad);
	void eliminarFacultad(Integer id);
	Facultad buscarFacultadPorID(Integer id);
}
