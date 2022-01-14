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

}
