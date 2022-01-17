package ec.edu.service;

import ec.edu.modelo.Vendedor;

public interface IVendedorService {
	void vendedorNuevo(Vendedor vendedor);
	void actualizarVendedorPorID(Vendedor vendedor);
	void eliminarVendedor(Integer id);
	Vendedor buscarVendedorPorID(Integer id);
}
