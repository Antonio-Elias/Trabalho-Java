/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.cadastros;

import composicao.Endereco;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNasct;
    private String email;
    private String telefone;
    private Endereco endereco;

    public Pessoa() {
        
    }

    public Pessoa(String nome, String cpf, String email,String telefone, Date dataNasct, Endereco endereco) {
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setTelefone(telefone);
        setDataNasct(dataNasct);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ?"DEFAULT": nome.trim().toUpperCase();
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf.trim().length() < 14 ? "000.000.000-00": cpf;
    }

    public Date getDataNasct() {
        return dataNasct;
    }

    public final void setDataNasct(Date dataNasct) {
        this.dataNasct = dataNasct;
    }

    public final void setEndereco(Endereco endereco) {
        this.endereco = endereco == null ? new Endereco() : endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email.trim().isEmpty() ? "SEM E-MAIL" : email.trim().toUpperCase();
    }

    public String getTelefone() {
        return telefone;
    }

    public final void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "(00)0000-0000": telefone;
    }
    
    
    
    
}
