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
public class CadastroMotorista extends javax.swing.JFrame {
    //metodo singleton
    static CadastroMotorista cadMotUnic;    
    public static CadastroMotorista getCadPMotUnic(){
        if(cadMotUnic == null){
            cadMotUnic = new CadastroMotorista();
        }
        return cadMotUnic;
        
    }
    /**
     * Creates new form CadastroMotorista
     */
    private CadastroMotorista() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private boolean camposVazios() {
        return cxCpf.getText().isEmpty()
                || cxNome.getText().isEmpty()
                || cxRua.getText().isEmpty()
                || cxPais.getText().isEmpty()
                || cxNumero.getText().isEmpty()
                || cxIdade.getText().isEmpty()
                || cxQtdeViagens.getText().isEmpty();
    }
    //inserir motorista
    public void insMotorista(){
        Motorista mo = new Motorista();
        
        if (camposVazios()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Preencha todos os campos para cadastrar o motorista.",
                    "Campos Vazios",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        boolean cpfValido = false;
        while (!cpfValido) {
            try {
                    mo.setCpf(Integer.parseInt(cxCpf.getText()));
                    cpfValido = true; // Define como verdadeiro se a conversão for bem-sucedida
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    null,
                    "O CPF deve ser um número válido.",
                    "Erro de Formato",
                    JOptionPane.ERROR_MESSAGE
                );



                cxCpf.setText(JOptionPane.showInputDialog(null, "INFORME O CPF NOVAMENTE:"));
            }
        }
        try {
            mo.setNome(cxNome.getText());
        } catch (NomeException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mo.getEnder().setRua(cxRua.getText());
        mo.getEnder().setPais(cxPais.getText());
        mo.getEnder().setNumero(Integer.parseInt(cxNumero.getText()));
        mo.setQtde(Integer.parseInt(cxQtdeViagens.getText()));
        try {
        mo.setIdade(Integer.parseInt(cxIdade.getText()));
        } catch (IdadeException ex) {
        IdadeException idadeExcecao = new IdadeException();
        Pessoa pessoaAtualizada = idadeExcecao.corIdade(mo);
        mo = (Motorista) pessoaAtualizada;
    } catch (NumberFormatException ex) {
        IdadeException idadeExcecao = new IdadeException();
        Pessoa pessoaAtualizada = idadeExcecao.corIdade(mo);
        mo = (Motorista) pessoaAtualizada;
    }
        
        mo = GerMotorista.geraGerMotorista().insMotorista(mo);
        
        if(mo != null){
           JOptionPane.showMessageDialog(
                   null,
                   "Motorista Cadastrado",
                   "Confirmar Cadastro",
                   JOptionPane.INFORMATION_MESSAGE
           
           );
        }
        else{
            JOptionPane.showMessageDialog(
                   null,
                   "ERRO AO CADASTRAR MOTORISTA",
                   "ERRO",
                   JOptionPane.ERROR_MESSAGE
            );
        }
        limpar();
    }
    public void consMotorista(){
        Motorista mo = new Motorista();
         if (cxCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Digite o CPF para consultar o motorista.",
                    "Campo Vazio",
                    JOptionPane.WARNING_MESSAGE
            );
            return; // Não prosseguir se o campo CPF estiver vazio
        }
        mo.setCpf(Integer.parseInt(cxCpf.getText()));
        
        
        mo = GerMotorista.geraGerMotorista().consMotoristaCpf(mo);
        
        if(mo != null){
            cxCpf.setText(Integer.toString(mo.getCpf()));
            cxNome.setText(mo.getNome());
            cxRua.setText(mo.getEnder().getRua());
            cxPais.setText(mo.getEnder().getPais());
            cxNumero.setText(String.valueOf(mo.getEnder().getNumero()));
            cxIdade.setText(String.valueOf(mo.getIdade()));
            lImpPro.setText(String.valueOf(mo.impPro()));
           JOptionPane.showMessageDialog(
                   null,
                   "MOTORISTA ENCONTRADO",
                   "CONSULTA DE MOTORISTA",
                   JOptionPane.INFORMATION_MESSAGE
           
           );
        }
        else{
            limpar();
            JOptionPane.showMessageDialog(
                   null,
                   "CPF NÃO ENCONTRADO",
                   "MOTORISTA NÃO CADASTRADO",
                   JOptionPane.ERROR_MESSAGE
            );
        }
        
    }
    public void altMotorista(){
        Motorista mo = new Motorista();
         if (camposVazios()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Preencha todos os campos para alterar os dados do motorista.",
                    "Campos Vazios",
                    JOptionPane.WARNING_MESSAGE
            );
            return; 
        }
        mo.setCpf(Integer.parseInt(cxCpf.getText()));
        
        
        mo = GerMotorista.geraGerMotorista().atualizaMotoristaCpf(mo);
        
