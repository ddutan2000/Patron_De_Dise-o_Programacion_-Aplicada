/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.invoker;

import ec.edu.ups.Icommand.ICommando;
import ec.edu.ups.command.*;
import ec.edu.ups.receiver.Automovil;

/**
 *
 * @author Dutan2000
 */
public class ControlRemoto {
    
    private ICommando[] comandos =new ICommando[4];

    public ControlRemoto(Automovil auto) {
        comandos[0]=new ComandoEncender(auto);
        comandos[1]=new ComandoApagar(auto);
        comandos[2]=new ComandoPrendeAlarma(auto);
        comandos[3]=new ComandoApagarAlarma(auto);
    }
    
    public void boton(int indice){
        comandos[indice].ejecutar();
    }  
}
