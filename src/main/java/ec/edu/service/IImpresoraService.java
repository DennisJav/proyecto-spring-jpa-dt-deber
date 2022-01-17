package ec.edu.service;

import ec.edu.modelo.Impresora;

public interface IImpresoraService {
	void impresoraNuevo(Impresora impresora);
	void actualizarImpresoraPorID(Impresora impresora);
	void eliminarImpresora(String serie);
	Impresora buscarImpresoraPorID(String serie);
}
