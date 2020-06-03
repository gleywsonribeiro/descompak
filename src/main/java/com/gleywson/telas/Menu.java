/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gleywson.telas;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gleywson
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu4.setText("Notas Fiscais");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Document-icon.png"))); // NOI18N
        jMenuItem1.setText("Separar Notas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Microsoft-Excel-2013-icon.png"))); // NOI18N
        jMenuItem2.setText("Exportar Excel");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Cadastro");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Sair");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        buscarJFileChooser();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buscarJFileChooser() {
        try {

            //Configurando o meu JFileChooser
            JFileChooser jfc = new JFileChooser();
            //Configura o filtro de seleção
            jfc.setFileFilter(new FileNameExtensionFilter("Arquivo PDF (*.pdf)", "pdf"));
            //Configura o Label do botão de seleção
            jfc.setApproveButtonText("Selecionar arquivo");
            //Configura o Título da caixa de Dialogo
            jfc.setDialogTitle("Seletor de notas");
            //Configura a possíbilidade de selecionar vários arquivos
            jfc.setAcceptAllFileFilterUsed(false);

            int returnVal = jfc.showOpenDialog(this);// Obs.: Esse "this" do argumento permite que o icone de canto do seu frame seja herdado deste.

            if (!(returnVal == JFileChooser.APPROVE_OPTION)) { // Teste o usuário seleionou algo
                return;
            }

            File arquivo = jfc.getSelectedFile();

            

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
