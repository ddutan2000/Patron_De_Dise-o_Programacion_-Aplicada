/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.client;

import ec.edu.ups.invoker.ControlRemoto;
import ec.edu.ups.receiver.Automovil;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dutan2000
 */
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Automovil auto = new Automovil(null);
        ControlRemoto controlR = new ControlRemoto(auto);
        int opcion;
        boolean salir=false;
        
        while(!salir){
            System.out.println("-----------------------------");
            System.out.println("QUE DESEA HACER?");
            System.out.println("1.ENCENDER AUTO \n2.APAGAR AUTO \n3.ENCENDER ALARMA \n4.APAGAR ALARMA \n5.SALIR");
            System.out.println("-----------------------------");
            try {
                opcion = input.nextInt();
                switch(opcion){
                    case 1:
                        controlR.boton(0);
                        break;
                    case 2:
                        controlR.boton(1);
                        break;
                    case 3:
                        controlR.boton(2);
                        break;
                    case 4:
                        controlR.boton(3);
                        break;
                    case 5: 
                        salir=true;
                        break;
                    default :
                        System.out.println("DEBE INGRESAR SOLAMENTE NUMEROS ENTRE 1-5");
                        break;
                }
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("SOLO INGRESAR NUMEROS");
            } 
        }
    }
}
