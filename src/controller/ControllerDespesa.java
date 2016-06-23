/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelDespesa;

/**
 *
 * @author Marco Antonio
 */
public class ControllerDespesa extends ConnectionDB{

    ConnectionDB conecta = new ConnectionDB();

    public void InserirDespesa(ModelDespesa despesa) {

        conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO dotacao (Despesa,Reduzida,Programa,Acao)VALUES(?,?,?,?)");
            pst.setString(1, despesa.getDespesa());
            pst.setString(2, despesa.getReduzida());
            pst.setString(3, despesa.getPrograma());
            pst.setString(4, despesa.getAplicacao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserção feita com sucesso ");
            // testando passagem de parâmetros
            //JOptionPane.showMessageDialog(null, despesa.getDespesa());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na inserção dos dados: " + ex);
        }

        conecta.desconectar();

    }

    public void ExcluirDespesa(ModelDespesa despesa) {

       conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("delete from dotacao where Cod_Despesa=?");
            pst.setInt(1, (despesa.getCodDespesa()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Despesa de codigo: " + despesa.getCodDespesa()+ " excluída com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não excluídos!"+ex);
        }
       
        conecta.desconectar();
    }
    
    public void AlterarDespesa (ModelDespesa despesa){
    
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("update dotacao set Despesa=?,Reduzida=?,Programa=?,Acao=? where Cod_Despesa=? ");
            pst.setString(1, despesa.getDespesa());
            pst.setString(2, despesa.getReduzida());
            pst.setString(3, despesa.getPrograma());
            pst.setString(4, despesa.getAplicacao());
            pst.setInt(5, despesa.getCodDespesa());
            
            pst.execute();
                
            JOptionPane.showMessageDialog(null, "Despesa de codigo: " + despesa.getCodDespesa()+ " alterada com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não foram atualizados!"+ex);
        }  
    
    }   
    

}
