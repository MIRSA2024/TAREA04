//Crear un programa que permita ingresar un número (1-5) entero. Visualizar el número ingresado en palabra.
//Número=2
//Palabra=”dos”
package tarea04;

import java.util.Scanner;

public class Ejercicio01 {


    public static void main(String[] args) {
     
        int numero;
        String palabra="";
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
                System.out.print("Ingresar un numero natural del 1 al 5: ");
                numero=lectura.nextInt();
                // Proceso de datos
                switch (numero){
                    case 1:palabra="Uno";break;
                    case 2: palabra="Dos";break;
                    case 3:palabra="Tres";break;
                    case 4: palabra="Cuatro";break;
                    case 5: palabra="Cinco";break;
                    default:  palabra = "NUMERO FUERA DE RANGO"; break;
                }
                // Salida de datos
                System.out.println("El numero ingresado en letras es:  "+palabra);
}
    }
    

