/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

/**
 *
 * @author Marco Antonio
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marco Antonio
 */
public class ModelTabela extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModelTabela(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);
    }
   
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        linhas = dados;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) {
        colunas = nomes;
    }

    @Override
    public int getColumnCount() {
        return colunas.length; // essa é Array
    }

    @Override
    public int getRowCount() {
        return linhas.size(); // esse é Vetor.
    }

    @Override
    public String getColumnName(int numCol) {
        return colunas[numCol];
    }
    
    @Override
    public Object getValueAt(int numLin, int numCol){
    
    Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    
    }
}
