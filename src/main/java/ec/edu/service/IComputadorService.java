package ec.edu.service;

import ec.edu.modelo.Computador;

public interface IComputadorService {
	void computadorNuevo(Computador computador);
	void actualizarCompuPorID(Computador computador);
	void eliminarCompu(String serie);
	Computador  buscarCompuPorID(String serie);
}
