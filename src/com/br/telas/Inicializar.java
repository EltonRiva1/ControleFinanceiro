/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.telas;

import com.br.utils.Msg;
import com.br.utils.Singleton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

/**
 *
 * @author 39-01424
 */
public class Inicializar {

    private static Progress p;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            SwingUtilities.updateComponentTreeUI(new JFrame());
        } catch (Exception e) {
            e.printStackTrace();
            Msg.erro(null, "Erro ao aplicar o tema");
        }
        p = new Progress(new JFrame(), "Aguarde, inicializando o sistema!");
        SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                p.gerarJanela();
                Singleton.setConnection();
                return null;
            }

            @Override
            protected void done() {
                p.fechar();
                new TelaPrincipal().setVisible(true);
            }
        };
        worker.execute();
    }
}
