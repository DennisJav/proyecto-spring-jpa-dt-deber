package ec.edu.repository;

import ec.edu.modelo.Chofer;


public interface IChoferRepo {

	void insertarChofer(Chofer chofer);
	Chofer buscarChofer(Integer id);
	void actualizarChofer(Chofer chofer);
	void borrarChofer(Integer id);
}
