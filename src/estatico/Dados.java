/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

import entidades.aluguel.AluguelFilmes;
import entidades.cadastros.Pessoa;
import entidades.filmes.Filmes;
import java.util.LinkedList;

/**
 *
 * @author Antonio
 */
public class Dados {
    private static LinkedList<Pessoa> pessoas = new LinkedList<>();
    private static LinkedList<Filmes> filmes = new LinkedList<>();
    private static LinkedList<AluguelFilmes> Aluguelfilmes = new LinkedList<>();

    public static LinkedList<Pessoa> getPessoas() {
        return pessoas;
    }

    public static LinkedList<Filmes> getFilmes() {
        return filmes;
    }

    public static LinkedList<AluguelFilmes> getAluguelfilmes() {
        return Aluguelfilmes;
    }
    
}
