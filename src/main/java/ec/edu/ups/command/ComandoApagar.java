/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.command;

import ec.edu.ups.Icommand.ICommando;
import ec.edu.ups.receiver.Automovil;
import javax.swing.JTextField;

/**
 *
 * @author Dutan2000
 */
public class ComandoApagar implements ICommando{
    private Automovil auto;

    public ComandoApagar(Automovil auto) {
        this.auto = auto;
    }

    @Override
    public void ejecutar() {
        auto.apagar();
    }

}
