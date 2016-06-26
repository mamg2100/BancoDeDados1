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
 * @author jodosom
 */
public class ControllerUnidade {
    ConnectionDB conecta = new ConnectionDB();
    
    public void InserirUnidade(model.ModelUnidade unidade) {

        conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO usuario (Nome_unidade, Tipo_unidade, End_unidade, Nr_endereco,Bairro_unidade, Cidade_unidade, "
                    + "UF_unidade,Fone1_unidade ,Fone2_unidade, Resp_unidade ,Fone_contato )"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, unidade.getUnidade());
            pst.setString(2, unidade.getTipo());
            pst.setString(3, unidade.getEndereco());
            pst.setString(4, unidade.getBairro());
            pst.setString(5, unidade.getCidade());
            pst.setString(6, unidade.getUfUnidade());
            pst.setString(7, unidade.getTelefone1());
            pst.setString(8, unidade.getTelefone2());
            pst.setString(9, unidade.getResponsavel());
            pst.setString(10, unidade.getFoneContato());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserção feita com sucesso ");
            // testando passagem de parâmetros
            //JOptionPane.showMessageDialog(null, despesa.getDespesa());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na inserção dos dados: " + ex);
        }

        conecta.desconectar();

    }

}
