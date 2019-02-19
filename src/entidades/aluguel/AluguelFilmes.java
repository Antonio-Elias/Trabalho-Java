/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.aluguel;

import entidades.cadastros.Cliente;
import entidades.cadastros.Funcionario;
import entidades.enums.Status;
import entidades.filmes.Filmes;
import interfaces.CalculoFilmes;
import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;

/**
 *
 * @author Antonio
 */
public class AluguelFilmes implements CalculoFilmes{
    private Funcionario funcionario;
    private Cliente cliente;
    private LinkedList<Filmes> filmes;
    private LocalDate dataAluguel;
    private LocalDate dataEntrega;
    private double valorTotal;
    private Status status;

    public AluguelFilmes() {
    }

    public AluguelFilmes(Funcionario funcionario, Cliente cliente,LinkedList<Filmes> filmes, LocalDate dataAluguel, LocalDate dataEntrega, double valorTotal, Status status) {
        setFuncionario(funcionario);
        setCliente(cliente);
        setFilmes(filmes);
        setDataAluguel(dataAluguel);
        setDataEntrega(dataEntrega);
        setValorTotal(valorTotal);
        setStatus(status);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public final void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public final void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LinkedList<Filmes> getFilmes() {
        return filmes;
    }

    public final void setFilmes(LinkedList<Filmes> filmes) {
        this.filmes = filmes;
    }
    

    public void AdicionaFilme(Filmes filme){
        filmes.add(filme);
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public final void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public final void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public final void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal < 0.0d ? 0.0d : valorTotal;
    }

    public Status getStatus() {
        return status;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }
    public void verificaStatus(int dias){
        if(dias >= 4){
            setStatus(Status.ATR);
        }
        
    }
    
    
    @Override
    public double calculaMultaFilmes(int dias) {
        if(dias == 4 ){
            return this.valorTotal * 0.02;
        }
        if(dias > 4){
            return this.valorTotal * 0.05;
        }else{
            return 0.0d;
        }
        
           
    }
        
    @Override
    public double calculaValorTotal() {
        // percorrendo o valor total dos alugueis
        filmes.forEach((filme) -> {
            this.valorTotal += filme.getPrecoAluguel();
        });
        return this.valorTotal;
    }
    
   @Override
    public String toString(){
        return cliente.getNome();
    }
}
        
        
        
        

    
    
    
