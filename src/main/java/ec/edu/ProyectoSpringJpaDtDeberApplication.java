package ec.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.modelo.Chofer;
import ec.edu.modelo.Cliente;
import ec.edu.modelo.Computador;
import ec.edu.modelo.Estudiante;
import ec.edu.modelo.Facultad;
import ec.edu.modelo.Hospital;
import ec.edu.modelo.Impresora;
import ec.edu.modelo.Paciente;
import ec.edu.modelo.Tecnico;
import ec.edu.modelo.Vendedor;
import ec.edu.service.IChoferService;
import ec.edu.service.IClienteService;
import ec.edu.service.IComputadorService;
import ec.edu.service.IEstudianteService;
import ec.edu.service.IFacultadService;
import ec.edu.service.IHospitalService;
import ec.edu.service.IImpresoraService;
import ec.edu.service.IPacienteService;
import ec.edu.service.ITecnicoService;
import ec.edu.service.IVendedorService;

@SpringBootApplication
public class ProyectoSpringJpaDtDeberApplication implements CommandLineRunner{

	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IChoferService choferService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IComputadorService computadorService;
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IFacultadService facultadService;
	@Autowired
	private IHospitalService hospitalService;
	@Autowired
	private IImpresoraService iImpresoraService;
	@Autowired
	private ITecnicoService iTecnicoService;
	@Autowired
	private IVendedorService iVendedorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaDtDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//DATOS CHOFER
		Chofer chofer1=new Chofer();
		chofer1.setId(12);
		chofer1.setNombre("Juan");
		chofer1.setApellido("Lopez");
		chofer1.setUnidad("pxp123");
		chofer1.setTipoVehiculo("Bus");
		this.choferService.choferNuevo(chofer1);
		
		//DATOS CLIENTE
		Cliente cliente=new Cliente();
		cliente.setId(12);
		cliente.setNombre("Freddy");
		cliente.setApellido("Trujillo");
		cliente.setCedula(12345654);
		cliente.setMonto(125);
		this.clienteService.clienteNuevo(cliente);
		
		//DATOS COMPUTADOR
		Computador compu=new Computador();
		compu.setSerie("A2");
		compu.setModelo("HP");
		compu.setExistencias(1);
		compu.setDetalle("Pantalla rota");
		compu.setServicio("Cambio pantalla");
		this.computadorService.computadorNuevo(compu);
		
		//DATOS ESTUDIANTE
		Estudiante estu=new Estudiante();
		estu.setId(12);
		estu.setNombre("Pedro");
		estu.setApellido("Azul");
		estu.setCedula(123456);
		estu.setEspecialidad("Medicina");
		this.estudianteService.estudianteNuevo(estu);

		//DATOS FACULTAD
		Facultad facu=new Facultad();
		facu.setId(12);
		facu.setCarrera("Ingenieria");
		facu.setNumAlumnos(120);
		facu.setNumProfesores(5);
		facu.setCalificaciones(17);
		this.facultadService.facultadNuevo(facu);
		
		//DATOS HOSPITAL
		Hospital hosp=new Hospital();
		hosp.setId(12);
		hosp.setDirector("Liz");
		hosp.setEspecialidad("Obstetrico");
		hosp.setNumEmpleados(25);
		hosp.setNumPacientes(50);
		this.hospitalService.hospitalNuevo(hosp);
		
		//DATOS IMPRESORA
		Impresora impr=new Impresora();
		impr.setSerie("12");
		impr.setModelo("EPSON");
		impr.setDanio("Escaner");
		impr.setServicio("Reparacion");
		impr.setMonto(45);
		this.iImpresoraService.impresoraNuevo(impr);
		
		//DATOS TECNICO
		Tecnico tec=new Tecnico();
		tec.setId(12);
		tec.setNombre("Denis");
		tec.setApellido("Tapia");
		tec.setCargo("Jefe");
		tec.setArea("Informatica");
		this.iTecnicoService.tecnicoNuevo(tec);
		
		//DATOS VENDEDOR
		Vendedor vend=new Vendedor();
		vend.setId(12);
		vend.setNombre("Eri");
		vend.setApellido("Imba");
		vend.setNumClientes(100);
		vend.setVentas(10000);
		this.iVendedorService.vendedorNuevo(vend);
		
		
		//DATOS PACIENte
		Paciente paciente1=new Paciente();
		paciente1.setId(12);
		paciente1.setNombre("Javiers");
		paciente1.setApellido("Ortiz");
		paciente1.setEdad(27);
		this.pacienteService.pacienteNuevo(paciente1);
		
	}

}
