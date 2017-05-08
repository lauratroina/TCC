package janelas;

import calculo.AlgoritmoGenetico;
import calculo.Cost231;
import calculo.Problema;
import estruturas.*;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import java.awt.Font;

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Abrir XML");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jButton2.setText("Configurações");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Calcular");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesenhaParedes(ArrayList<Parede> paredes, double d, double f, Graphics g) {
        for (Parede p : paredes) {
            g.setColor(Color.BLACK);
            g.fillRect((int) (p.getX() * f), (int) (p.getY() * f), (int) (p.getLargura() * f), (int) (p.getAltura() * f));
        }
    }

    private void DesenhaHeatMap(ArrayList<Celula> celulas, ArrayList<PontoAcesso> pas, double d, double f, Graphics g) {

        ArrayList<Frequencia> frequencias = new ArrayList<Frequencia>();
        frequencias.add(new Frequencia(-64, 0, 54, new Color(128, 0, 0)));
        frequencias.add(new Frequencia(-66, -64, 48, new Color(255, 0, 0)));
        frequencias.add(new Frequencia(-70, -66, 36, new Color(255, 128, 0)));
        frequencias.add(new Frequencia(-72, -70, 24, new Color(255, 255, 0)));
        frequencias.add(new Frequencia(-76, -72, 18, new Color(128, 255, 128)));
        frequencias.add(new Frequencia(-80, -76, 12, new Color(0, 255, 255)));
        frequencias.add(new Frequencia(-84, -80, 9, new Color(0, 128, 255)));
        frequencias.add(new Frequencia(-89, -84, 6, new Color(0, 0, 255)));
        frequencias.add(new Frequencia(-1000, -89, 0, new Color(0, 0, 128)));

        for (Celula celula : celulas) {
            Color cor = null;
            for (Frequencia freq : frequencias) {
                if (freq.getLimiteInfeior() < celula.getPotencia()
                        && celula.getPotencia() <= freq.getLimiteSuperior()) {
                    cor = freq.getCor();
                }
            }

            g.setColor(cor);
            g.fillRect((int) (celula.getX() * f), (int) (celula.getY() * f), (int) (d * f + 1), (int) (d * f + 1));
        }

        //Desenha os AP's
        for (PontoAcesso pa : pas) {
            g.setColor(Color.WHITE);
            g.fillArc((int) ((pa.getX() * f) - (10 / 2)), (int) ((pa.getY() * f) - (10 / 2)), 10, 10, 0, 360);
        }

        //Legenda
        g.setFont(new Font("Serif", Font.BOLD, 16));
        int i = 0;
        for (Frequencia freq : frequencias) {

            g.setColor(freq.getCor());
            g.fillRect(
                    (int) (i * (jPanel1.getWidth() / frequencias.size())),
                    (int) (15 * f + 10),
                    (int) (jPanel1.getWidth() / frequencias.size()),
                    30);
            g.setColor(Color.black);
            g.drawString(
                    String.valueOf(freq.getTaxa()),
                    (int) (i * (jPanel1.getWidth() / frequencias.size()) + (jPanel1.getWidth() / frequencias.size()) / 2) - 10,
                    (int) (15 * f + 20 + 10)
            );

            i++;
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JanelaAjustes ajustes = new JanelaAjustes();
        ajustes.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Problema problemaCost = new Cost231();
        File arquivo = null;
        problemaCost.planta = new Planta();
        JFileChooser seletorArquivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos XML", "xml");
        seletorArquivo.setFileFilter(filtro);
        int retorno = seletorArquivo.showOpenDialog(jPanel1);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            arquivo = seletorArquivo.getSelectedFile();
            jTextField1.setText(arquivo.getName());
            problemaCost.planta.Monta(arquivo, 0.5);
        }

        AlgoritmoGenetico ag = new AlgoritmoGenetico();

        double[][] minMax = {{0, problemaCost.planta.mx}, {0, problemaCost.planta.my},
        {0, problemaCost.planta.mx}, {0, problemaCost.planta.my},
        {0, problemaCost.planta.mx}, {0, problemaCost.planta.my}};

        //ag.inicializa(2, 25, 50, 0.9, 0.001, 2, false, minMax, problemaCost);
        //inicializa(numeroGenes, numeroIndividuos, numeroGeracoes, probabilidadeCrossover, 
        //probabilidadeMutacao, numeroIndividuosSelecionados, elitismo {
        // System.out.printf("Execução = %d\n", c);
        for (int c = 0; c < 10; c++) {
            ag.inicializa(6, 30, 65, 0.9, 0.01, 5, true, minMax, problemaCost);
            ag.executa();
        }
        problemaCost.avalia(ag.getMelhorIndividuo());

        problemaCost.planta.pas = new ArrayList<PontoAcesso>();
        for (int i = 0; i < (ag.getMelhorIndividuo().length / 2); i++) {
            problemaCost.planta.pas.add(new PontoAcesso(ag.getMelhorIndividuo()[i * 2], ag.getMelhorIndividuo()[i * 2 + 1]));
        }
        double f = Math.min(jPanel1.getWidth() / problemaCost.planta.mx, jPanel1.getHeight() / problemaCost.planta.my);
        Graphics g = jPanel1.getGraphics();
        DesenhaHeatMap(problemaCost.planta.celulas, problemaCost.planta.pas, problemaCost.planta.d, f, g);
        DesenhaParedes(problemaCost.planta.paredes, problemaCost.planta.d, f, g);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
