package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Computador;
import ec.edu.repository.IComputadorRepo;

@Service
public class ComputadorServiceImpl implements IComputadorService {

	@Autowired
	private IComputadorRepo computadorRepo;

	@Override
	public void computadorNuevo(Computador computador) {
		// TODO Auto-generated method stub
		this.computadorRepo.insertarComutador(computador);
	}

	@Override
	public void actualizarCompuPorID(Computador computador) {
		// TODO Auto-generated method stub
		this.computadorRepo.actualizarCompu(computador);
	}

	@Override
	public void eliminarCompu(String serie) {
		// TODO Auto-generated method stub
		this.computadorRepo.eliminarCompu(serie);
	}

	@Override
	public Computador buscarCompuPorID(String serie) {
		// TODO Auto-generated method stub
		return this.computadorRepo.buscarCompu(serie);
	}

}
