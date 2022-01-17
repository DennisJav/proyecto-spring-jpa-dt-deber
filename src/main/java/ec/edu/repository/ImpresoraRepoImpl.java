package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Impresora;

@Repository
public class ImpresoraRepoImpl implements IImpresoraRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertarImpresora(Impresora impresora) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] { impresora.getSerie(), impresora.getModelo(), impresora.getDanio(),
				impresora.getServicio(), impresora.getMonto() };
		this.jdbcTemplate.update("	insert into impresora(serie, modelo, danio, servicio, monto) values (?,?,?,?,?)",
				datosAInsertar);
	}

	@Override
	public void actualizarImpresora(Impresora impresora) {
		Object[] datosAActualizar = new Object[] { impresora.getSerie(), impresora.getModelo(), impresora.getDanio(),
				impresora.getServicio(), impresora.getMonto(), impresora.getSerie() };
		this.jdbcTemplate.update("update impresora set serie=?, modelo= ?, danio=?, servicio=?, monto=?  where serie=?",
				datosAActualizar);

	}

	@Override
	public void eliminarImpresora(String serie) {
		Object[] datoABorrar = new Object[] { serie };

		this.jdbcTemplate.update("delete from impresora where serie =?", datoABorrar);
	}

	@Override
	public Impresora buscarImpresora(String serie) {
		Object[] datoABuscar = new Object[] { serie };

		return this.jdbcTemplate.queryForObject("select * from impresora where serie =?", datoABuscar,
				new BeanPropertyRowMapper<Impresora>(Impresora.class));
	}

}
