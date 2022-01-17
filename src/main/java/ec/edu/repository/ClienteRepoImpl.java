package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Cliente;

@Repository
public class ClienteRepoImpl implements IClienteRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] { cliente.getId(), cliente.getNombre(), cliente.getApellido(),
				cliente.getCedula(), cliente.getMonto() };
		this.jdbcTemplate.update("	insert into cliente(id , nombre, apellido, cedula, monto) values (?,?,?,?,?)",
				datosAInsertar);
	}

	@Override
	public void borrarCliente(Integer id) {
		Object[] datoABorrar = new Object[] { id };

		this.jdbcTemplate.update("delete from cliente where id =?", datoABorrar);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		
		Object[] datosAActualizar = new Object[] { cliente.getId(), cliente.getNombre(), cliente.getApellido(),
				cliente.getCedula(), cliente.getMonto(), cliente.getId() };
		this.jdbcTemplate.update("update cliente set id=?,nombre= ?, apellido=?, cedula=?, monto=?  where id=?",
				datosAActualizar);
	}

	@Override
	public Cliente buscarCliente(Integer id) {
		// TODO Auto-generated method stub
		Object[] datoABuscar = new Object[] { id };

		return this.jdbcTemplate.queryForObject("select * from cliente where id =?", datoABuscar,
				new BeanPropertyRowMapper<Cliente>(Cliente.class));
	}

}