        if(mo != null){
            cxCpf.setText(Integer.toString(mo.getCpf()));
            cxNome.setText(mo.getNome());
            cxRua.setText(mo.getEnder().getRua());
            cxPais.setText(mo.getEnder().getPais());
            cxNumero.setText(String.valueOf(mo.getEnder().getNumero()));
            lImpPro.setText(String.valueOf(mo.impPro()));
            cxIdade.setText(String.valueOf(mo.getIdade()));
           JOptionPane.showMessageDialog(
                   null,
                   "DADOS DO MOTORISTA ALTERADO",
                   "ALETRAÇÃO DE CADASTRO",
                   JOptionPane.INFORMATION_MESSAGE
           
           );
        }
        else{
            limpar();
            JOptionPane.showMessageDialog(
                   null,
                   "CPF NÃO ENCONTRADO",
                   "MOTORISTA NÃO ENCONTRADO",
                   JOptionPane.ERROR_MESSAGE
            );
        }
        //limpar();
    }
    public void delMotoristaCpf(){
        Motorista mo = new Motorista();
        if (cxCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Digite o CPF para excluir o motorista.",
                    "Campo Vazio",
                    JOptionPane.WARNING_MESSAGE
            );
            return; // Não prosseguir se o campo CPF estiver vazio
        }
        mo.setCpf(Integer.parseInt(cxCpf.getText()));
        
        //comunica com GerPes
        mo = GerMotorista.geraGerMotorista().delMotoristaCpf(mo);
        
        if(mo == null){
            
           JOptionPane.showMessageDialog(
                   null,
                   "MOTORISTA EXCLUIDO",
                   "EXCLUIR MOTORISTA",
                   JOptionPane.INFORMATION_MESSAGE
           
           );
        }
        else{
 
            JOptionPane.showMessageDialog(
                   null,
                   "CPF NÃO ENCONTRADO",
                   "MOTORISTA NÃO ENCONTRADO",
                   JOptionPane.ERROR_MESSAGE
            );
        }
        limpar();
    }
    public void limpar(){
        cxCpf.setText("");
        cxNome.setText("");
        cxIdade.setText("");
        cxNumero.setText("");
        cxRua.setText("");
        cxQtdeViagens.setText("");
        cxPais.setText("");
        
        cxNome.requestFocus();
        
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNomeMot = new javax.swing.JLabel();
        lCpfMot = new javax.swing.JLabel();
        lIdadeMot = new javax.swing.JLabel();
        lQtdeViagemot = new javax.swing.JLabel();
        lNumMot = new javax.swing.JLabel();
        lRuaMot = new javax.swing.JLabel();
        lPaisMot = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxCpf = new javax.swing.JTextField();
        cxIdade = new javax.swing.JTextField();
        cxQtdeViagens = new javax.swing.JTextField();
        cxRua = new javax.swing.JTextField();
        cxPais = new javax.swing.JTextField();
        cxNumero = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lImpPro = new javax.swing.JLabel();
        btAltera = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        btPesquisa = new javax.swing.JButton();
        cbSeleciona = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Motorista");

        lNomeMot.setText("Nome:");

        lCpfMot.setText("Cpf:");

        lIdadeMot.setText("Idade:");

        lQtdeViagemot.setText("Quantidade de Viagens:");

        lNumMot.setText("Numero:");

        lRuaMot.setText("Rua:");

        lPaisMot.setText("Pais:");

        btSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Limpar Formulário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Informações do Motorista:");

        lImpPro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btAltera.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAltera.setText("Alterar Cadastro");
        btAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlteraActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btExcluir.setText("Excluir Cadastro");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastro.setText("Cadastrar...");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        btPesquisa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btPesquisa.setText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        cbSeleciona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Moto", "Ônibus", "Carro" }));
        cbSeleciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelecionaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Selecione o Veiculo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Para Pesquisar digitar apenas cpf válido que ja tenha cadastro");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lNomeMot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lCpfMot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cxCpf))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lIdadeMot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(66, 66, 66)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lPaisMot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lRuaMot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lNumMot, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cxRua)
                                        .addComponent(cxPais)
                                        .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btCadastro)
                                    .addGap(18, 18, 18)
                                    .addComponent(btPesquisa)
                                    .addGap(18, 18, 18)
                                    .addComponent(btAltera)
                                    .addGap(18, 18, 18)
                                    .addComponent(btExcluir)
                                    .addGap(50, 50, 50)
                                    .addComponent(cbSeleciona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lQtdeViagemot, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxQtdeViagens, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(lImpPro))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52)
                .addComponent(btSair)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNomeMot)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lRuaMot)
                    .addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpfMot)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPaisMot)
                    .addComponent(cxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lIdadeMot)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lNumMot)
                        .addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lQtdeViagemot)
                        .addComponent(cxQtdeViagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lImpPro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSeleciona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastro)
                    .addComponent(btPesquisa)
                    .addComponent(btAltera)
                    .addComponent(btExcluir))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraActionPerformed
        altMotorista();
    }//GEN-LAST:event_btAlteraActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        delMotoristaCpf();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        passaPag();
        
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        consMotorista();
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void cbSelecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelecionaActionPerformed
        
    }//GEN-LAST:event_cbSelecionaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        chamaTabela();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void chamaTabela(){
        TabelaGeral.getCadTabelaUnic().setVisible(true);
    }
    public void passaPag(){
        String veiculo = cbSeleciona.getSelectedItem().toString();
        if(camposVazios() == true){
                insMotorista();
        }else if(veiculo.equals("Escolha")){
                JOptionPane.showMessageDialog(
                    null,
                    "SELECIONE UMA OPÇÃO DE VEICULO.",
                    "Campos Vazios",
                    JOptionPane.WARNING_MESSAGE
                );
            return;
        }else{
            insMotorista();
            selecionaVeic();
        }
    }
    
    public void selecionaVeic(){
        String veiculo = cbSeleciona.getSelectedItem().toString();
            if(veiculo.equals("Carro")){
           
                CadastroCarro();
            }else if(veiculo.equals("Moto")){
               
                CadastroMoto();
            }else if(veiculo.equals("Ônibus")){
                
                CadastroOnibus();       
            }
    }
     public void CadastroOnibus(){
        CadastroOnibus.getCadOnibusUnic().setVisible(true);
    }
    public void CadastroCarro(){
        CadastroCarro.getCadCarroUnic().setVisible(true);
    }
    public void CadastroMoto(){
        CadastroMoto.getCadPMotoUnic().setVisible(true); 
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
            java.util.logging.Logger.getLogger(CadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMotorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltera;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbSeleciona;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxPais;
    private javax.swing.JTextField cxQtdeViagens;
    private javax.swing.JTextField cxRua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lCpfMot;
    private javax.swing.JLabel lIdadeMot;
    private javax.swing.JLabel lImpPro;
    private javax.swing.JLabel lNomeMot;
    private javax.swing.JLabel lNumMot;
    private javax.swing.JLabel lPaisMot;
    private javax.swing.JLabel lQtdeViagemot;
    private javax.swing.JLabel lRuaMot;
    // End of variables declaration//GEN-END:variables
}
