/*
Este algoritmo funciona para poder almacenar en 2 arrays una cantidad de alumnos definida por el usuario
para anotar las notas  del estudiante primero se solicita el nomnbre del profesor despues la cantidad de alumnos
luego el nombre de cada alumnos y finalmente la nota de cada alumno. 
**/
/*Autor: Leandro Ezequiel Fernandez 25-7-2022*/
package Paquete;

import java.util.Scanner;

public class Profesor {
	public static void main(String[] args) {
		int cantidad_alumnos;// Esta variable funciona como control de la cantidad de alumnos y dimension de los arrays
		String alumno="";//Con esta variable le asignamos a cada elemento en el arrays el nombre a cada alumno
		Scanner entradaScanner=new Scanner(System.in); //creo el objeto para ingresar los valores por teclado
		String nombre="";//Variable para el nombre del profesor
		System.out.print("Escriba su noombre: " );
		nombre=entradaScanner.next();//Solicitud del dnombre del profesor
		System.out.println("Bienvenido Profesor: "+nombre+"!!!");
		System.out.println("Ingrese la cantidad de alumnos: ");
		cantidad_alumnos=entradaScanner.nextInt();//solicitamos la cantidad de alumnos
		String [] nombres_alumnos =new String [cantidad_alumnos];//Arrays para almacenar los nombres de los alumnos
		int [] notas_alumnoStrings= new int [cantidad_alumnos];//Arrays para almacenar las notas de los alumnos
		for (int i=0; i<cantidad_alumnos;i++) {//Con este ciclo almacenamos los nombres y notas para almacenar uno a uno
			System.out.println("Ingrese el nombre del alumno "+(i+1));//Todas las notas de los alumnos y sus nombres
			alumno=entradaScanner.next();//ingresamos el nombre del alumono
			nombres_alumnos[i]=alumno;	//ahora lo alacenamos el el arrays utilizando la variable i
			System.out.println("Ingrese la nota del alumno "+ nombres_alumnos[i]);
			int nota=entradaScanner.nextInt();//almacenamos la nota en la variable nota para luego almacenarla en el arrays de nota
			notas_alumnoStrings[i]=nota;
		}
		for (int f=0;f<cantidad_alumnos;f++) {//Finalmente con este ciclo recorremos las notas con sus nombres para mostrarlos por consola
			System.out.println("El alumno "+ nombres_alumnos[f]+" Tiene: "+notas_alumnoStrings[f]);
		}
	}

}
