package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Hospital;
@Repository
public class HospitalRepoImpl implements IHospitalRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {hospital.getId(), hospital.getEspecialidad(), hospital.getDirector(), hospital.getNumEmpleados(), hospital.getNumPacientes()};
		this.jdbcTemplate.update("	insert into hospital(id, especialidad, director, num_empleados, num_pacientes) values (?,?,?,?,?)",
				datosAInsertar);
	}

}
