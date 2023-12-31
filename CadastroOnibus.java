//Nome: Murillo Tadeu Amadeu -  RA: 02564246
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class CadastroOnibus extends javax.swing.JFrame {
    //metodo singleton
    static CadastroOnibus cadOnibusdUnic;    
    public static CadastroOnibus getCadOnibusUnic(){
        if(cadOnibusdUnic == null){
            cadOnibusdUnic = new CadastroOnibus();
        }
        return cadOnibusdUnic;
        
    }
    /**
     * Creates new form CadastroOnibus
     */
    private CadastroOnibus() {
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

        lPaisMot = new javax.swing.JLabel();
        cxPlaca = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        lNomeMot = new javax.swing.JLabel();
        cxCor = new javax.swing.JTextField();
        lCpfMot = new javax.swing.JLabel();
        cxQtdePassageiro = new javax.swing.JTextField();
        cxTarifa = new javax.swing.JTextField();
        lQtdeViagemot = new javax.swing.JLabel();
        lIdadeMot = new javax.swing.JLabel();
        cxDistancia = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btVeic = new javax.swing.JButton();
        btPessoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Ônibus");

        lPaisMot.setText("Distância:");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lNomeMot.setText("Placa:");

        lCpfMot.setText("Cor:");

        lQtdeViagemot.setText("Quantidade de Passageiros:");

        lIdadeMot.setText("Tarifa unitária:");

        btSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpar.setText("Limpar Formulário");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btVeic.setText("Tabela Cadastro veiculos...");
        btVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeicActionPerformed(evt);
            }
        });

        btPessoa.setText("Tabela Cadastro Pessoas...");
        btPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPessoaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Para Pesquisar digite uma placa válida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btPessoa)
                            .addGap(18, 18, 18)
                            .addComponent(btVeic)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btConsultar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btAlterar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btDeletar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btLimpar)
                                    .addGap(52, 52, 52)
                                    .addComponent(btSair)))
                            .addGap(24, 24, 24)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lIdadeMot, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lQtdeViagemot, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cxQtdePassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lNomeMot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lCpfMot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxCor))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(cxTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(64, 64, 64)
                            .addComponent(lPaisMot)
                            .addGap(18, 18, 18)
                            .addComponent(cxDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(lIdadeMot)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(btAlterar)
                    .addComponent(btDeletar))
                .addGap(20, 20, 20)
                .addComponent(btCadastrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btPessoa)
                    .addComponent(btVeic))
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNomeMot)
                        .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lCpfMot)
                        .addComponent(cxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lPaisMot)
                        .addComponent(cxDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addComponent(cxTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lQtdeViagemot)
                        .addComponent(cxQtdePassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(111, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        insOnibus();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consOnibus();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altOnibus();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        delOnibusPlaca();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeicActionPerformed
        chamaTabelaVeic();
    }//GEN-LAST:event_btVeicActionPerformed

    private void btPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPessoaActionPerformed
        chamaTabela();
    }//GEN-LAST:event_btPessoaActionPerformed
    public void chamaTabelaVeic(){
        TabelaGeralVeiculos.getCadVeicUnic().setVisible(true);
    }
    public void chamaTabela(){
        TabelaGeral.getCadTabelaUnic().setVisible(true);
    }
    private boolean camposVazios() {
    return cxTarifa.getText().isEmpty()
            || cxDistancia.getText().isEmpty()
            || cxPlaca.getText().isEmpty()
            || cxCor.getText().isEmpty();
            
}

public void insOnibus() {
    Onibus onibus = new Onibus();

    if (camposVazios()) {
        JOptionPane.showMessageDialog(
            null,
            "Preencha todos os campos para cadastrar o ônibus.",
            "Campos Vazios",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    try {
        onibus.setPlaca(cxPlaca.getText());
    } catch (PlacaException ex) {
        ex.impErroPlaca();
	onibus =(Onibus) ex.corPlaca(onibus);
        Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
    }

    onibus.setCor(cxCor.getText());
    boolean distanciaValida = false;
        while (!distanciaValida) {
            try {
                     onibus.setDistancia(Double.parseDouble(cxDistancia.getText()));
                    distanciaValida = true; 
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    null,
                    "A Distância deve ser um numero.",
                    "Erro de Formato",
                    JOptionPane.ERROR_MESSAGE
                );



                cxDistancia.setText(JOptionPane.showInputDialog(null, "INFORME A DISTÂNCIA NOVAMENTE:"));
            }
        }
    //-----------------------------------------------------------------
       
    //--------------------------------------------------------------
    boolean tarifaValida = false;
        while (!tarifaValida) {
            try {
                   onibus.setPassagem(Float.parseFloat(cxTarifa.getText()));
                    tarifaValida = true; // Define como verdadeiro se a conversão for bem-sucedida
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    null,
                    "A tarifa deve ser um numero.",
                    "Erro de Formato",
                    JOptionPane.ERROR_MESSAGE
                );



                cxTarifa.setText(JOptionPane.showInputDialog(null, "INFORME A TARIFA NOVAMENTE:"));
            }
        }
    
    
    onibus.setPassageiro(Integer.parseInt(cxQtdePassageiro.getText()));

    onibus = GerOnibus.geraGerOnibus().insOnibus(onibus);

    if (onibus != null) {
        JOptionPane.showMessageDialog(
            null,
            "ÔNIBUS CADASTRADO",
            "Confirmar Cadastro",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(
            null,
            "ERRO AO CADASTRAR ÔNIBUS",
            "ERRO",
            JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();
}

public void consOnibus() {
    Onibus onibus = new Onibus();

    if (cxPlaca.getText().isEmpty()) {
        JOptionPane.showMessageDialog(
            null,
            "Digite a placa para consultar o ônibus.",
            "Campo Vazio",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    try {
        onibus.setPlaca(cxPlaca.getText());
    } catch (PlacaException ex) {
        ex.impErroPlaca();
	onibus =(Onibus) ex.corPlaca(onibus);
        Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
    }

    onibus = GerOnibus.geraGerOnibus().consOnibusPlaca(onibus);

    if (onibus != null) {
        cxPlaca.setText(onibus.getPlaca());
        cxCor.setText(onibus.getCor());
        cxQtdePassageiro.setText(String.valueOf(onibus.getQtdePassageiro()));
        cxTarifa.setText(String.valueOf(onibus.getTarifa()));
       
        cxDistancia.setText(String.valueOf(onibus.getDistancia()));

        JOptionPane.showMessageDialog(
            null,
            "ÔNIBUS ENCONTRADO",
            "CONSULTA DE ÔNIBUS",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        limpar();
        JOptionPane.showMessageDialog(
            null,
            "PLACA NÃO ENCONTRADA",
            "ÔNIBUS NÃO CADASTRADO",
            JOptionPane.ERROR_MESSAGE
        );
    }
}

public void altOnibus() {
    Onibus onibus = new Onibus();

    if (camposVazios()) {
        JOptionPane.showMessageDialog(
            null,
            "Preencha todos os campos para alterar os dados do ônibus.",
            "Campos Vazios",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    try {
        onibus.setPlaca(cxPlaca.getText());
    } catch (PlacaException ex) {
        ex.impErroPlaca();
	onibus =(Onibus) ex.corPlaca(onibus);
        Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
    }

    onibus = GerOnibus.geraGerOnibus().atualizaOnibus(onibus);

    if (onibus != null) {
        cxPlaca.setText(onibus.getPlaca());
        cxCor.setText(onibus.getCor());

        JOptionPane.showMessageDialog(
            null,
            "DADOS DO ÔNIBUS ALTERADOS",
            "ALTERAÇÃO DE CADASTRO",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        limpar();
        JOptionPane.showMessageDialog(
            null,
            "PLACA NÃO ENCONTRADA",
            "ÔNIBUS NÃO ENCONTRADO",
            JOptionPane.ERROR_MESSAGE
        );
    }
}

public void delOnibusPlaca() {
    Onibus onibus = new Onibus();

    if (cxPlaca.getText().isEmpty()) {
        JOptionPane.showMessageDialog(
            null,
            "Digite a placa para excluir o ônibus.",
            "Campo Vazio",
            JOptionPane.WARNING_MESSAGE
        );
        return;
    }

   try {
        onibus.setPlaca(cxPlaca.getText());
    } catch (PlacaException ex) {
        ex.impErroPlaca();
	onibus =(Onibus) ex.corPlaca(onibus);
        Logger.getLogger(CadastroCarro.class.getName()).log(Level.SEVERE, null, ex);
    }

    onibus = GerOnibus.geraGerOnibus().delOnibusPlaca(onibus);

    if (onibus == null) {
        JOptionPane.showMessageDialog(
            null,
            "ÔNIBUS EXCLUÍDO",
            "EXCLUIR ÔNIBUS",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(
            null,
            "PLACA NÃO ENCONTRADA",
            "ÔNIBUS NÃO ENCONTRADO",
            JOptionPane.ERROR_MESSAGE
        );
    }
    limpar();
}

    public void limpar(){
        cxCor.setText("");
        cxPlaca.setText("");
        cxTarifa.setText("");
        
        cxQtdePassageiro.setText("");
        cxDistancia.setText("");
        
        cxPlaca.requestFocus();
        
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
            java.util.logging.Logger.getLogger(CadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroOnibus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroOnibus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPessoa;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVeic;
    private javax.swing.JTextField cxCor;
    private javax.swing.JTextField cxDistancia;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JTextField cxQtdePassageiro;
    private javax.swing.JTextField cxTarifa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lCpfMot;
    private javax.swing.JLabel lIdadeMot;
    private javax.swing.JLabel lNomeMot;
    private javax.swing.JLabel lPaisMot;
    private javax.swing.JLabel lQtdeViagemot;
    // End of variables declaration//GEN-END:variables
}
