/*DESARROLLO: Fernandez Leandro Ezequiel
 * ULTIMA ACTUALIZACIÓN: 3-8-22
 * Algoritmo que solicita el ingreso de un nombre (profesor) y la cantidad de alumnos a registrar
 * luego solicita el nombre de cada alumno de forma individual y su respectiva nota. Luego una vez concludia el alta de los datos
 * Mostrar por pantalla el nombre de alumnos y sus notas y si fueron aprobados o no.*/
package Paquete;
//IMPORTAMOS LA CLASE SCANNER PARA UTILIZAR EL TECLADO COMO METODO DE INGRESO DE VALORES
import java.util.Scanner;
//CLASE PRINCIPAL
public class VariablesArraysa {
	//METODO MAIN PRINCIPAL
	public static void main(String[] args) {
		//CREAMOS EL OBJETO DE ENTRADA PARA INGRESAR VALORES
		Scanner  entrada = new Scanner(System.in);
		//VARIABLE NOMBRE PARA ALMACENAR EL NOMBRE DEL PROFESOR
		String nombre="";
		// VARIABLES DE TIPO ENTERO PARA LA CANTIDAD DE ALUMNOS QUE DETERMINA EL TAMAÑO DEL ARRAYS, NOTA_ALUMN PARA DETERMINAR LA NOTA FINAL DEL ALUMNO
		int cantidad_alumnos, nota_alumno=0;
		
		//MENSAJE DE BIENVENIDA
		System.out.println("Bienvenido al sistema de colegios!!");
		
		/*Validador de nombre solo admite letras y no numeros o caracteres especiales */
		
		while (nombre.equals("")) {
			System.out.println("ingrese su nombre: ");
			nombre=entrada.nextLine();	
			if (!nombre.matches("[A-Za-z ]*$")) {
				nombre="";
			}
		}
		/* FIN	Validador de nombre solo admite letras y no numeros o caracteres especiales */

		//MENSAJE PERSONALIZADO
		System.out.println("Bienvenido al sistema de colegios "+nombre);
		
		//SOLICITUD DE LA CANTIDAD DE ALUMNOS
		System.out.print("Ingrese la cantidad de alumnos: ");
		cantidad_alumnos=entrada.nextInt();
		
		//ARRAYS PARA GUARDAR LOS NOMBRES Y NOTAS DE LOS ALUMNOS
		String [] alumnos= new String [cantidad_alumnos];
		int [] notas_alumnos=new int [cantidad_alumnos];
		
		//CICLO FOR PARA ALMACENAR LA CANTIDAD DE ALUMNOS CON SUS NOMBRES Y NOTAS
		for (int i=0;i<cantidad_alumnos;i++) {
			
			//Declaro la variable nombre_alum para los nombres de los alumnos.
			String nombre_alum="";
			
			/*Validador de nombre solo admite letras y no numeros o caracteres especiales */
			while (nombre_alum.equals("")) {
				System.out.println("Ingrese el nombre del alumno: ");
				nombre_alum=entrada.nextLine();	
				if (!nombre_alum.matches("[A-Za-z ]*$")) {
					nombre_alum="";
				}
			}
			/* FIN Validador de nombre solo admite letras y no numeros o caracteres especiales */
			
			
			//AGREGAMOS EL NOMBRE DEL ALUMNO AL ARRAYS
			alumnos[i]=nombre_alum;
			
			//SE SOLICITA LA NOTA DEL ALUMNO
			System.out.print("Ingrese la nota del alumno "+alumnos[i]+": ");
			
			
			//VERIFICAMOS QUE LA NOTA NO SEA MAYOR A 10 O MENOR A 1
			do {
				nota_alumno=entrada.nextInt();
			} while (nota_alumno==0 || nota_alumno>10);
			
			//AGREGAMOS LA NOTA A EL ARRAYS DE NOTAS.
			notas_alumnos[i]=nota_alumno;	
		}
		
		
		//CICLO FOR PARA MOSTRAR LOS DATOS DE LOS ARRAYS CON LOS DATOS CARGADOS (NOMBRES Y NOTAS!!!)
		for (int j=0;j<cantidad_alumnos;j++) {	
			if (notas_alumnos[j]>6) {
				System.out.println("El alumno: "+alumnos[j]+" Fue aprobado con: "+notas_alumnos[j]);
			}else {
				System.out.println("El alumno "+alumnos[j]+ " Desaprobo con: "+notas_alumnos[j]);
			}
			
		}
	}

}
