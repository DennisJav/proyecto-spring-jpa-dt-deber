package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Facultad;

@Repository
public class FacultadRepoImpl implements IFacultadRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] { facultad.getId(), facultad.getCarrera(), facultad.getNumAlumnos(),
				facultad.getNumProfesores(), facultad.getCalificaciones() };
		this.jdbcTemplate.update(
				"	insert into facultad(id, carrera, num_alumnos, num_profesores, calificaciones) values (?,?,?,?,?)",
				datosAInsertar);
	}

	@Override
	public void actualizarFacultad(Facultad facultad) {
		Object[] datosAActualizar = new Object[] { facultad.getId(), facultad.getCarrera(), facultad.getNumAlumnos(),
				facultad.getNumProfesores(), facultad.getCalificaciones(), facultad.getId() };
		this.jdbcTemplate.update(
				"update facultad set id=?, carrera= ?, num_alumnos=?, num_profesores=?, calificaciones=?  where id=?",
				datosAActualizar);

	}

	@Override
	public void eliminarFacultad(Integer id) {
		Object[] datoABorrar = new Object[] { id };

		this.jdbcTemplate.update("delete from facultad where id =?", datoABorrar);
	}

	@Override
	public Facultad buscarFacultad(Integer id) {
		Object[] datoABuscar = new Object[] { id };

		return this.jdbcTemplate.queryForObject("select * from facultad where id =?", datoABuscar,
				new BeanPropertyRowMapper<Facultad>(Facultad.class));
	}

}
