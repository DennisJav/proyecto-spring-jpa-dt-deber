package ec.edu.repository;

import ec.edu.modelo.Computador;

public interface IComputadorRepo {

	void insertarComutador(Computador computador);
	void actualizarCompu(Computador computador);
	void eliminarCompu(String serie);
	Computador  buscarCompu(String serie);
}
