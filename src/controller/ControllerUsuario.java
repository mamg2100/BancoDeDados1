/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ROGITRAB
 */
public class ControllerUsuario extends ConnectionDB {
    
    ConnectionDB conecta = new ConnectionDB();
    
    
    public void InserirUsuario(model.ModelUsuario usuario) {

        conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO usuario (Nome_usuario, Login_usuario, Senha_usuario, Setor_usuario, Email_usuario, Tipo_usuario)VALUES(?,?,?,?,?,?)");
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getLogin());
            pst.setString(3, usuario.getSenha());
            pst.setString(4, usuario.getLotacao());
            pst.setString(5, usuario.getEmail());
            pst.setString(6, usuario.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserção feita com sucesso ");
            // testando passagem de parâmetros
            //JOptionPane.showMessageDialog(null, despesa.getDespesa());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na inserção dos dados: " + ex);
        }

        conecta.desconectar();

    }

    public void ExcluirUsuario(model.ModelUsuario usuario) {

       conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("delete from usuario where Cod_Usuario=?");
            pst.setInt(1, (usuario.getCodUsuario()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario de codigo: " + usuario.getCodUsuario()+ " excluída com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não excluídos!"+ex);
        }
       
        conecta.desconectar();
    }
    
    public void AlterarUsuario (model.ModelUsuario usuario){
    
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("update usuario set Nome_usuario=?,Login_usuario=?,Senha_usuario=?,Setor_usuario=?,Email_usuario=?,Tipo_usuario=? where Cod_usuario=? ");
                                            //"INSERT INTO usuario (Nome_usuario,Login_usuario,Senha_usuario,Setor_usuario,Email_usuario)VALUES(?,?,?,?,?)");
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getLogin());
            pst.setString(3, usuario.getSenha());
            pst.setString(4, usuario.getLotacao());
            pst.setString(5, usuario.getEmail());
            pst.setString(6, usuario.getTipo());
            pst.setInt(7, usuario.getCodUsuario());
            
            pst.execute();
                
            JOptionPane.showMessageDialog(null, "Usuario de codigo: " + usuario.getCodUsuario()+ " alterada com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não foram atualizados!"+ex);
        }  
    
    }   
    

    
}
