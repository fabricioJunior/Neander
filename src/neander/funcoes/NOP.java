/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neander.funcoes;

import neander.Computador;

/**
 *
 * @author fabri
 */
public class NOP implements IFunction {

    @Override
    public void run(int index) {
        Computador.memoria.get(index + 1).run(index + 1);
    }

    @Override
    public String binario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String decimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
