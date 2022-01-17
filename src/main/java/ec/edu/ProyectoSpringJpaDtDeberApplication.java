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
		chofer1.setId(13);
		chofer1.setNombre("Juan1");
		chofer1.setApellido("Lopez1");
		chofer1.setUnidad("pxp123111");
		chofer1.setTipoVehiculo("Bus111");
		this.choferService.choferNuevo(chofer1);
//		this.choferService.actualizarChofer(chofer1);
//		this.choferService.borrarChoferPorID(12);
//		Chofer chofer2 =  this.choferService.buscarChoferPorID(12);
//		System.out.println("El chofer que esta buscando es: ");
//		System.out.println(chofer2);
		

		// DATOS CLIENTE
		Cliente cliente = new Cliente();
		cliente.setId(13);
		cliente.setNombre("Freddy111");
		cliente.setApellido("Trujillo11111");
		cliente.setCedula(123411);
		cliente.setMonto(12511111);
		this.clienteService.clienteNuevo(cliente);
//		this.clienteService.actualizarCliente(cliente);
//		this.clienteService.borrarClientePorID(12);
//		Cliente cliente1 = this.clienteService.buscarClientePorID(12);
//		System.out.println("El cliente que esta buscando es: ");
//		System.out.println(cliente1);

		// DATOS COMPUTADOR
		Computador compu = new Computador();
		compu.setSerie("A3");
		compu.setModelo("HP111");
		compu.setExistencias(11);
		compu.setDetalle("Pantalla");
		compu.setServicio("Cambio main");
		this.computadorService.computadorNuevo(compu);
//		this.computadorService.actualizarCompuPorID(compu);
//		this.computadorService.eliminarCompu("A2");
//		Computador compu1= this.computadorService.buscarCompuPorID("A2");
//		System.out.println("El computador que esta buscando es: ");
//		System.out.println(compu1);
		

		// DATOS ESTUDIANTE
		Estudiante estu = new Estudiante();
		estu.setId(13);
		estu.setNombre("Pedro1111");
		estu.setApellido("Azul1111");
		estu.setCedula(156);
		estu.setEspecialidad("Medicina-obste");
		this.estudianteService.estudianteNuevo(estu);
//		this.estudianteService.actualizarEstudiantePorID(estu);
//		this.estudianteService.eliminarEstudiante(12);
//		Estudiante estu1 = this.estudianteService.buscarEstudiantePorID(12);
//		System.out.println("El estudiante que esta buscando es: ");
//		System.out.println(estu1);

		// DATOS FACULTAD
		Facultad facu = new Facultad();
		facu.setId(13);
		facu.setCarrera("Ingenieria111");
		facu.setNumAlumnos(150);
		facu.setNumProfesores(10);
		facu.setCalificaciones(15);
		this.facultadService.facultadNuevo(facu);
//		this.facultadService.actualizarFacultadPorID(facu);
//		this.facultadService.eliminarFacultad(12);
//		Facultad facu1= this.facultadService.buscarFacultadPorID(12);
//		System.out.println("La facultad que esta buscando es: ");
//		System.out.println(facu1);

		// DATOS HOSPITAL
		Hospital hosp = new Hospital();
		hosp.setId(13);
		hosp.setDirector("Lizeth");
		hosp.setEspecialidad("Obstetricia");
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
		impr.setSerie("13");
		impr.setModelo("CANON");
		impr.setDanio("Escaner - todo");
		impr.setServicio("Reparacion - venta");
		impr.setMonto(80);
		this.iImpresoraService.impresoraNuevo(impr);
//		this.iImpresoraService.actualizarImpresoraPorID(impr);
//		this.iImpresoraService.eliminarImpresora("12");
//		Impresora impr1 = this.iImpresoraService.buscarImpresoraPorID("12");
//		System.out.println("La impresora que esta buscando es: ");
//		System.out.println(impr1);
		

		// DATOS TECNICO
		Tecnico tec = new Tecnico();
		tec.setId(13);
		tec.setNombre("Dennis jav");
		tec.setApellido("Tapia ortz");
		tec.setCargo("Jefe - unico xD");
		tec.setArea("Informatica - y mas");
		this.iTecnicoService.tecnicoNuevo(tec);
//		this.iTecnicoService.actualizarTecnicoPorID(tec);
//		this.iTecnicoService.eliminarTecnico(12);
//		Tecnico tec2= this.iTecnicoService.buscarTecnicoPorID(12);
//		System.out.println("El tecnico que esta buscando es: ");
//		System.out.println(tec2);

		// DATOS VENDEDOR
		Vendedor vend = new Vendedor();
		vend.setId(13);
		vend.setNombre("Eri");
		vend.setApellido("Imba111111");
		vend.setNumClientes(10);
		vend.setVentas(100);
		this.iVendedorService.vendedorNuevo(vend);
//		this.iVendedorService.eliminarVendedor(12);
//		this.iVendedorService.actualizarVendedorPorID(vend);
//		Vendedor v1 = this.iVendedorService.buscarVendedorPorID(12);
//		System.out.println("El vendedor que esta buscando es: ");
//		System.out.println(v1);

		// DATOS PACIENte
		Paciente paciente1 = new Paciente();
		paciente1.setId(13);
		paciente1.setNombre("Javier");
		paciente1.setApellido("Ortiz - tapia");
		paciente1.setEdad(28);
		this.pacienteService.pacienteNuevo(paciente1);
		// this.pacienteService.borrarPacientePorID(1);
		// this.pacienteService.actualizarPaciente(paciente1);
		// Paciente p1 = this.pacienteService.buscarPacientePorId(78);
		// System.out.println("El paciente que esta buscando es: ");
		// System.out.println(p1);
	}

}
