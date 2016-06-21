/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Antonio
 */
public class ConnectionDB {

    // para preparar e realizar pesquisas no BD
    public Statement stm;

    // armazena o resultado de uma pesquisa passada para o statement
    public ResultSet rs;
    // driver que identifica qual é o banco com o qual se está trabalhando
    private String driver = "com.mysql.jdbc.Driver";

    // caminho para setar o local do BD
    private String caminho = "jdbc:mysql://localhost:3306/prorim";

    private String usuario = "root";
    private String senha = "";

    // realiza a confecção com o BD. 
    public Connection conn;

    public ConnectionDB() {
    }

    public void conexao() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com o BD");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão com o BD +\n Erro" + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Método executaSQL\n Erro" + ex.getMessage());
        }       
    
    }    
    
    public void desconectar(){
    
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado do Banco de Dados...!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( null, "Erro ao fechar a conexão!\n Erro " + ex.getMessage());
        }
    
    }

    
}
