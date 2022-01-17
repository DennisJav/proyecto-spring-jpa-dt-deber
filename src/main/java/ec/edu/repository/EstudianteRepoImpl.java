package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
				estudiante.getCedula(), estudiante.getEspecialidad() };
		this.jdbcTemplate.update(
				"	insert into estudiante(id, nombre, apellido, cedula, especialidad) values (?,?,?,?,?)",
				datosAInsertar);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		Object[] datosAActualizar = new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
				estudiante.getCedula(), estudiante.getEspecialidad(), estudiante.getId() };
		this.jdbcTemplate.update(
				"update estudiante set id=?,nombre= ?, apellido=?, cedula=?, especialidad=?  where id=?",
				datosAActualizar);
	}

	@Override
	public void eliminarEstudiante(Integer id) {
		Object[] datoABorrar = new Object[] { id };

		this.jdbcTemplate.update("delete from estudiante where id =?", datoABorrar);
	}

	@Override
	public Estudiante buscarEstudiante(Integer id) {
		Object[] datoABuscar = new Object[] { id };

		return this.jdbcTemplate.queryForObject("select * from estudiante where id =?", datoABuscar,
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

}
