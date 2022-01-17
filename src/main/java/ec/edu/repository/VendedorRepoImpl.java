package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Cliente;
import ec.edu.modelo.Vendedor;

@Repository
public class VendedorRepoImpl implements IVendedorRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarVendedor(Vendedor vendedor) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar1 = new Object[] { vendedor.getId(), vendedor.getNombre(), vendedor.getApellido(),
				vendedor.getVentas(), vendedor.getNumClientes() };
		this.jdbcTemplate.update(
				"	insert into vendedor(id, nombre, apellido, ventas, num_clientes) values (?,?,?,?,?)",
				datosAInsertar1);
	}

	@Override
	public void actualizarVendedor(Vendedor vendedor) {
		Object[] datosAActualizar = new Object[] { vendedor.getId(), vendedor.getNombre(), vendedor.getApellido(),
				vendedor.getVentas(), vendedor.getNumClientes(), vendedor.getId() };
		this.jdbcTemplate.update("update vendedor set id=?,nombre= ?, apellido=?, ventas=?, num_clientes=?  where id=?",
				datosAActualizar);
	}

	@Override
	public void eliminarVendedor(Integer id) {
		Object[] datoABorrar = new Object[] { id };

		this.jdbcTemplate.update("delete from vendedor where id =?", datoABorrar);
	}

	@Override
	public Vendedor buscarVendedor(Integer id) {
		Object[] datoABuscar = new Object[] { id };

		return this.jdbcTemplate.queryForObject("select * from vendedor where id =?", datoABuscar,
				new BeanPropertyRowMapper<Vendedor>(Vendedor.class));
	}

}
