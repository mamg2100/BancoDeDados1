/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import model.ModelRim;
import model.ModelUnidade;

/**
 *
 * @author Marco Antonio
 */
public class ControllerRim extends ConnectionDB {
    
    ConnectionDB conecta = new ConnectionDB();

    public void InserirRequisicao(ModelRim rim) throws ParseException {

        conecta.conexao();
        //JOptionPane.showMessageDialog(null,"Entramos na inserção");
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO rim "
            + "(Nome_Unidade,"
            + "Descricao,"
            + "Dotacao,"
            + "Tipo_RIM,"
            + "Cetil,"
            + "DataCetil,"
                    //+ "DataCetilSQL,"
                    + "ValorEstimado,"
                    + "ValorReal,"
                    + "Processo,"
                    + "ano_processo,"
                    + "ProcessoContabil,"
                    + "ano_processo_contabil,"
                    + "Contabilidade,"
                    + "OrdenadorAss,"
                    + "ComprasPrim,"
                    + "OrdenadorEmpenho,"
                    + "ComprasSeg,"
                    + "Dipe,"
                    + "Cadastrante,"
                    + "DataCadastro,"
                    + "Observacao,"
                    + "Cd_Usuario,"
                    + "CD_unidade)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          
                        
            pst.setString(1, rim.getUnidade());
            pst.setString(2, rim.getDescricao());
            pst.setString(3, rim.getDotacao());
            pst.setString(4, rim.getTipoRim());
            pst.setString(5, rim.getCetil());
            pst.setString(6, rim.getDataCetil());
            //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            //String dataString = rim.getDataCetil();
            //java.util.Date date = formatter.parse(dataString);
            //pst.setString(7,String.valueOf(date));
            //pst.setDate(7,rim.getDataCetilSql());
            pst.setString(7, rim.getValorEstimado());
            pst.setString(8, rim.getValorReal());
            pst.setString(9, rim.getProcesso());
            pst.setInt(10, rim.getAnoProcesso());
            pst.setString(11, rim.getProcessoContabil());
            pst.setInt(12, rim.getAnoProcessoContabil());
            pst.setString(13, rim.getContabilidade());
            pst.setString(14, rim.getOrdenadorass());
            pst.setString(15, rim.getCompraprim());
            pst.setString(16, rim.getOrdenadorEmpenho());
            pst.setString(17, rim.getComprasSeg());
            pst.setString(18, rim.getDipe());
            pst.setString(19, rim.getCadastrante());
            pst.setString(20, rim.getDataCadastro());
            pst.setString(21, rim.getObservacao());
            pst.setInt(22, 3);
            pst.setInt(23, 9);
            //pst.setInt(23, rim.getCodUsuario());
            //pst.setInt(24, rim.getCodUnidade());            
                                 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserção feita com sucesso ");
            // testando passagem de parâmetros
            //JOptionPane.showMessageDialog(null, despesa.getDespesa());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na inserção dos dados: " + ex);
        }

        conecta.desconectar();

    }

    public void ExcluirRequisicao(ModelRim rim) {

       conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("delete from rim where Cod_Rim=?");
            pst.setInt(1, (rim.getCodRim()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Rim de codigo: " + rim.getCodRim()+ " excluída com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não excluídos!"+ex);
        }
       
        conecta.desconectar();
    }
    
    public void AlterarRequisicao(ModelRim rim){
    
        try {
            conecta.conexao();
           //PreparedStatement pst = conecta.conn.prepareStatement("update dotacao set Despesa=?,Reduzida=?,Programa=?,Acao=? where Cod_Despesa=? ");
           PreparedStatement pst = conecta.conn.prepareStatement("update dotacao set Despesa=?,Reduzida=?,Programa=?,Acao=? where Cod_Despesa=? ");
           
            /*
            pst.setString(1, rim.getUnidade());
            pst.setString(2, rim.getDescricao());
            pst.setString(3, rim.getDotacao());
            pst.setString(4, rim.getTipoRim());
            pst.setString(5, rim.getCetil());
            pst.setString(6, rim.getDataCetil());
            pst.setDate(7,rim.getDataCetilSql());
            pst.setString(8, rim.getValorEstimado());
            pst.setString(9, rim.getValorReal());
            pst.setString(10, rim.getProcesso());
            pst.setInt(11, rim.getAnoProcesso());
            pst.setString(12, rim.getProcessoContabil());
            pst.setInt(13, rim.getAnoProcessoContabil());
            pst.setString(14, rim.getContabilidade());
            pst.setString(15, rim.getOrdenadorass());
            pst.setString(16, rim.getCompraprim());
            pst.setString(17, rim.getOrdenadorEmpenho());
            pst.setString(18, rim.getComprasSeg());
            pst.setString(19, rim.getDipe());
            pst.setString(20, rim.getCadastrante());
            pst.setString(21, rim.getDataCadastro());
            pst.setString(22, rim.getObservacao());
            pst.setInt(23, rim.getCodUsuario());
            pst.setInt(24, rim.getCodUnidade()); 
            pst.execute();
              */
            pst.setString(1, rim.getUnidade());
            pst.setString(2, rim.getDescricao());
            pst.setString(3, rim.getDotacao());
            pst.setString(4, rim.getTipoRim());
            pst.setString(5, rim.getCetil());
            pst.setString(6, rim.getDataCetil());
            //pst.setDate(7,rim.getDataCetilSql());
            pst.setString(7, rim.getValorEstimado());
            pst.setString(8, rim.getValorReal());
            pst.setString(9, rim.getProcesso());
            pst.setInt(10, rim.getAnoProcesso());
            pst.setString(11, rim.getProcessoContabil());
            pst.setInt(12, rim.getAnoProcessoContabil());
            pst.setString(13, rim.getContabilidade());
            pst.setString(14, rim.getOrdenadorass());
            pst.setString(15, rim.getCompraprim());
            pst.setString(16, rim.getOrdenadorEmpenho());
            pst.setString(17, rim.getComprasSeg());
            pst.setString(18, rim.getDipe());
            pst.setString(19, rim.getCadastrante());
            pst.setString(20, rim.getDataCadastro());
            pst.setString(21, rim.getObservacao());
            pst.setInt(22, 3);
            pst.setInt(23, 9);
            pst.execute();
                    
            JOptionPane.showMessageDialog(null, "Requisição de codigo: " + rim.getCodRim()+ " alterada com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não foram atualizados!"+ex);
        }
        
    }   
    
    public void obtendoCodigoUnidade(ModelUnidade uni) {

       conecta.conexao();
      
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("select cod_unidade from unidade where Nome_Unidade=?");
            pst.setInt(1, (uni.getCodUnidade()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Codigo:\n" + uni.getCodUnidade());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não excluídos!"+ex);
        }
       
        conecta.desconectar();
    }
}
