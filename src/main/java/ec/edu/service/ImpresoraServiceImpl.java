package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Impresora;
import ec.edu.repository.IImpresoraRepo;

@Service
public class ImpresoraServiceImpl implements IImpresoraService{
	@Autowired
	private IImpresoraRepo iImpresoraRepo;
	@Override
	public void impresoraNuevo(Impresora impresora) {
		// TODO Auto-generated method stub
		this.iImpresoraRepo.insertarImpresora(impresora);
	}

}
