/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.receiver;

import javax.swing.JTextField;

/**
 *
 * @author Dutan2000
 */
public class Automovil {
    private JTextField texto;

    public Automovil(JTextField texto) {
        this.texto = texto;
    }
    
    public void encender(){
        System.out.println("EL AUTO SE HA ENCENDIDO");
        texto.setText("EL AUTO SE HA ENCENDIDO");
    }
    
    public void apagar(){
        System.out.println("EL AUTO SE HA APAGADO");
        texto.setText("EL AUTO SE HA APAGADO");
    }
    
    public void colocarAlarma(){
        System.out.println("ALARMA ENCENDIDA");
        texto.setText("ALARMA ENCENDIDA");
    }
    
    public void quitarAlarma(){
        System.out.println("ALARMA APAGADA");
        texto.setText("ALARMA APAGADA");
    }
}
