package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Cliente;
import ec.edu.modelo.Tecnico;

@Repository
public class TecnicoRepoImpl implements ITecnicoRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarTecnico(Tecnico tecnico) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] { tecnico.getId(), tecnico.getNombre(), tecnico.getApellido(),
				tecnico.getArea(), tecnico.getCargo() };
		this.jdbcTemplate.update("	insert into tecnico(id, nombre, apellido, area, cargo) values (?,?,?,?,?)",
				datosAInsertar);
	}

	@Override
	public void actualizarTecnico(Tecnico tecnico) {
		Object[] datosAActualizar = new Object[] { tecnico.getId(), tecnico.getNombre(), tecnico.getApellido(),
				tecnico.getArea(), tecnico.getCargo(), tecnico.getId() };
		this.jdbcTemplate.update("update tecnico set id=?,nombre= ?, apellido=?, area=?, cargo=?  where id=?",
				datosAActualizar);

	}

	@Override
	public void eliminarTecnico(Integer id) {
		Object[] datoABorrar = new Object[] { id };

		this.jdbcTemplate.update("delete from tecnico where id =?", datoABorrar);
	}

	@Override
	public Tecnico buscarTecnico(Integer id) {
		Object[] datoABuscar = new Object[] { id };

		return this.jdbcTemplate.queryForObject("select * from tecnico where id =?", datoABuscar,
				new BeanPropertyRowMapper<Tecnico>(Tecnico.class));
	}

}
