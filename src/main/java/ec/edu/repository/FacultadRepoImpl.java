package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

}
