package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Hospital;

@Repository
public class HospitalRepoImpl implements IHospitalRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] { hospital.getId(), hospital.getEspecialidad(), hospital.getDirector(),
				hospital.getNumEmpleados(), hospital.getNumPacientes() };
		this.jdbcTemplate.update(
				"	insert into hospital(id, especialidad, director, num_empleados, num_pacientes) values (?,?,?,?,?)",
				datosAInsertar);
	}

	@Override
	public void actualizarHospital(Hospital hospital) {
		Object[] datosAActualizar = new Object[] { hospital.getId(), hospital.getEspecialidad(), hospital.getDirector(),
				hospital.getNumEmpleados(), hospital.getNumPacientes(), hospital.getId() };
		this.jdbcTemplate.update(
				"update hospital set id=?, especialidad= ?, director=?, num_empleados=?, num_pacientes  where id=?",
				datosAActualizar);
	}

	@Override
	public void eliminarHospital(Integer id) {
		Object[] datoABorrar = new Object[] { id };

		this.jdbcTemplate.update("delete from hospital where id =?", datoABorrar);
	}

	@Override
	public Hospital buscarHospital(Integer id) {
		Object[] datoABuscar = new Object[] { id };

		return this.jdbcTemplate.queryForObject("select * from hospital where id =?", datoABuscar,
				new BeanPropertyRowMapper<Hospital>(Hospital.class));
	}

}
