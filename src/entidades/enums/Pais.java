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
public enum Pais {
    BR("Brasil", 1);
    private String nomePais;
    private int numeroPais;

    private Pais(String nomePais, int numeroPais) {
        this.nomePais = nomePais;
        this.numeroPais = numeroPais;
    }

    public String getNomePais() {
        return nomePais;
    }

    public int getNumeroPais() {
        return numeroPais;
    }
    
    @Override
    public String toString(){
        return this.nomePais;
    }
    
}
