/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import entidades.enums.Cidades;
import entidades.enums.Estados;
import entidades.enums.Pais;

/**
 *
 * @author Antonio
 */
public class Endereco {
    private String rua;
    private String complemento;
    private String bairro;
    private Cidades cidade;
    private Estados estado;
    private Pais pais;
    private String cep;

    public Endereco() {
    }

    public Endereco(String rua, String complemento, String bairro, Cidades cidade, Estados estado, Pais pais, String cep) {
        setRua(rua);
        setComplemento(complemento);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setPais(pais);
        setCep(cep);
    }

    
    
    public String getRua() {
        return rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public Cidades getCidade() {
        return cidade;
    }

    public Estados getEstado() {
        return estado;
    }

    public Pais getPais() {
        return pais;
    }

    public String getCep() {
        return cep;
    }

    public final void setRua(String rua) {
        this.rua = rua.trim().toUpperCase();
    }

    public final void setComplemento(String complemento) {
        this.complemento = complemento.trim().toUpperCase();
    }

    public final void setBairro(String bairro) {
        this.bairro = bairro.trim().toUpperCase();
    }

    public final void setCidade(Cidades cidade) {
        this.cidade = cidade;
    }

    public final void setEstado(Estados estado) {
        this.estado = estado;
    }

    public final void setPais(Pais pais) {
        this.pais = pais;
    }

    public final void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
