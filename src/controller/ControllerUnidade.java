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

    /**
     *
     * @param unidade
     */
    public void InserirUnidade(model.ModelUnidade unidade) {

        conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO unidade (Nome_unidade, Tipo_unidade, End_unidade, Nr_endereco,Bairro_unidade, Cidade_unidade, "
                    + "UF_unidade,Fone1_unidade ,Fone2_unidade, Resp_unidade ,Fone_contato )"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, unidade.getUnidade());
            pst.setString(2, unidade.getTipo());
            pst.setString(3, unidade.getEndereco());
            pst.setString(4, unidade.getNumero());
            pst.setString(5, unidade.getBairro());
            pst.setString(6, unidade.getCidade());
            pst.setString(7, unidade.getUfUnidade());
            pst.setString(8, unidade.getTelefone1());
            pst.setString(9, unidade.getTelefone2());
            pst.setString(10, unidade.getResponsavel());
            pst.setString(11, unidade.getFoneContato());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserção feita com sucesso ");
            // testando passagem de parâmetros
            //JOptionPane.showMessageDialog(null, despesa.getDespesa());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção dos dados: " + ex);
        }

        conecta.desconectar();

    }

    /**
     *
     * @param unidade
     */
    public void ExcluirUnidade(model.ModelUnidade unidade) {

        conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("delete from unidade where Cod_unidade=?");
            pst.setInt(1, (unidade.getCodUnidade()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario de codigo: " + unidade.getUnidade() + " excluída com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não excluídos!" + ex);
        }

        conecta.desconectar();
    }

    /**
     *
     * @param unidade
     */
    public void AlterarUnidade(model.ModelUnidade unidade) {

        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("update unidade set "
                    + "Nome_unidade=?,"
                    + "Tipo_unidade=?,"
                    + "End_unidade=?,"
                    + "Nr_endereco=?,"
                    + "Bairro_unidade=?,"
                    + "Cidade_unidade=?, "
                    + "UF_unidade=?,"
                    + "Fone1_unidade=?, "
                    + "Fone2_unidade=?, "
                    + "Resp_unidade=?, "
                    + "Fone_contato=?"
                    + "where Cod_unidade=? ");

            pst.setString(1, unidade.getUnidade());
            pst.setString(2, unidade.getTipo());
            pst.setString(3, unidade.getEndereco());
            pst.setString(4, unidade.getNumero());
            pst.setString(5, unidade.getBairro());
            pst.setString(6, unidade.getCidade());
            pst.setString(7, unidade.getUfUnidade());
            pst.setString(8, unidade.getTelefone1());
            pst.setString(9, unidade.getTelefone2());
            pst.setString(10, unidade.getResponsavel());
            pst.setString(11, unidade.getFoneContato());
            pst.setInt(12, unidade.getCodUnidade());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Usuario de codigo: " + unidade.getUnidade() + " alterada com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não foram atualizados!\n" + ex.getMessage());
        }

    }

}
