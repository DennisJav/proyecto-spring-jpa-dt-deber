package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Computador;
@Repository
public class ComputadorRepoImpl implements IComputadorRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarComutador(Computador computador) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {computador.getSerie(), computador.getModelo(), computador.getExistencias(), computador.getDetalle(), computador.getServicio()};
		this.jdbcTemplate.update("	insert into computador(serie , modelo, existencias, detalle, servicio) values (?,?,?,?,?)",
				datosAInsertar);
	}

}
