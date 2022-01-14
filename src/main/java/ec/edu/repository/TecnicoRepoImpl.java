package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Tecnico;
@Repository
public class TecnicoRepoImpl implements ITecnicoRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarTecnico(Tecnico tecnico) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {tecnico.getId(), tecnico.getNombre(), tecnico.getApellido(), tecnico.getArea(), tecnico.getCargo()};
		this.jdbcTemplate.update("	insert into tecnico(id, nombre, apellido, area, cargo) values (?,?,?,?,?)",
				datosAInsertar);
	}
	
}
