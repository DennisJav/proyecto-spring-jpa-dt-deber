package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Vendedor;
@Repository
public class VendedorRepoImpl implements IVendedorRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarVendedor(Vendedor vendedor) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar1 = new Object[] {vendedor.getId(), vendedor.getNombre(), vendedor.getApellido(), vendedor.getVentas(), vendedor.getNumClientes()};
		this.jdbcTemplate.update("	insert into vendedor(id, nombre, apellido, ventas, num_clientes) values (?,?,?,?,?)",
				datosAInsertar1);
	}
	
}
