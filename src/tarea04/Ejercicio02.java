//Crear un programa que permita ingresar un número (1-10) entero. Visualizar el número en romanos.
//Número=5
//Romano=V
package tarea04;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        int numero;
        String romano="";
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
                System.out.print("Ingresar un numero natural del 1 al 10: ");
                numero=lectura.nextInt();
                // Proceso de datos
                switch (numero){
                    case 1:romano="I";break;
                    case 2: romano="II";break;
                    case 3:romano="III";break;
                    case 4: romano="IV";break;
                    case 5: romano="V";break;
                    case 6:romano="VI";break;
                    case 7:romano="VII";break;
                    case 8: romano="VII";break;
                    case 9: romano="IX";break;
                    case 10:romano="X";break;
                
                }
                // Salida de datos
                System.out.println("El numero "+numero+" en Romano es:  "+romano);
}
}