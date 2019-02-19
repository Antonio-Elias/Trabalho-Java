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
public enum Genero {
    AC("Ação",1),
    AN("Animação",2),
    AV("Aventura",3),
    CA("Cinema de arte",4),
    CH("Chanchada",5),
    CC("Cinema catástrofe",6),
    CO("Comédia",7),
    CR("Comédia romântica",8),
    CD("Comédia dramática",9),
    COA("Comédia de ação",10),
    DA("Dança",11),
    DO("Documentário",12),
    DR("Drama",13),
    ES("Espionagem",14),
    FR("Faroeste ",15),
    FC("Ficção científica",16),
    MU("Musical",17),
    RO("Romance",18),
    SE("Seriado",19),
    SU("Suspense",20),
    TE("Terror",21);
    
    private final String nomeFilme;
    private final int numeroFilme;

    private Genero(String nomeFilme, int numeroFilme) {
        this.nomeFilme = nomeFilme;
        this.numeroFilme = numeroFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public int getNumeroFilme() {
        return numeroFilme;
    }
    
    @Override
   public String toString(){ 
       return nomeFilme;
   }
}
