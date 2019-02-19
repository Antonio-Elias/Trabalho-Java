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
public enum Status {
    END("Em dia", 1),
    ENT("Entregue", 2),
    ATR("Atrasado", 3);
    private final String nomeStatus;
    private final int numeroStatus;

    private Status(String nomeStatus, int numeroStatus) {
        this.nomeStatus = nomeStatus;
        this.numeroStatus = numeroStatus;
    }

    public String getNomeStatus() {
        return nomeStatus;
    }

    public int getNumeroStatus() {
        return numeroStatus;
    }

    
    @Override
    public String toString(){
        return nomeStatus;
    }
    
    
}
