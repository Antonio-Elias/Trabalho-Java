/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.cadastros;

import composicao.Endereco;
import entidades.enums.Departamento;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class Funcionario extends Pessoa{
    private Departamento departamento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(Departamento departamento, double salario, String nome, String cpf,String email, String telefone, Date dataNasct, Endereco endereco) {
        super(nome, cpf,email, telefone, dataNasct, endereco);
        setDepartamento(departamento);
        setSalario(salario);
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public final void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public final void setSalario(double salario) {
        this.salario = salario < 0 ? 0.0d : salario;
    }
    
    @Override
    public String toString(){
        return super.getNome();
    }
    
}
