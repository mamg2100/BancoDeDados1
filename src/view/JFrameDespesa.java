/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ConnectionDB;
import controller.ControllerDespesa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ModelDespesa;
import controller.ModelTabela;
import java.sql.ResultSet;

/**
 *
 * @author Marco Antonio
 */
public class JFrameDespesa extends javax.swing.JFrame {

    //ConnectionDB conexao = new ConnectionDB();
    //ControllerDespesa desp = new ControllerDespesa();
    ConnectionDB conecta = new ConnectionDB();
    ModelDespesa despesa = new ModelDespesa();// foi tornado global para não ter que instanciar novamente
    ControllerDespesa des = new ControllerDespesa();

// novamente no botão excluir.
    /**
     * Creates new form JFrameDespesa
     */
    public JFrameDespesa() {
        initComponents();
        //conexao.conectar();
        conecta.conexao();
        preencherTabela("select * from dotacao order by Cod_Despesa");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDespesa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtCodigo = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtDespesa = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtReduzida = new java.awt.TextField();
        label4 = new java.awt.Label();
        txtPrograma = new java.awt.TextField();
        label5 = new java.awt.Label();
        txtAplicacao = new java.awt.TextField();
        rbNovo = new javax.swing.JRadioButton();
        rbAlterar = new javax.swing.JRadioButton();
        rbExcluir = new javax.swing.JRadioButton();
        buttonOK = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonFirst = new javax.swing.JButton();
        buttonPrevious = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        buttonLast = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas");

        jTableDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableDespesa);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Código");

        txtCodigo.setEnabled(false);

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Desdobrada");

        txtDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDespesaActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Reduzida");

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Programa");

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText("Cod. Aplicação");

        rbNovo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbNovo.setText("Novo");
        rbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNovoActionPerformed(evt);
            }
        });

        rbAlterar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbAlterar.setText("Alterar");

        rbExcluir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbExcluir.setText("Excluir");

        buttonOK.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        buttonCancelar.setText("Cancelar");

        buttonSair.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        buttonSair.setText("Sair");

        buttonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFirstActionPerformed(evt);
            }
        });

        buttonExcluir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonAlterar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReduzida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(buttonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPrevious)
                .addGap(4, 4, 4)
                .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAlterar)
                            .addComponent(rbNovo)
                            .addComponent(rbExcluir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSair))
                .addGap(46, 46, 46))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancelar, buttonSair});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbAlterar, rbExcluir, rbNovo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCodigo, txtDespesa, txtReduzida});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonFirst, buttonLast, buttonNext, buttonPrevious});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonExcluir, buttonOK});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonNext))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPrevious)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDespesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReduzida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(txtPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtAplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(rbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonOK)
                                .addComponent(buttonAlterar)
                                .addGap(0, 0, 0)
                                .addComponent(buttonExcluir)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonLast)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(30, 30, 30))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCancelar, buttonSair});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonFirst, buttonLast, buttonNext, buttonPrevious});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonExcluir, buttonOK});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rbAlterar, rbExcluir, rbNovo});

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jScrollPane2});

        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed

        // foi tornado global para não ter que declarar novamente
        // ModelDespesa despesa = new ModelDespesa();
        despesa.setCodDespesa(Integer.valueOf(txtCodigo.getText()));
        despesa.setDespesa(txtDespesa.getText());
        despesa.setReduzida(txtReduzida.getText());
        despesa.setPrograma(txtPrograma.getText());
        despesa.setAplicacao(txtAplicacao.getText());

        des.InserirDespesa(despesa);
    }//GEN-LAST:event_buttonOKActionPerformed

    private void rbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNovoActionPerformed

    private void txtDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDespesaActionPerformed

    private void buttonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFirstActionPerformed

        /*
         try {
         conectaDesp.executaSQL("Select * from dotacao order by Cod_despesa");
         conectaDesp.rs.first();
         txtDespesa.setText(conectaDesp.rs.getString("Despesa"));
         txtReduzida.setText(conectaDesp.rs.getString("Reduzida"));
         txtPrograma.setText(conectaDesp.rs.getString("Programa"));
         txtAplicacao.setText(conectaDesp.rs.getString("Acao"));

         } catch (SQLException ex) {
         JOptionPane.showMessageDialog(rootPane, "Erro ao setar o registro" + ex);
         }
         */
    }//GEN-LAST:event_buttonFirstActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        //despesa.setCodDespesa(Integer.valueOf(txtCodigo.getText()));
        //ControllerDespesa des = new ControllerDespesa();
        despesa.setCodDespesa(Integer.valueOf(txtCodigo.getText()));
        despesa.setDespesa(txtDespesa.getText());
        despesa.setReduzida(txtReduzida.getText());
        despesa.setPrograma(txtPrograma.getText());
        despesa.setAplicacao(txtAplicacao.getText());

        des.ExcluirDespesa(despesa);
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        // TODO add your handling code here:
        despesa.setCodDespesa(Integer.valueOf(txtCodigo.getText()));
        despesa.setDespesa(txtDespesa.getText());
        despesa.setReduzida(txtReduzida.getText());
        despesa.setPrograma(txtPrograma.getText());
        despesa.setAplicacao(txtAplicacao.getText());

        des.AlterarDespesa(despesa);

    }//GEN-LAST:event_buttonAlterarActionPerformed

    public void preencherTabela(String SQL) {

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Despesa", "Reduzida", "Programa", "Cod.Aplicacão"};

        conecta.executaSQL(SQL);
        
        try {
            conecta.rs.first();
            do {
                dados.add(new Object[]{conecta.rs.getInt("Cod_Despesa"), conecta.rs.getString("Despesa"), conecta.rs.getString("Reduzida"), conecta.rs.getString("Programa"), conecta.rs.getString("Acao")});
            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n " + ex.getMessage());
        }

        //Criando a Tabela
        ModelTabela modelo = new ModelTabela(dados, colunas);
        jTableDespesa.setModel(modelo);
        jTableDespesa.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTableDespesa.getColumnModel().getColumn(0).setResizable(false);
        jTableDespesa.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableDespesa.getColumnModel().getColumn(1).setResizable(false);
        jTableDespesa.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableDespesa.getColumnModel().getColumn(2).setResizable(false);
        jTableDespesa.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableDespesa.getColumnModel().getColumn(3).setResizable(false);
        jTableDespesa.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTableDespesa.getColumnModel().getColumn(4).setResizable(false);
        jTableDespesa.getTableHeader().setReorderingAllowed(false);
        jTableDespesa.setAutoResizeMode(jTableDespesa.AUTO_RESIZE_OFF);
        jTableDespesa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFirst;
    private javax.swing.JButton buttonLast;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonPrevious;
    private javax.swing.JButton buttonSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDespesa;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Panel panel1;
    private javax.swing.JRadioButton rbAlterar;
    private javax.swing.JRadioButton rbExcluir;
    private javax.swing.JRadioButton rbNovo;
    private java.awt.TextField txtAplicacao;
    private java.awt.TextField txtCodigo;
    private java.awt.TextField txtDespesa;
    private java.awt.TextField txtPrograma;
    private java.awt.TextField txtReduzida;
    // End of variables declaration//GEN-END:variables
}
