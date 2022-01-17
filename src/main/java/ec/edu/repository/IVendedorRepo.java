package ec.edu.repository;

import ec.edu.modelo.Vendedor;

public interface IVendedorRepo {
	void insertarVendedor(Vendedor vendedor);
	void actualizarVendedor(Vendedor vendedor);
	void eliminarVendedor(Integer id);
	Vendedor buscarVendedor(Integer id);
}
