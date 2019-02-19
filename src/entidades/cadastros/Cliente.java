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
public class Cliente extends Pessoa{
    private String codigo;

    public Cliente() {
       
    }

    public Cliente(String codigo, String nome, String cpf, String email, String telefone, Date dataNasct, Endereco endereco) {
        super(nome, cpf, email, telefone, dataNasct, endereco);
        setCodigo(codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public final void setCodigo(String codigo) {
        this.codigo = codigo.trim().length() <  0 ? "0" : codigo;
    }
    
    @Override
    public String toString(){
        return super.getNome();
    }
        
        
}
    
