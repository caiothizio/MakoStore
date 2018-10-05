/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.view;

import java.io.IOException;
import javax.swing.JOptionPane;
import mako.controller.FornecedorDAO;
import mako.controller.Relatorio;
import mako.controller.Watermark;
import mako.model.Fornecedor;

/**
 *
 * @author CaioThizio
 */
public class CadastroFornecedor extends javax.swing.JFrame {
    private Fornecedor f = new Fornecedor();
    /**
     * Creates new form CadastroProduto
     */
    public CadastroFornecedor() {
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

        buttonGroupFornecedor = new javax.swing.ButtonGroup();
        buttonGrouptipoPes = new javax.swing.ButtonGroup();
        painelFornecedor = new javax.swing.JPanel();
        apresentacaoFornecedor = new javax.swing.JLabel();
        painelCamposFornecedor = new javax.swing.JPanel();
        labelNomeFornecedor = new javax.swing.JLabel();
        textNomeFornecedor = new javax.swing.JTextField();
        labelEndFornecedor = new javax.swing.JLabel();
        textEndFornecedor = new javax.swing.JTextField();
        labelIdFornecedor = new javax.swing.JLabel();
        textIdFornecedor = new javax.swing.JTextField();
        labelContatoFornecedor = new javax.swing.JLabel();
        textContatoFornecedor = new javax.swing.JTextField();
        labelPagFornecedor = new javax.swing.JLabel();
        textPagFornecedor = new javax.swing.JTextField();
        labelObservacoesFornecedor = new javax.swing.JLabel();
        buttonVoltarFornecedor = new javax.swing.JButton();
        buttonLimparFornecedor = new javax.swing.JButton();
        buttonCadastrarFornecedor = new javax.swing.JButton();
        buttonSalvarFornecedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaObsFornecedor = new javax.swing.JTextArea();
        labelTipoFornecedor = new javax.swing.JLabel();
        buttonAliForn = new javax.swing.JRadioButton();
        buttonMlForn = new javax.swing.JRadioButton();
        buttonWishForn = new javax.swing.JRadioButton();
        buttonOutrosForn = new javax.swing.JRadioButton();
        buttonFisForn = new javax.swing.JRadioButton();
        buttonJurForn = new javax.swing.JRadioButton();
        buttonOutrosFornPes = new javax.swing.JRadioButton();
        labelTipoPesFornecedor = new javax.swing.JLabel();
        buttonrRelatorioC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Fornecedor");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        painelFornecedor.setBackground(new java.awt.Color(0, 204, 204));
        painelFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        painelFornecedor.setPreferredSize(new java.awt.Dimension(720, 600));

        apresentacaoFornecedor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        apresentacaoFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        apresentacaoFornecedor.setText("Cadastro de Fornecedor");

        painelCamposFornecedor.setBackground(new java.awt.Color(255, 255, 255));

        labelNomeFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelNomeFornecedor.setText("Nome do Fornecedor:");

        textNomeFornecedor.setUI(new mako.controller.Watermark("Digite o nome do Fornecedor...", true));

        labelEndFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelEndFornecedor.setText("Endereço do Fornecedor:");

        textEndFornecedor.setUI(new mako.controller.Watermark("Digite o endereço do Fornecedor...", true));

        labelIdFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelIdFornecedor.setText("ID do Fornecedor:");

        textIdFornecedor.setUI(new mako.controller.Watermark("Digite o ID do Fornecedor...", true));

        labelContatoFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelContatoFornecedor.setText("Contato do Fornecedor:");

        textContatoFornecedor.setUI(new mako.controller.Watermark("Digite um número para contato com o Fornecedor. ex:(00)0000-0000", true));

        labelPagFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelPagFornecedor.setText("Página Fornecedor:");

        textPagFornecedor.setUI(new mako.controller.Watermark("Digite a página web do Fornecedor (caso exista).", true));

        labelObservacoesFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelObservacoesFornecedor.setText("Observações:");

        buttonVoltarFornecedor.setText("Voltar");
        buttonVoltarFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVoltarFornecedorMouseClicked(evt);
            }
        });

        buttonLimparFornecedor.setText("Limpar Campos");
        buttonLimparFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLimparFornecedorMouseClicked(evt);
            }
        });

        buttonCadastrarFornecedor.setText("Cadastrar");
        buttonCadastrarFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCadastrarFornecedorMouseClicked(evt);
            }
        });
        buttonCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFornecedorActionPerformed(evt);
            }
        });

        buttonSalvarFornecedor.setText("Abrir Banco");
        buttonSalvarFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSalvarFornecedorMouseClicked(evt);
            }
        });

        textAreaObsFornecedor.setColumns(20);
        textAreaObsFornecedor.setLineWrap(true);
        textAreaObsFornecedor.setRows(5);
        jScrollPane1.setViewportView(textAreaObsFornecedor);

        labelTipoFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelTipoFornecedor.setText("Tipo do Fornecedor:");

        buttonAliForn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupFornecedor.add(buttonAliForn);
        buttonAliForn.setText("Aliexpress");

        buttonMlForn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupFornecedor.add(buttonMlForn);
        buttonMlForn.setText("Mercado Livre");

        buttonWishForn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupFornecedor.add(buttonWishForn);
        buttonWishForn.setText("Wish");

        buttonOutrosForn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupFornecedor.add(buttonOutrosForn);
        buttonOutrosForn.setText("Outros");

        buttonFisForn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGrouptipoPes.add(buttonFisForn);
        buttonFisForn.setText("Pessoa Física");

        buttonJurForn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGrouptipoPes.add(buttonJurForn);
        buttonJurForn.setText("Pessoa Juridica");

        buttonOutrosFornPes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGrouptipoPes.add(buttonOutrosFornPes);
        buttonOutrosFornPes.setText("Outros");

        labelTipoPesFornecedor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelTipoPesFornecedor.setText("Tipo da Pessoa:");

        buttonrRelatorioC.setText("Relatório de Fornecedores");
        buttonrRelatorioC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonrRelatorioCMouseClicked(evt);
            }
        });
        buttonrRelatorioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonrRelatorioCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCamposFornecedorLayout = new javax.swing.GroupLayout(painelCamposFornecedor);
        painelCamposFornecedor.setLayout(painelCamposFornecedorLayout);
        painelCamposFornecedorLayout.setHorizontalGroup(
            painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelContatoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                        .addComponent(labelObservacoesFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                        .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelIdFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEndFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNomeFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTipoPesFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTipoFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPagFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textNomeFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                                .addComponent(textEndFornecedor)
                                .addComponent(textIdFornecedor)
                                .addComponent(textPagFornecedor)
                                .addComponent(textContatoFornecedor))
                            .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonAliForn)
                                    .addComponent(buttonFisForn))
                                .addGap(20, 20, 20)
                                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                                        .addComponent(buttonJurForn)
                                        .addGap(16, 16, 16)
                                        .addComponent(buttonOutrosFornPes))
                                    .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                                        .addComponent(buttonMlForn)
                                        .addGap(20, 20, 20)
                                        .addComponent(buttonWishForn)
                                        .addGap(34, 34, 34)
                                        .addComponent(buttonOutrosForn)))))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(buttonVoltarFornecedor)
                .addGap(18, 18, 18)
                .addComponent(buttonSalvarFornecedor)
                .addGap(18, 18, 18)
                .addComponent(buttonrRelatorioC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonLimparFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCadastrarFornecedor)
                .addContainerGap())
        );
        painelCamposFornecedorLayout.setVerticalGroup(
            painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposFornecedorLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdFornecedor)
                    .addComponent(textIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeFornecedor)
                    .addComponent(textNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndFornecedor)
                    .addComponent(textEndFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContatoFornecedor)
                    .addComponent(textContatoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPagFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPagFornecedor))
                .addGap(30, 30, 30)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAliForn)
                    .addComponent(buttonMlForn)
                    .addComponent(buttonWishForn)
                    .addComponent(buttonOutrosForn)
                    .addComponent(labelTipoFornecedor))
                .addGap(18, 18, 18)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFisForn)
                    .addComponent(buttonJurForn)
                    .addComponent(buttonOutrosFornPes)
                    .addComponent(labelTipoPesFornecedor))
                .addGap(25, 25, 25)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservacoesFornecedor)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCamposFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonLimparFornecedor)
                        .addComponent(buttonSalvarFornecedor)
                        .addComponent(buttonCadastrarFornecedor)
                        .addComponent(buttonrRelatorioC))
                    .addComponent(buttonVoltarFornecedor))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelFornecedorLayout = new javax.swing.GroupLayout(painelFornecedor);
        painelFornecedor.setLayout(painelFornecedorLayout);
        painelFornecedorLayout.setHorizontalGroup(
            painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedorLayout.createSequentialGroup()
                .addGroup(painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(apresentacaoFornecedor)
                        .addGap(0, 225, Short.MAX_VALUE))
                    .addGroup(painelFornecedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelCamposFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelFornecedorLayout.setVerticalGroup(
            painelFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(apresentacaoFornecedor)
                .addGap(18, 18, 18)
                .addComponent(painelCamposFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelFornecedor);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLimparFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLimparFornecedorMouseClicked
        textIdFornecedor.setText("");
        textNomeFornecedor.setText("");
        textEndFornecedor.setText("");
        textContatoFornecedor.setText("");
        textPagFornecedor.setText("");
        textAreaObsFornecedor.setText("");
    }//GEN-LAST:event_buttonLimparFornecedorMouseClicked

    private void buttonCadastrarFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCadastrarFornecedorMouseClicked
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que gostaria de cadastrar o fornecedor?", "Cadastro de Fornecedor", JOptionPane.YES_NO_OPTION);

        if (op == 0){
            
            f.setId(Integer.parseInt(textIdFornecedor.getText()));
            f.setNome(textNomeFornecedor.getText());
            f.setEndereco(textEndFornecedor.getText());
            f.setContato(textContatoFornecedor.getText());
            f.setPagina(textPagFornecedor.getText());
            f.setObs(textAreaObsFornecedor.getText());
            
            if(buttonAliForn.isSelected()){
                f.setTipo("AliExpress");
            }
            if(buttonMlForn.isSelected()){
                f.setTipo("Mercado Livre");
            }
            if(buttonWishForn.isSelected()){
                f.setTipo("Wish");
            }
            if(buttonOutrosForn.isSelected()){
                f.setTipo("Outros");
            }
            
            if(buttonFisForn.isSelected()){
                f.setTipoPes("Pessoa Física");
            }
            if(buttonJurForn.isSelected()){
                f.setTipoPes("Pessoa Jurídica");
            }
            if(buttonOutrosFornPes.isSelected()){
                f.setTipoPes("Outros");
            }
            
            JOptionPane.showMessageDialog(null, FornecedorDAO.cadastrar(f), "Cadastro de Fornecedor", JOptionPane.PLAIN_MESSAGE);
            try{
                FornecedorDAO.adicionarFornecedorBD(f);
                FornecedorDAO.escreveFornecedores();
                FornecedorDAO.escreveFornecedoresBin();
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage(), "Erro no salvamento", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_buttonCadastrarFornecedorMouseClicked
  }
    
    private void buttonCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCadastrarFornecedorActionPerformed

    private void buttonVoltarFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarFornecedorMouseClicked
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarFornecedorMouseClicked

    private void buttonSalvarFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarFornecedorMouseClicked
        new BancoFornecedores().setVisible(true);
    }//GEN-LAST:event_buttonSalvarFornecedorMouseClicked

    private void buttonrRelatorioCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonrRelatorioCMouseClicked
        Relatorio.mostraRelatorioFornecedores();
    }//GEN-LAST:event_buttonrRelatorioCMouseClicked

    private void buttonrRelatorioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonrRelatorioCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonrRelatorioCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apresentacaoFornecedor;
    private javax.swing.JRadioButton buttonAliForn;
    private javax.swing.JButton buttonCadastrarFornecedor;
    private javax.swing.JRadioButton buttonFisForn;
    private javax.swing.ButtonGroup buttonGroupFornecedor;
    private javax.swing.ButtonGroup buttonGrouptipoPes;
    private javax.swing.JRadioButton buttonJurForn;
    private javax.swing.JButton buttonLimparFornecedor;
    private javax.swing.JRadioButton buttonMlForn;
    private javax.swing.JRadioButton buttonOutrosForn;
    private javax.swing.JRadioButton buttonOutrosFornPes;
    private javax.swing.JButton buttonSalvarFornecedor;
    private javax.swing.JButton buttonVoltarFornecedor;
    private javax.swing.JRadioButton buttonWishForn;
    private javax.swing.JButton buttonrRelatorioC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelContatoFornecedor;
    private javax.swing.JLabel labelEndFornecedor;
    private javax.swing.JLabel labelIdFornecedor;
    private javax.swing.JLabel labelNomeFornecedor;
    private javax.swing.JLabel labelObservacoesFornecedor;
    private javax.swing.JLabel labelPagFornecedor;
    private javax.swing.JLabel labelTipoFornecedor;
    private javax.swing.JLabel labelTipoPesFornecedor;
    private javax.swing.JPanel painelCamposFornecedor;
    private javax.swing.JPanel painelFornecedor;
    private javax.swing.JTextArea textAreaObsFornecedor;
    private javax.swing.JTextField textContatoFornecedor;
    private javax.swing.JTextField textEndFornecedor;
    private javax.swing.JTextField textIdFornecedor;
    private javax.swing.JTextField textNomeFornecedor;
    private javax.swing.JTextField textPagFornecedor;
    // End of variables declaration//GEN-END:variables
}
