package Taller;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona una opcion:");
		//System.out.println("Create, Read, Update, Delete");
		System.out.println("1. Citas: ");
		System.out.println("2. Empleados: ");
		System.out.println("3. Clientes: ");
		System.out.println("4. Vehiculos: ");
		System.out.println("5. Facturas: ");
		System.out.println("6. Guardar y salir: ");
		int opcion = sc.nextInt();
	
		switch(opcion) {
		
			case 1 -> {
				//System.out.println("Listar citas de hoy");
				System.out.println("Ver futuras citas");
				System.out.println("Agendar cita: ");
				System.out.println("Cancelar cita: ");
				System.out.println("Modificar cita: ");		
				
			}
			case 2 -> {
				int opcionE;
				System.out.println("1. Modificar empleado: ");
				opcionE = sc.nextInt();
				System.out.println("2. Contratar empleado: ");
				opcionE = sc.nextInt();
				System.out.println("3. Ver horario de un empleado");				
				opcionE = sc.nextInt();

				switch(opcionE){
					case 1 -> {
						System.out.println("Que empleado quieres modificar (indica el nombre)");
						String empleadoNombre = sc.nextLine();
						System.out.println("1. Modificar Nombre: ");
						System.out.println("2. Modificar Puesto: ");
						System.out.println("3. Modicar Sueldo: ");
						System.out.println("4. Modificar Turno");
						int modOpcion = sc.nextInt();
						switch(modOpcion){
							case 1 -> {
								System.out.println("Introduce nuevo nombre: ");
								String modNombre = sc.nextLine();
							}
							case 2 -> {
								System.out.println("Introduce nuevo Puesto: ");
								String modPuesto = sc.nextLine();
							}
							case 3 -> {
								System.out.println("Introduce nuevo sueldo: ");
								int modSueldo = sc.nextInt();
							}
							case 4 -> {
								System.out.println("Introduce nuevo turno: ");
								String modTurno = sc.nextLine();
							}
						}
					}
					case 2 -> {
						System.out.println("Nombre de Empleado: ");
						String nombre = sc.nextLine();
						System.out.println("Puesto: ");
						String puesto = sc.nextLine();
						System.out.println("Sueldo: ");
						int Sueldo = sc.nextInt();
						System.out.println("Turno: ");
						String turno = sc.nextLine();
						//Llamar metodo de taller/addEmpleado
					}
					case 3 -> {
						//Desglose lista de horarios
						//llamar metodo desglose horario
					}
				}
			}
			case 3 -> {
				//System.out.println("");
				System.out.println("Buscar: "); //Opcion de modificar despues.
				System.out.println("Añadir cliente: ");
				
			}
			case 4 -> {
				//System.out.println("");
				System.out.println("Buscar: "); 
				System.out.println("Añadir Vehiculo: ");
				
			}
			case 5 -> {
				//System.out.println("");
				System.out.println("Buscar por Cliente :");
				System.out.println("Buscar por ID factura: ");
				System.out.println("Buscar por matricula: ");
				System.out.println("Buscar por empleado:  ");
				System.out.println("Buscar por partes:  ");
			}
			
			
		}

	}
}
