/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.filmes;

import entidades.enums.Genero;
import java.time.LocalDate;

/**
 *
 * @author Antonio
 */
public  class Filmes {
    private String codigo;
    private String produtora;
    private String titulo;
    private String artista;
    private LocalDate anoLancamento;
    private int duracao;
    private Genero genero;
    private double precoAluguel; 
    private boolean lancamento;

    public Filmes() {
    }

    public Filmes(String codigo, String produtora, String titulo, String artista, LocalDate anoLancamento, 
                    int duracao, Genero genero, double precoAluguel, boolean lancamento) {
        setCodigo(codigo);
        setProdutora(produtora);
        setTitulo(titulo);
        setArtista(artista);
        setAnoLancamento(anoLancamento);
        setDuracao(duracao);
        setPrecoAluguel(precoAluguel);
        setGenero(genero);
        setLancamento(lancamento);
        
    }
    
    public String getCodigo() {
        return codigo;
    }

    public final void setCodigo(String codigo) {
        this.codigo = codigo.trim().isEmpty() ? "SEM CODIGO" : codigo.trim().toUpperCase();
    }

    public String getProdutora() {
        return produtora;
    }

    public final void setProdutora(String produtora) {
        this.produtora = produtora.trim().isEmpty() ? "SEM PRODUTORA" : produtora.trim().toUpperCase();
    }

    public String getTitulo() {
        return titulo;
    }

    public final void setTitulo(String titulo) {
        this.titulo = titulo.trim().isEmpty() ? "SEM TITULO" : titulo.trim().toUpperCase();
    }

    public String getArtista() {
        return artista;
    }

    public final void setArtista(String artista) {
        this.artista = artista.trim().isEmpty() ? "SEM ARTISTA" : artista.trim().toUpperCase();;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public final void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public final void setDuracao(int duracao) {
        this.duracao = duracao < 0 ? 0 : duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public final void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean isLancamento() {
        return lancamento;
    }

    public final void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel < 0.0d ? 0.0d : precoAluguel;
    }
    
    @Override
    public String toString(){
       return titulo;
    }
    
}
