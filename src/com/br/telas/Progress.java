/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.telas;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 *
 * @author 39-01424
 */
public class Progress {

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator1;
    private javax.swing.JLabel labelMensagem;
    private String mensagem;
    private JWindow jWindow;
    private JFrame jFrame;
    private JDialog jDialog;

    public Progress(JFrame jFrame, String mensagem) {
        this.jFrame = jFrame;
        this.mensagem = mensagem;
        jWindow = new JWindow(jFrame);
    }

    public Progress(JDialog jDialog, String mensagem) {
        this.jDialog = jDialog;
        this.mensagem = mensagem;
        jWindow = new JWindow(jDialog);
    }

    public void gerarJanela() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelMensagem = new javax.swing.JLabel();
        jXTitledSeparator1 = new org.jdesktop.swingx.JXTitledSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/br/imagens/1489193545_database-px-png.png"))); // NOI18N

        labelMensagem.setText(mensagem);

        jProgressBar1.setIndeterminate(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(labelMensagem)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jWindow.add(jPanel1);
        jWindow.pack();
        if (jFrame != null) {
            jWindow.setLocationRelativeTo(jFrame);
        } else if (jDialog != null) {
            jWindow.setLocationRelativeTo(jDialog);
        }
        jWindow.setVisible(true);
    }

    public void fechar() {
        jWindow.dispose();
    }
}
