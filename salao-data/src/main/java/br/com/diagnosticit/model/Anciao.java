/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import br.com.diagnosticit.exceptions.DataInicialMaiorQueDataFinalException;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author cristiano
 */
@Entity
public class Anciao extends Privilegio{

    private String tipo;

    public Anciao() {
    }

    public Anciao(Long id, String tipo, Date dataInicial, Date dataFinal, 
            boolean ativo, PublicadorBatizado publicadorBatizado) 
            throws DataInicialMaiorQueDataFinalException {
        super(id, dataInicial, dataFinal, ativo, publicadorBatizado);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Anciao{" + "tipo=" + tipo + '}';
    }
    
    
    
    
}
