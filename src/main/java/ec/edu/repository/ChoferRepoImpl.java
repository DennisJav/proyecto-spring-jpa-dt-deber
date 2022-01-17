package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Paciente;
@Repository
public class ChoferRepoImpl implements IChoferRepo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarChofer(Chofer chofer) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {chofer.getId(),chofer.getNombre(), chofer.getApellido(), chofer.getUnidad(),chofer.getTipoVehiculo()};
		this.jdbcTemplate.update("	insert into chofer ( id, nombre, apellido, unidad, tipo_vehiculo) values (?,?,?,?,?)",
				datosAInsertar);
	}
	@Override
	public Chofer buscarChofer(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABuscar = new Object[] { id };	
		
		return this.jdbcTemplate.queryForObject("select * from chofer where id =?", datoABuscar, new BeanPropertyRowMapper<Chofer>(Chofer.class));
		
	}
	
	
	@Override
	public void actualizarChofer(Chofer chofer) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] { chofer.getId(),chofer.getNombre(), chofer.getApellido(), chofer.getUnidad(),chofer.getTipoVehiculo(), chofer.getId() };
		this.jdbcTemplate.update("update chofer set id=?,nombre= ?, apellido=?, unidad=?, tipo_vehiculo=?  where id=?",
				datosAActualizar);
	}
	@Override
	public void borrarChofer(Integer id) {
		Object[] datoABorrar = new Object[] { id };

		this.jdbcTemplate.update("delete from chofer where id =?", datoABorrar);
	}

	
}
