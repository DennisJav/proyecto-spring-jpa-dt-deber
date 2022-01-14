package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
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

	
}
