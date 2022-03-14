package pkg3.emisora;

import java.util.ArrayList;
import java.util.Scanner;

/*En otra emisora se entrega una boleta a cada oyente que llame, 
pero no se le entrega dos veces, crear un programa que permita 
ingresar la cédula del oyente y el programa diga inmediatamente 
si se le otorga la boleta o no
 */
public class Emisora {

    public static void main(String[] args) {

        ArrayList<Persona> Datos = new ArrayList<Persona>();//solo cuando no se saben los datos

        int Respuesta = 1;
        while (Respuesta == 1) {
            System.out.println("Cual es el nombre del oyente?");
            String Nombre = new Scanner(System.in).nextLine();
            System.out.println("Cual es la cedula del oyente?");
            String Cedula = new Scanner(System.in).nextLine();

            Persona objPersona = new Persona(Nombre, Cedula);
            Datos.add(objPersona);
            System.out.println("Desea agregar otra persona?");
            System.out.println("1. Si");
            System.out.println("1. No");
            Respuesta = new Scanner(System.in).nextInt();
        }
        
        for(int i=0;i<Datos.size();i++){
            System.out.println(Datos.get(i).Nombre+" "+Datos.get(i).Cedula);    
//        int[] dtos=new int [5];
//        Persona[] dtoss=new Persona[5]; Si tengo un numero exacto o si el usuario lo ingresa
    }
}

}
