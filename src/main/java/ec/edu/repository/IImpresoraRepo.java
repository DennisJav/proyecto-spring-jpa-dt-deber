package ec.edu.repository;

import ec.edu.modelo.Impresora;

public interface IImpresoraRepo {
	void insertarImpresora(Impresora impresora);
	void actualizarImpresora(Impresora impresora);
	void eliminarImpresora(String serie);
	Impresora buscarImpresora(String serie);
}
