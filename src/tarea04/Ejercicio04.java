//Crear un programa que permita ingresar un número (1,2,3,4,6,12) entero. Visualizar el nombre del periodo anual, por ejemplo:
//Número=2
//Periodo=”bimestral”
//Número=4
//Periodo=”cuatrimestral”
//Número:12
//Periodo=”anual”
package tarea04;

import java.util.Scanner;

public class Ejercicio04 {
        public static void main(String[] args) {
    int num;
    String Periodo="";
    Scanner lectura=new Scanner(System.in);
    //Entrada de dato
    System.out.print("Ingresar un numero (1,2,3,4,6,12) : ");
    num=lectura.nextInt();
    // proceso de datos
    switch (num){
        case 1: Periodo= "Mensual";break;
        case 2: Periodo= "Bimestral";break;
        case 3: Periodo= "Trimestral";break;
        case 4: Periodo= "Cuatrimestral";break;
        case 6: Periodo= "Semestral";break;
        case 12: Periodo= "Anual";break;
              }
    //salida de datos
       System.out.println("El nombre del periodo es: "+ Periodo);
}
        }
