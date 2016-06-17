/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Marco Antonio
 */
public class ModelDespesa {
    
// mapeamento do objeto com definição dos atributos da classe    
//variáveis foram definidas como private por pertencer somente à Classe ModeloDespesa
    private int codDespesa; 
    private String despesa;
    private String Reduzida;
    private String Programa;  
    private String Aplicacao;

    
// encapsulamento dos dados
    public int getCodDespesa() {
        return codDespesa;
    }

    public void setCodDespesa(int codDespesa) {
        this.codDespesa = codDespesa;
    }

    public String getDespesa() {
        return despesa;
    }

    public void setDespesa(String despesa) {
        this.despesa = despesa;
    }

    public String getReduzida() {
        return Reduzida;
    }

    public void setReduzida(String Reduzida) {
        this.Reduzida = Reduzida;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    public String getAplicacao() {
        return Aplicacao;
    }

    public void setAplicacao(String Acao) {
        this.Aplicacao = Acao;
    }
    
    
    
}
