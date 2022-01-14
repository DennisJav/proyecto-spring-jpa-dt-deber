package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Estudiante;
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(), estudiante.getCedula(), estudiante.getEspecialidad()};
		this.jdbcTemplate.update("	insert into estudiante(id, nombre, apellido, cedula, especialidad) values (?,?,?,?,?)",
				datosAInsertar);
	}

}
