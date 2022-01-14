package ec.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Impresora;
@Repository
public class ImpresoraRepoImpl implements IImpresoraRepo{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertarImpresora(Impresora impresora) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {impresora.getSerie(), impresora.getModelo(), impresora.getDanio(), impresora.getServicio(), impresora.getMonto()};
		this.jdbcTemplate.update("	insert into impresora(serie, modelo, danio, servicio, monto) values (?,?,?,?,?)",
				datosAInsertar);
	}
	
}
