package janelas;

import restoDaPorraToda.MontaParede;
import estruturas.*;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JanelaAjustes ajustes = new JanelaAjustes();
        ajustes.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File arquivo = null;
        JFileChooser seletorArquivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos XML", "xml");
        seletorArquivo.setFileFilter(filtro);
        int retorno = seletorArquivo.showOpenDialog(jPanel1);
        ArrayList<Parede> paredes = new ArrayList<Parede>();
        if (retorno == JFileChooser.APPROVE_OPTION) {
            arquivo = seletorArquivo.getSelectedFile();
            jTextField1.setText(arquivo.getName());
            paredes = new MontaParede().Monta(arquivo);
        }

        CalculaForcaBruta(paredes, 0.1);

    }//GEN-LAST:event_jButton1ActionPerformed

    private static int interseccao(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
            double y4) {
        double d = (x4 - x3) * (y1 - y2) - (x1 - x2) * (y4 - y3);
        if (d == 0) {
            return 0;
        }
        double ta = ((y3 - y4) * (x1 - x3) + (x4 - x3) * (y1 - y3)) / d;
        double tb = ((y1 - y2) * (x1 - x3) + (x2 - x1) * (y1 - y3)) / d;
        return (((ta >= 0) && (ta <= 1)) && ((tb >= 0) && (tb <= 1))) ? 1 : 0;
    }

    private void CalculaForcaBruta(ArrayList<Parede> paredes, double d) {

        ArrayList<Reta> retas = new ArrayList<Reta>();
        ArrayList<Celula> celulas = new ArrayList<Celula>();
        ArrayList<PontoAcesso> pas = new ArrayList<PontoAcesso>();

        pas.add(new PontoAcesso(10, 7.5));
        pas.add(new PontoAcesso(40, 7.5));

        double mx = 0; // maximo x
        double my = 0; // maximo y

        for (Parede p : paredes) {
            if (p.getX() + p.getLargura() > mx) {
                mx = p.getX() + p.getLargura();
            }
            if (p.getY() + p.getAltura() > my) {
                my = p.getY() + p.getAltura();
            }
            if (p.getLargura() > p.getAltura()) {
                retas.add(new Reta(p.getX(), p.getY() + p.getAltura() / 2, p.getX() + p.getLargura(), p.getY() + p.getAltura() / 2, p.getPerda()));
            }
            if (p.getAltura() > p.getLargura()) {
                retas.add(new Reta(p.getX() + p.getLargura() / 2, p.getY(), p.getX() + p.getLargura() / 2, p.getY() + p.getAltura(), p.getPerda()));
            }
        }

        // popular celula
        for (double i = 0; i < mx; i += d) {
            for (double j = 0; j < my; j += d) {
                celulas.add(new Celula(i, j));
            }
        }
        double db = 0;
        int cmaior24 = 0, cmenor0 = 0;
        for (Celula c : celulas) {
            for (PontoAcesso pa : pas) {
                db = 20 - 45 - 10 * 1.4 * Math.log10(Math.sqrt(Math.pow(pa.getX() - (c.getX() + d / 2), 2) + Math.pow(pa.getY() - (c.getY() + d / 2), 2)));

                for (Reta r : retas) {
                    db -= interseccao(pa.getX(), pa.getY(), c.getX() + d / 2, c.getY() + d / 2, r.getX1(), r.getY1(), r.getX2(), r.getY2()) * r.getP();
                }
                if (db > c.getPotencia()) {
                    c.setPotencia(db);
                }
            }
            
            if (c.getPotencia() < -89) {
                cmenor0++;
            }
            if (c.getPotencia() > -72) {
                cmaior24++;
            }
        }

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

        double f = Math.min(jPanel1.getWidth() / mx, jPanel1.getHeight() / my);
        Graphics g = jPanel1.getGraphics();

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
        for (Parede p : paredes) {
            g.setColor(Color.BLACK);
            g.fillRect((int) (p.getX() * f), (int) (p.getY() * f), (int) (p.getLargura() * f), (int) (p.getAltura() * f));
        }

        for (PontoAcesso pa : pas) {
            g.setColor(Color.WHITE);
            g.fillArc((int) ((pa.getX() * f) - (10 / 2)), (int) ((pa.getY() * f) - (10 / 2)), 10, 10, 0, 360);
        }
        /*for (Reta r : retas) {
            g.setColor(Color.RED);
            g.drawLine((int) (r.getX1() * f), (int) (r.getY1() * f), (int) (r.getX2() * f), (int) (r.getY2() * f));
        }*/
 /*for (Celula c : celulas) {
            g.setColor(Color.YELLOW);
            g.drawRect((int) (c.getX() * f), (int) (c.getY() * f), (int) (d * f), (int) (d * f));
        }*/
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
