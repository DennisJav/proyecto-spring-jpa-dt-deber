package ec.edu.repository;

import ec.edu.modelo.Hospital;

public interface IHospitalRepo {
	void insertarHospital(Hospital hospital);
	void actualizarHospital(Hospital hospital);
	void eliminarHospital(Integer id);
	Hospital buscarHospital(Integer id);
}
