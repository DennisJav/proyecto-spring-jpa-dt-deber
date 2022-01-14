package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Vendedor;
import ec.edu.repository.IVendedorRepo;

@Service
public class VendedorServiceImpl implements IVendedorService{
	@Autowired
	private IVendedorRepo vendedorRepo;
	
	@Override
	public void vendedorNuevo(Vendedor vendedor) {
		// TODO Auto-generated method stub
		this.vendedorRepo.insertarVendedor(vendedor);
	}

}
