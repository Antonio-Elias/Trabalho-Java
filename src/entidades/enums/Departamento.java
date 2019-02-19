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
public enum Departamento {
    VEN("Vendas",1),
    FIN("Financeiro", 2),
    ADM("Administrativo",3),
    RH("recursos Humanos", 4);
    
    private final String nomeDepartamento;
    private final int numeroDepartamento;

    private Departamento(String nomeDepartamento, int numeroDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.numeroDepartamento = numeroDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }
    
    @Override
    public String toString(){
        return nomeDepartamento;

    }
}