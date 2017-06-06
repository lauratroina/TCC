package janelas;

import calculo.Cost231;
import calculo.FuncaoObjetivo;
import estruturas.Parametros;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaAjustes extends javax.swing.JFrame {

    private Parametros parametros;
    private JButton botao;
    public JanelaAjustes(Parametros parametros, JButton botao) {
        initComponents();
        this.parametros = parametros;
        this.botao = botao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabelIndividusoSelecionados = new javax.swing.JLabel();
        jLabelNumeroIndividuos = new javax.swing.JLabel();
        jLabelNumeroGeracoes = new javax.swing.JLabel();
        jLabelProbabilidadeCrossover = new javax.swing.JLabel();
        jLabelProbabilidadeMutacao = new javax.swing.JLabel();
        jLabelElitismo = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jtElitismo = new javax.swing.JCheckBox();
        jtMetodoCalculo = new javax.swing.JComboBox<>();
        jLabelParametrosDoAg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelParametrosProblema = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelTaxaDesejada = new javax.swing.JLabel();
        jLabelTaxaAceitavel = new javax.swing.JLabel();
        jLabelPassoHillClimbing = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelMetodoCalculo = new javax.swing.JLabel();
        jTaxaDesejada = new javax.swing.JComboBox<>();
        jTaxaAceitavel = new javax.swing.JComboBox<>();
        jNumeroIndividuos = new javax.swing.JSpinner();
        jNumeroGeracoes = new javax.swing.JSpinner();
        jProbabilidadeCrossover = new javax.swing.JSpinner();
        jProbabilidadeMutacao = new javax.swing.JSpinner();
        jNumeroIndividuosSelecionados = new javax.swing.JSpinner();
        jPassoHillClimbing = new javax.swing.JSpinner();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabelIndividusoSelecionados.setText("Número de Indivíduos Selecionados");

        jLabelNumeroIndividuos.setText("Número de indivíduos");

        jLabelNumeroGeracoes.setText("Número de gerações");

        jLabelProbabilidadeCrossover.setText("Probabilidade de Crossover");

        jLabelProbabilidadeMutacao.setText("Probabilidade de Mutação");

        jLabelElitismo.setText("Elitismo");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtElitismo.setSelected(true);
        jtElitismo.setText("Permitir elitismo");
        jtElitismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtElitismoActionPerformed(evt);
            }
        });

        jtMetodoCalculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ITU-r", "Cost 231" }));
        jtMetodoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMetodoCalculoActionPerformed(evt);
            }
        });

        jLabelParametrosDoAg.setText("Parâmetros do Algoritmo Genético");

        jLabelParametrosProblema.setText("Parâmetros do Problema");

        jLabelTaxaDesejada.setText("Menor taxa de transferência desejada");
        jLabelTaxaDesejada.setPreferredSize(new java.awt.Dimension(275, 17));

        jLabelTaxaAceitavel.setText("Menor taxa de transferência aceitável");
        jLabelTaxaAceitavel.setPreferredSize(new java.awt.Dimension(275, 17));

        jLabelPassoHillClimbing.setText("Passo Hill-Climbing");
        jLabelPassoHillClimbing.setPreferredSize(new java.awt.Dimension(275, 17));

        jLabelMetodoCalculo.setText("Método para calcular a perda");

        jTaxaDesejada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "6", "9", "12", "18", "24", "36", "48", "54" }));
        jTaxaDesejada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxaDesejadaActionPerformed(evt);
            }
        });

        jTaxaAceitavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "6", "9", "12", "18", "24", "36", "48", "54" }));
        jTaxaAceitavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxaAceitavelActionPerformed(evt);
            }
        });

        jNumeroIndividuos.setModel(new javax.swing.SpinnerNumberModel(30, 0, 300, 1));
        jNumeroIndividuos.setToolTipText("");

        jNumeroGeracoes.setModel(new javax.swing.SpinnerNumberModel(50, 0, 300, 1));

        jProbabilidadeCrossover.setModel(new javax.swing.SpinnerNumberModel(0.8999999761581421d, 0.0d, 1.0d, 0.10000000149011612d));

        jProbabilidadeMutacao.setModel(new javax.swing.SpinnerNumberModel(0.009999999776482582d, 0.0d, 1.0d, 0.009999999776482582d));

        jNumeroIndividuosSelecionados.setModel(new javax.swing.SpinnerNumberModel(2, 0, 150, 1));

        jPassoHillClimbing.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 5.0d, 0.009999999776482582d));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabelParametrosProblema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelProbabilidadeCrossover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelElitismo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelNumeroIndividuos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(84, 84, 84))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNumeroGeracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelProbabilidadeMutacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelIndividusoSelecionados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTaxaAceitavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(149, 149, 149))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTaxaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelMetodoCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(96, 96, 96))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelPassoHillClimbing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtMetodoCalculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtElitismo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTaxaDesejada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTaxaAceitavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNumeroIndividuos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jNumeroGeracoes)
                                    .addComponent(jProbabilidadeCrossover, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jProbabilidadeMutacao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jNumeroIndividuosSelecionados, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPassoHillClimbing, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(23, 23, 23)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabelParametrosDoAg)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelParametrosDoAg)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelElitismo)
                    .addComponent(jtElitismo))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroIndividuos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumeroIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroGeracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumeroGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProbabilidadeCrossover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProbabilidadeCrossover, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIndividusoSelecionados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNumeroIndividuosSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelParametrosProblema, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTaxaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTaxaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTaxaAceitavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTaxaAceitavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtMetodoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMetodoCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPassoHillClimbing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPassoHillClimbing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jProbabilidadeMutacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelProbabilidadeMutacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jbSalvar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ValidaNumero(JTextField campo) { 
	long valor; 
	if (campo.getText().length() != 0){ 
		try { 
			valor = Long.parseLong(campo.getText()); 
		}catch(NumberFormatException ex){ 
			JOptionPane.showMessageDialog(null, "Esse Campo só aceita números" ,"Informação",JOptionPane.INFORMATION_MESSAGE); 
			campo.grabFocus(); 
		} 
	} 
} 

    private void jtMetodoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMetodoCalculoActionPerformed

    }//GEN-LAST:event_jtMetodoCalculoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        int numeroIndividuos = (Integer)this.jNumeroIndividuos.getValue();
        int numeroGeracoes = (Integer) this.jNumeroGeracoes. getValue();
        double probabilidadeMutacao = (Double) this.jProbabilidadeMutacao.getValue();
        double probabilidadeCrossover = (Double) this.jProbabilidadeCrossover.getValue();
        int individuosSelecionados = (Integer) this.jNumeroIndividuosSelecionados.getValue();
        boolean elitismo = this.jtElitismo.isSelected();
        int metodoCalculo = this.jtMetodoCalculo.getSelectedIndex();
        int taxaAceitavel = Integer.parseInt(this.jTaxaAceitavel.getSelectedItem().toString());
        int taxaDesejada = Integer.parseInt(this.jTaxaDesejada.getSelectedItem().toString());
        double hillClimbing = (Double) this.jPassoHillClimbing.getValue();

        parametros.setParametros(numeroIndividuos, numeroGeracoes, probabilidadeCrossover,
            probabilidadeMutacao, individuosSelecionados, elitismo, metodoCalculo,
            taxaDesejada, taxaAceitavel, hillClimbing);
        
        botao.setEnabled(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtElitismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtElitismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtElitismoActionPerformed

    private void jTaxaDesejadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaxaDesejadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTaxaDesejadaActionPerformed

    private void jTaxaAceitavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaxaAceitavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTaxaAceitavelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelElitismo;
    private javax.swing.JLabel jLabelIndividusoSelecionados;
    private javax.swing.JLabel jLabelMetodoCalculo;
    private javax.swing.JLabel jLabelNumeroGeracoes;
    private javax.swing.JLabel jLabelNumeroIndividuos;
    private javax.swing.JLabel jLabelParametrosDoAg;
    private javax.swing.JLabel jLabelParametrosProblema;
    private javax.swing.JLabel jLabelPassoHillClimbing;
    private javax.swing.JLabel jLabelProbabilidadeCrossover;
    private javax.swing.JLabel jLabelProbabilidadeMutacao;
    private javax.swing.JLabel jLabelTaxaAceitavel;
    private javax.swing.JLabel jLabelTaxaDesejada;
    private javax.swing.JSpinner jNumeroGeracoes;
    private javax.swing.JSpinner jNumeroIndividuos;
    private javax.swing.JSpinner jNumeroIndividuosSelecionados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jPassoHillClimbing;
    private javax.swing.JSpinner jProbabilidadeCrossover;
    private javax.swing.JSpinner jProbabilidadeMutacao;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jTaxaAceitavel;
    private javax.swing.JComboBox<String> jTaxaDesejada;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JCheckBox jtElitismo;
    private javax.swing.JComboBox<String> jtMetodoCalculo;
    // End of variables declaration//GEN-END:variables
}
