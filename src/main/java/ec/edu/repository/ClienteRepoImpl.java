package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Cliente;
@Repository
public class ClienteRepoImpl implements IClienteRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {cliente.getId(),cliente.getNombre(), cliente.getApellido(), cliente.getCedula(),cliente.getMonto()};
		this.jdbcTemplate.update("	insert into cliente(id , nombre, apellido, cedula, monto) values (?,?,?,?,?)",
				datosAInsertar);
	}
	
	

}
