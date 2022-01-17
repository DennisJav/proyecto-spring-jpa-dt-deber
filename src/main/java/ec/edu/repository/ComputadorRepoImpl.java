package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Computador;

@Repository
public class ComputadorRepoImpl implements IComputadorRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarComutador(Computador computador) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] { computador.getSerie(), computador.getModelo(),
				computador.getExistencias(), computador.getDetalle(), computador.getServicio() };
		this.jdbcTemplate.update(
				"	insert into computador(serie , modelo, existencias, detalle, servicio) values (?,?,?,?,?)",
				datosAInsertar);
	}

	@Override
	public void actualizarCompu(Computador computador) {
		Object[] datosAActualizar = new Object[] { computador.getSerie(), computador.getModelo(),
				computador.getExistencias(), computador.getDetalle(), computador.getServicio(), computador.getSerie() };
		this.jdbcTemplate.update(
				"update computador set serie=?,modelo= ?, existencias=?, detalle=?, servicio=?  where serie=?",
				datosAActualizar);
	}

	@Override
	public void eliminarCompu(String serie) {
		Object[] datoABorrar = new Object[] { serie };

		this.jdbcTemplate.update("delete from computador where serie =?", datoABorrar);
	}

	@Override
	public Computador buscarCompu(String serie) {
		Object[] datoABuscar = new Object[] { serie };

		return this.jdbcTemplate.queryForObject("select * from computador where serie =?", datoABuscar,
				new BeanPropertyRowMapper<Computador>(Computador.class));
	}

}
