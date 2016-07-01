/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.md;
import com.jgoodies.looks.plastic.theme.BrownSugar;
import com.jgoodies.looks.plastic.theme.DarkStar;
import com.jgoodies.looks.plastic.theme.DesertBlue;
import com.jgoodies.looks.plastic.theme.ExperienceBlue;
import com.jgoodies.looks.plastic.theme.ExperienceRoyale;
import com.jgoodies.looks.plastic.theme.InvertedColorTheme;
import com.jgoodies.looks.plastic.theme.Silver;
import com.jgoodies.looks.plastic.theme.SkyBlue;
import com.jgoodies.looks.plastic.theme.SkyBluer;
import controller.ConnectionDB;
import java.awt.SystemColor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/*
 *
 * @author Marco Antonio
 */

public class JFramePrincipal extends javax.swing.JFrame {

    ConnectionDB conexao = new ConnectionDB(); // é uma variável global
    // ConectaBanco conecta = new ConectaBanco
    /**
     * Creates new form JFramePrincipal
     */
    
  public JFramePrincipal() {
        initComponents();
        conexao.conexao();// 
        
        // conecta.conexao();     
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRim = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemFornecedor = new javax.swing.JMenuItem();
        menuItemUnidade = new javax.swing.JMenuItem();
        menuItemDespesa = new javax.swing.JMenuItem();
        menuItemVeiculo = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        menuDados = new javax.swing.JMenu();
        menuUtilitarios = new javax.swing.JMenu();
        menuConfig = new javax.swing.JMenu();
        menuAuditoria = new javax.swing.JMenu();
        menuRelatorios = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISPRORIM - Sistema de Protocolo de Requisições");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        menuRim.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuRim.setText("Requisições");
        menuRim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuRim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRimActionPerformed(evt);
            }
        });

        jMenuItem2.setText("RIM | RRP");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuRim.add(jMenuItem2);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuRim.add(jMenuItem1);

        jMenuBar1.add(menuRim);

        menuCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuCadastro.setText("Cadastro");
        menuCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        menuItemFornecedor.setText("Fornecedor");
        menuCadastro.add(menuItemFornecedor);

        menuItemUnidade.setText("Unidade");
        menuItemUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUnidadeActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUnidade);

        menuItemDespesa.setText("Despesa");
        menuItemDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDespesaActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemDespesa);

        menuItemVeiculo.setText("Veículo");
        menuCadastro.add(menuItemVeiculo);

        jMenuBar1.add(menuCadastro);

        menuConsultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuConsultas.setText("Consultas");
        menuConsultas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.add(menuConsultas);

        menuDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuDados.setText("Dados");
        menuDados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.add(menuDados);

        menuUtilitarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuUtilitarios.setText("Utilitários");
        menuUtilitarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.add(menuUtilitarios);

        menuConfig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuConfig.setText("Configurações");
        menuConfig.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.add(menuConfig);

        menuAuditoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuAuditoria.setText("Auditoria");
        menuAuditoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.add(menuAuditoria);

        menuRelatorios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.add(menuRelatorios);

        menuAjuda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuAjuda.setText("Ajuda");
        menuAjuda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1117, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDespesaActionPerformed
        // TODO add your handling code here:
        JFrameDespesa formdespesa = new JFrameDespesa();
        formdespesa.setVisible(true);
    }//GEN-LAST:event_menuItemDespesaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        conexao.desconectar();
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // lookandfeel muda de cores
        // biblioteca     looksdemo-2.3.1.jar
        //SkyBlue()
        //BrownSugar()
        //DarkStar()  
        //DesertGreen()
        //Silver()
        //ExperienceRoyale()
        try {
            PlasticLookAndFeel.setPlasticTheme(new DarkStar());
            try {
                UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
            } catch (InstantiationException ex) {
                Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);

        //JFramePrincipal.setBackground(SystemColor.BLACK);

    }//GEN-LAST:event_formWindowOpened

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        // TODO add your handling code here:
        JFrameUsuario formusuario = new JFrameUsuario();
        formusuario.setVisible(true);
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUnidadeActionPerformed
        // TODO add your handling code here:
        JFrameUnidade formunidade = new JFrameUnidade();
        formunidade.setVisible(true);
    }//GEN-LAST:event_menuItemUnidadeActionPerformed

    private void menuRimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRimActionPerformed
        
        
    }//GEN-LAST:event_menuRimActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JFrameRim rim = new JFrameRim();
        rim.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
              
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuAuditoria;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuDados;
    private javax.swing.JMenuItem menuItemDespesa;
    private javax.swing.JMenuItem menuItemFornecedor;
    private javax.swing.JMenuItem menuItemUnidade;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenuItem menuItemVeiculo;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuRim;
    private javax.swing.JMenu menuUtilitarios;
    // End of variables declaration//GEN-END:variables
}
