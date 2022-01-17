package ec.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.modelo.Hospital;
import ec.edu.repository.IHospitalRepo;

@Service
public class HospitalServiceImpl implements IHospitalService{
	@Autowired
	private IHospitalRepo hospitalRepo;
	@Override
	public void hospitalNuevo(Hospital hospital) {
		// TODO Auto-generated method stub
		this.hospitalRepo.insertarHospital(hospital);
	}
	@Override
	public void actualizarHospitalPorID(Hospital hospital) {
		// TODO Auto-generated method stub
		this.hospitalRepo.actualizarHospital(hospital);
	}
	@Override
	public void eliminarHospital(Integer id) {
		// TODO Auto-generated method stub
		this.hospitalRepo.eliminarHospital(id);
	}
	@Override
	public Hospital buscarHospitalPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.hospitalRepo.buscarHospital(id);
	}

}
