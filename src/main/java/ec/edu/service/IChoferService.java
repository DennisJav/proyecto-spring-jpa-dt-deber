package ec.edu.service;

import ec.edu.modelo.Chofer;

public interface IChoferService {
	void choferNuevo(Chofer chofer);
	Chofer buscarChoferPorID(Integer id);
	void actualizarChofer(Chofer chofer);
	void borrarChoferPorID(Integer id);
}
