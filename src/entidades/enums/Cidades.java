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
public enum Cidades {
    ARA("Araranguá",1),
    CRI("Criciuma",2),
    ICA("Içara",3),
    SOM("Sombrio",4);
    
    private final String nomeCidade;
    private final int numeroCidade;

    private Cidades(String nomeCidade, int numeroCidade) {
        this.nomeCidade = nomeCidade;
        this.numeroCidade = numeroCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public int getNumeroCidade() {
        return numeroCidade;
    }
    
    @Override
    public String toString(){
        return this.nomeCidade;
    }
}
    
    
    
