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
public class ProyectoSpringJpaDtDeberApplication implements CommandLineRunner {

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

		// DATOS CHOFER
		Chofer chofer1 = new Chofer();
		chofer1.setId(12);
		chofer1.setNombre("Juan");
		chofer1.setApellido("Lopez");
		chofer1.setUnidad("pxp123");
		chofer1.setTipoVehiculo("Bus");
		this.choferService.choferNuevo(chofer1);
		this.choferService.actualizarChofer(chofer1);
		this.choferService.borrarChoferPorID(12);
		Chofer chofer2 =  this.choferService.buscarChoferPorID(12);
//		System.out.println("El chofer que esta buscando es: ");
//		System.out.println(chofer2);
		

		// DATOS CLIENTE
		Cliente cliente = new Cliente();
		cliente.setId(12);
		cliente.setNombre("Freddy");
		cliente.setApellido("Trujillo");
		cliente.setCedula(12345654);
		cliente.setMonto(125);
		this.clienteService.clienteNuevo(cliente);
//		this.clienteService.actualizarCliente(cliente);
//		this.clienteService.borrarClientePorID(12);
//		Cliente cliente1 = this.clienteService.buscarClientePorID(12);
//		System.out.println("El cliente que esta buscando es: ");
//		System.out.println(cliente1);

		// DATOS COMPUTADOR
		Computador compu = new Computador();
		compu.setSerie("A2");
		compu.setModelo("HP");
		compu.setExistencias(1);
		compu.setDetalle("Pantalla rota");
		compu.setServicio("Cambio pantalla");
		this.computadorService.computadorNuevo(compu);
//		this.computadorService.actualizarCompuPorID(compu);
//		this.computadorService.eliminarCompu("A2");
//		Computador compu1= this.computadorService.buscarCompuPorID("A2");
//		System.out.println("El computador que esta buscando es: ");
//		System.out.println(compu1);
		

		// DATOS ESTUDIANTE
		Estudiante estu = new Estudiante();
		estu.setId(12);
		estu.setNombre("Pedro");
		estu.setApellido("Azul");
		estu.setCedula(123456);
		estu.setEspecialidad("Medicina");
		this.estudianteService.estudianteNuevo(estu);
//		this.estudianteService.actualizarEstudiantePorID(estu);
//		this.estudianteService.eliminarEstudiante(12);
//		Estudiante estu1 = this.estudianteService.buscarEstudiantePorID(12);
//		System.out.println("El estudiante que esta buscando es: ");
//		System.out.println(estu1);

		// DATOS FACULTAD
		Facultad facu = new Facultad();
		facu.setId(12);
		facu.setCarrera("Ingenieria");
		facu.setNumAlumnos(120);
		facu.setNumProfesores(5);
		facu.setCalificaciones(17);
		this.facultadService.facultadNuevo(facu);
//		this.facultadService.actualizarFacultadPorID(facu);
//		this.facultadService.eliminarFacultad(12);
//		Facultad facu1= this.facultadService.buscarFacultadPorID(12);
//		System.out.println("La facultad que esta buscando es: ");
//		System.out.println(facu1);

		// DATOS HOSPITAL
		Hospital hosp = new Hospital();
		hosp.setId(12);
		hosp.setDirector("Liz");
		hosp.setEspecialidad("Obstetrico");
		hosp.setNumEmpleados(25);
		hosp.setNumPacientes(50);
		this.hospitalService.hospitalNuevo(hosp);
//		this.hospitalService.actualizarHospitalPorID(hosp);
//		this.hospitalService.eliminarHospital(12);
//		Hospital hosp1 =  this.hospitalService.buscarHospitalPorID(12);
//		System.out.println("El hospital que esta buscando es: ");
//		System.out.println(hosp1);
		
		
		
		// DATOS IMPRESORA
		Impresora impr = new Impresora();
		impr.setSerie("12");
		impr.setModelo("EPSON");
		impr.setDanio("Escaner");
		impr.setServicio("Reparacion");
		impr.setMonto(45);
		this.iImpresoraService.impresoraNuevo(impr);
//		this.iImpresoraService.actualizarImpresoraPorID(impr);
//		this.iImpresoraService.eliminarImpresora("12");
//		Impresora impr1 = this.iImpresoraService.buscarImpresoraPorID("12");
//		System.out.println("La impresora que esta buscando es: ");
//		System.out.println(impr1);
		

		// DATOS TECNICO
		Tecnico tec = new Tecnico();
		tec.setId(12);
		tec.setNombre("Denis");
		tec.setApellido("Tapia");
		tec.setCargo("Jefe");
		tec.setArea("Informatica");
		this.iTecnicoService.tecnicoNuevo(tec);
//		this.iTecnicoService.actualizarTecnicoPorID(tec);
//		this.iTecnicoService.eliminarTecnico(12);
//		Tecnico tec2= this.iTecnicoService.buscarTecnicoPorID(12);
//		System.out.println("El tecnico que esta buscando es: ");
//		System.out.println(tec2);

		// DATOS VENDEDOR
		Vendedor vend = new Vendedor();
		vend.setId(12);
		vend.setNombre("Eri");
		vend.setApellido("Imba");
		vend.setNumClientes(100);
		vend.setVentas(10000);
		this.iVendedorService.vendedorNuevo(vend);
//		this.iVendedorService.eliminarVendedor(12);
//		this.iVendedorService.actualizarVendedorPorID(vend);
//		Vendedor v1 = this.iVendedorService.buscarVendedorPorID(12);
//		System.out.println("El vendedor que esta buscando es: ");
//		System.out.println(v1);

		// DATOS PACIENte
		Paciente paciente1 = new Paciente();
		paciente1.setId(12);
		paciente1.setNombre("Javiers");
		paciente1.setApellido("Ortiz");
		paciente1.setEdad(27);
		this.pacienteService.pacienteNuevo(paciente1);
		// this.pacienteService.borrarPacientePorID(1);
		// this.pacienteService.actualizarPaciente(paciente1);
		// Paciente p1 = this.pacienteService.buscarPacientePorId(78);
		// System.out.println("El paciente que esta buscando es: ");
		// System.out.println(p1);
	}

}
