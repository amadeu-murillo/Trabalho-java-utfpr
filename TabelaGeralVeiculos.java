//Nome: Murillo Tadeu Amadeu -  RA: 02564246
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinal;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muril
 */
public class TabelaGeralVeiculos extends javax.swing.JFrame {
   //metodo singleton
    static TabelaGeralVeiculos cadVeicUnic;
   public static TabelaGeralVeiculos getCadVeicUnic(){
        if(cadVeicUnic == null){
            cadVeicUnic = new TabelaGeralVeiculos();
        }
        return cadVeicUnic;
        
    }
    /**
     * Creates new form TabelaGeralVeiculos
     */
    private TabelaGeralVeiculos() {
        initComponents();
        setLocationRelativeTo(null);
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
        tabMoto = new javax.swing.JTable();
        lMoto = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabCarro = new javax.swing.JTable();
        lMoto1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabOnibus = new javax.swing.JTable();
        lMoto2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veiculos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabMoto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PLACA", "COR", "PASSAGEIRO", "TARIFA", "TIPO", "DISTÂNCIA", "CALC TARIFA", "CONSUMO"
            }
        ));
        tabMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMotoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabMoto);
        if (tabMoto.getColumnModel().getColumnCount() > 0) {
            tabMoto.getColumnModel().getColumn(4).setHeaderValue("TIPO");
        }

        lMoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lMoto.setText("MOTO:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tabCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PLACA", "COR", "PASSAGEIRO", "TARIFA", "TIPO", "DISTÂNCIA", "CALC TARIFA", "CONSUMO"
            }
        ));
        tabCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCarroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabCarro);
        if (tabCarro.getColumnModel().getColumnCount() > 0) {
            tabCarro.getColumnModel().getColumn(4).setHeaderValue("TIPO");
        }

        lMoto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lMoto1.setText("CARRO:");

        tabOnibus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PLACA", "COR", "PASSAGEIRO", "TARIFA", "DISTÂNCIA", "CALC TARIFA", "CONSUMO"
            }
        ));
        tabOnibus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabOnibusMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabOnibus);

        lMoto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lMoto2.setText("ÔNIBUS:");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Vizualizar Pessoas Cadastradas...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(45, 45, 45)))
                        .addComponent(btSair)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lMoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lMoto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair)
                            .addComponent(jButton2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lMoto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
        listarTabCarro();
        listarTabOnibus();
    }//GEN-LAST:event_formWindowActivated

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void tabMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMotoMouseClicked
        selecionarItem();
    }//GEN-LAST:event_tabMotoMouseClicked

    private void tabCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCarroMouseClicked
        selecionarItemCarro();
    }//GEN-LAST:event_tabCarroMouseClicked

    private void tabOnibusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabOnibusMouseClicked
       selecionarItemOnibus();
    }//GEN-LAST:event_tabOnibusMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        chamaTabela();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void chamaTabela(){
        TabelaGeral.getCadTabelaUnic().setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public void listarTab(){
         
        DefaultTableModel modeloVeic = (DefaultTableModel) tabMoto.getModel();
        
        int poslimMoto =0;
        
        
      
        modeloVeic.setRowCount(poslimMoto);
        
        
        for (Moto mot : GerMoto.geraGerMoto().getBdMotos()){
            modeloVeic.insertRow(poslimMoto, new Object[]
                    {mot.getPlaca(),mot.getCor(),
                     mot.getQtdePassageiro(),
                     mot.getTarifa(),
                     String.valueOf(mot.getCorrida()),
                     mot.getDistancia(),
                     mot.calculaTarifa(),
                     mot.mostraConsumo(mot.getDistancia())
            });
            poslimMoto++;
        }
        
    }
    public void listarTabCarro() {
        DefaultTableModel modeloVeicCarro = (DefaultTableModel) tabCarro.getModel();
        int poslimCarro = 0;

        modeloVeicCarro.setRowCount(poslimCarro);

        for (Carro car : GerCarro.geraGerCarro().getBdCar()) {
            modeloVeicCarro.insertRow(poslimCarro, new Object[] {
                car.getPlaca(),
                car.getCor(),
                car.getQtdePassageiro(),
                car.getTarifa(),
                String.valueOf(car.getCorrida()),
                car.getDistancia(),
                car.calculaTarifa(),
                car.mostraConsumo(car.getDistancia())
            });
            poslimCarro++;
        }
    }
    public void listarTabOnibus() {
        DefaultTableModel modeloVeicOnibus = (DefaultTableModel) tabOnibus.getModel();
        int poslimOnibus = 0;

        modeloVeicOnibus.setRowCount(poslimOnibus);

        for (Onibus onibus : GerOnibus.geraGerOnibus().getBdOnibus()) {
            modeloVeicOnibus.insertRow(poslimOnibus, new Object[] {
                onibus.getPlaca(),
                onibus.getCor(),
                onibus.getQtdePassageiro(),
                onibus.getTarifa(),
                onibus.getDistancia(),
                onibus.calculaTarifa(),
                onibus.mostraConsumo(onibus.getDistancia())
            });
            poslimOnibus++;
        }
    }


        public void selecionarItem(){
        String linTab = "";
        
        int poslin = tabMoto.getSelectedRow();
        
        for(int col = 0; col <tabMoto.getColumnCount(); col++){
            linTab +="/ "+ tabMoto.getModel().getValueAt(poslin, col).toString();
        }
        JOptionPane.showMessageDialog(
                null,
                "VALORES SELECIONADOS SÃO: "+linTab+" ",
                "CAPTURA TABELA",
                1
        );
    }
        public void selecionarItemOnibus() {
            String linTab = "";

            int poslin = tabOnibus.getSelectedRow();

            for (int col = 0; col < tabOnibus.getColumnCount(); col++) {
                linTab += "/ " + tabOnibus.getModel().getValueAt(poslin, col).toString();
            }
            JOptionPane.showMessageDialog(
                    null,
                    "VALORES SELECIONADOS SÃO: " + linTab + " ",
                    "CAPTURA TABELA ÔNIBUS",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        public void selecionarItemCarro() {
            String linTab = "";

            int poslin = tabCarro.getSelectedRow();

            for (int col = 0; col < tabCarro.getColumnCount(); col++) {
                linTab += "/ " + tabCarro.getModel().getValueAt(poslin, col).toString();
            }
            JOptionPane.showMessageDialog(
                    null,
                    "VALORES SELECIONADOS SÃO: " + linTab + " ",
                    "CAPTURA TABELA CARRO",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saida",
                JOptionPane.YES_NO_OPTION
                //janela de confirmação
        );
        
        if(resp == 0){
            dispose();
        }
    }
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
            java.util.logging.Logger.getLogger(TabelaGeralVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaGeralVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaGeralVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaGeralVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaGeralVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lMoto;
    private javax.swing.JLabel lMoto1;
    private javax.swing.JLabel lMoto2;
    private javax.swing.JTable tabCarro;
    private javax.swing.JTable tabMoto;
    private javax.swing.JTable tabOnibus;
    // End of variables declaration//GEN-END:variables
}