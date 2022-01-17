package ec.edu.service;

import ec.edu.modelo.Hospital;

public interface IHospitalService {
	void hospitalNuevo(Hospital hospital);
	void actualizarHospitalPorID(Hospital hospital);
	void eliminarHospital(Integer id);
	Hospital buscarHospitalPorID(Integer id);
}
