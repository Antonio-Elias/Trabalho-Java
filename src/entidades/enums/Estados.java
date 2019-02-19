/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.enums;

/**
 *
 * @author Antonio
 */
public enum Estados {
    SC("Santa Catarina",1),
    PR("Paraná",2),
    RS("Rio Grande do Sul",3);
    
    private final String nomeEstado;
    private final int numeroEstado;

    private Estados(String nomeEstado, int numeroEstado) {
        this.nomeEstado = nomeEstado;
        this.numeroEstado = numeroEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public int getNumeroEstado() {
        return numeroEstado;
    }
    
    @Override
    public String toString(){
        return nomeEstado;
    }
    
}
