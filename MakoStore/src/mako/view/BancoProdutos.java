/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mako.view;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mako.controller.ProdutoDAO;
import mako.model.Produto;

/**
 *
 * @author CaioThizio
 */
public class BancoProdutos extends javax.swing.JFrame{
    private Produto p = new Produto();
    /**
     * Creates new form CadastroProduto
     */
    public BancoProdutos() {
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
        jTextField7 = new javax.swing.JTextField();
        painelProdutos = new javax.swing.JPanel();
        labelProdutos = new javax.swing.JLabel();
        painelCamposProdutos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        buttonID = new javax.swing.JButton();
        textNome = new javax.swing.JTextField();
        buttonNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        buttonTodos = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonApagar = new javax.swing.JButton();
        buttonAtt = new javax.swing.JButton();
        tfID = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCusto = new javax.swing.JTextField();
        tfRevenda = new javax.swing.JTextField();
        tfQtde = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfObs = new javax.swing.JTextArea();
        labelAtt = new javax.swing.JLabel();
        buttonAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboBoxTipo = new javax.swing.JComboBox<>();

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        painelProdutos.setBackground(new java.awt.Color(0, 204, 204));
        painelProdutos.setForeground(new java.awt.Color(255, 255, 255));

        labelProdutos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelProdutos.setForeground(new java.awt.Color(255, 255, 255));
        labelProdutos.setText("Produtos");

        painelCamposProdutos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("Nome:");

        buttonID.setText("Busca ID");
        buttonID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIDMouseClicked(evt);
            }
        });

        buttonNome.setText("Busca Nome");
        buttonNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNomeMouseClicked(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaProdutos.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tabelaProdutos);

        buttonTodos.setText("Mostrar Todos");
        buttonTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTodosMouseClicked(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSairMouseClicked(evt);
            }
        });

        buttonApagar.setText("Apagar Registro");
        buttonApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonApagarMouseClicked(evt);
            }
        });

        buttonAtt.setText("Atualizar");
        buttonAtt.setEnabled(false);
        buttonAtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAttMouseClicked(evt);
            }
        });

        tfID.setUI(new mako.controller.Watermark("ID", true));
        tfID.setEnabled(false);

        tfNome.setUI(new mako.controller.Watermark("Nome", true));
        tfNome.setEnabled(false);

        tfCusto.setUI(new mako.controller.Watermark("Preço de Custo", true));
        tfCusto.setEnabled(false);

        tfRevenda.setUI(new mako.controller.Watermark("Preço de Revenda", true));
        tfRevenda.setEnabled(false);

        tfQtde.setUI(new mako.controller.Watermark("Quantidade", true));
        tfQtde.setEnabled(false);

        buttonCancelar.setText("Cancelar");
        buttonCancelar.setEnabled(false);
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseClicked(evt);
            }
        });

        tfObs.setColumns(20);
        tfObs.setLineWrap(true);
        tfObs.setRows(5);
        tfObs.setEnabled(false);
        jScrollPane3.setViewportView(tfObs);

        labelAtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelAtt.setText("Atualizar");

        buttonAlterar.setText("Alterar Registro");
        buttonAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAlterarMouseClicked(evt);
            }
        });

        jLabel3.setText("ID:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Preço de Custo(R$):");

        jLabel6.setText("Preço de Revenda (R$):");

        jLabel7.setText("Tipo de Produto:");

        jLabel8.setText("Quantidade:");

        jLabel9.setText("Obs:");

        javax.swing.GroupLayout painelCamposProdutosLayout = new javax.swing.GroupLayout(painelCamposProdutos);
        painelCamposProdutos.setLayout(painelCamposProdutosLayout);
        painelCamposProdutosLayout.setHorizontalGroup(
            painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonID)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposProdutosLayout.createSequentialGroup()
                        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAlterar)
                        .addGap(91, 91, 91)
                        .addComponent(buttonApagar))
                    .addComponent(buttonTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposProdutosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposProdutosLayout.createSequentialGroup()
                                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposProdutosLayout.createSequentialGroup()
                                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposProdutosLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfQtde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                            .addComponent(tfRevenda, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfNome)
                                            .addComponent(tfCusto)
                                            .addComponent(comboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(labelAtt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelCamposProdutosLayout.setVerticalGroup(
            painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonID)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelAtt)))
                .addGap(18, 18, 18)
                .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRevenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCamposProdutosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTodos)))
                .addGap(26, 26, 26)
                .addGroup(painelCamposProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonApagar)
                    .addComponent(buttonSair)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonAtt)
                    .addComponent(buttonCancelar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelProdutosLayout = new javax.swing.GroupLayout(painelProdutos);
        painelProdutos.setLayout(painelProdutosLayout);
        painelProdutosLayout.setHorizontalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(labelProdutos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(painelCamposProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelProdutos)
                .addGap(18, 18, 18)
                .addComponent(painelCamposProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelProdutos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTodosMouseClicked
        try {
            mostraDados(ProdutoDAO.getAllProdutos());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
        }
    }//GEN-LAST:event_buttonTodosMouseClicked

    private void buttonIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIDMouseClicked
        try {
            mostraDados(ProdutoDAO.getProdutoById(textID.getText()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
        }
    }//GEN-LAST:event_buttonIDMouseClicked

    private void buttonNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNomeMouseClicked
        try {
            mostraDados(ProdutoDAO.getProdutoByName(textNome.getText()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
        }
    }//GEN-LAST:event_buttonNomeMouseClicked

    private void buttonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonSairMouseClicked

    private void buttonApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonApagarMouseClicked
        int row = tabelaProdutos.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser apagado.", "Selecionar registro", 0);
            return;
        }
       
        Object idObj = tabelaProdutos.getValueAt(row, 0);
        String id = idObj.toString();
        
        if(JOptionPane.showConfirmDialog(null, "Tem certeza que gostaria de apagar o produto de id "+id+"?", "Apagar Produto", JOptionPane.YES_NO_OPTION) != 0)
            return;
        
        if(!ProdutoDAO.deleteProduto(id)){
            JOptionPane.showMessageDialog(null, "Erro de deleção.", "Erro de deleção", 0);
        }else{
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso.", "Deletar registro", -1);
            
            try {
                mostraDados(ProdutoDAO.getAllProdutos());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
            }
        }
  
    }//GEN-LAST:event_buttonApagarMouseClicked
    
    private void buttonAttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAttMouseClicked
        int row = tabelaProdutos.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser apagado.", "Selecionar registro", 0);
            return;
        }
       
        Object idObj = tabelaProdutos.getValueAt(row, 0);
        String oldId = idObj.toString();
        
        String id = tfID.getText();
        String nome = tfNome.getText();
        String custo = tfCusto.getText();
        String revenda = tfRevenda.getText();
        String qtde = tfQtde.getText();
        String tipo = comboBoxTipo.getSelectedItem().toString();
        
        String obs = tfObs.getText();
        
        boolean resp = ProdutoDAO.updateProduto(id, nome, custo, revenda, qtde, tipo, obs, oldId);
        
        if(!resp){
            JOptionPane.showMessageDialog(null, "Erro de atualização.", "Erro de atualização", 0);
        }else{
            JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso.", "Atualizar registro", -1);
            
            tfID.setText("");
            tfNome.setText("");
            tfCusto.setText("");
            tfRevenda.setText("");
            comboBoxTipo.setSelectedIndex(-1);
            tfQtde.setText("");
            tfObs.setText("");
        
            tfID.setEnabled(false);
            tfNome.setEnabled(false);
            tfCusto.setEnabled(false);
            tfRevenda.setEnabled(false);
            comboBoxTipo.setEnabled(false);
            tfQtde.setEnabled(false);
            tfObs.setEnabled(false);
            buttonCancelar.setEnabled(false);
            buttonAtt.setEnabled(false);
            
            try {
                mostraDados(ProdutoDAO.getAllProdutos());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
            }
        }
    }//GEN-LAST:event_buttonAttMouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void buttonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseClicked
        tfID.setText("");
        tfNome.setText("");
        tfCusto.setText("");
        tfRevenda.setText("");
        tfQtde.setText("");
        comboBoxTipo.setSelectedIndex(-1);
        tfObs.setText("");
        
        tfID.setEnabled(false);
        tfNome.setEnabled(false);
        tfCusto.setEnabled(false);
        tfRevenda.setEnabled(false);
        comboBoxTipo.setEnabled(false);
        tfQtde.setEnabled(false);
        tfObs.setEnabled(false);
        buttonCancelar.setEnabled(false);
        buttonAtt.setEnabled(false);
    }//GEN-LAST:event_buttonCancelarMouseClicked

    private void buttonAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAlterarMouseClicked
        int row = tabelaProdutos.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser apagado.", "Selecionar registro", 0);
            return;
        }
       
        Object idObj = tabelaProdutos.getValueAt(row, 0);
        String id = idObj.toString();
        
        try {
            preencheCampos(id);
        } catch (SQLException ex) {
            Logger.getLogger(BancoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAlterarMouseClicked
    
    public void preencheCampos(String id) throws SQLException{
        ResultSet rs = ProdutoDAO.getProdutoById(id);
        ResultSetMetaData rsmd = rs.getMetaData();
        ArrayList<String> reg = new ArrayList<>();
        
        rs.next();
        
        tfID.setEnabled(true);
        tfNome.setEnabled(true);
        tfCusto.setEnabled(true);
        tfRevenda.setEnabled(true);
        tfQtde.setEnabled(true);
        comboBoxTipo.setEnabled(true);
        
        popularComboBox();
        
        tfObs.setEnabled(true);
  
        buttonCancelar.setEnabled(true);
        buttonAtt.setEnabled(true);
        
        do {
                reg = ProximoRegistro(rs, rsmd);
            } while (rs.next());
        
        tfID.setText(reg.get(0));
        tfNome.setText(reg.get(1));
        tfCusto.setText(reg.get(2));
        tfRevenda.setText(reg.get(3));
        tfQtde.setText(reg.get(4));
        
        String tipoAnterior = reg.get(5);
        
        for(int i = 0 ; i < Principal.tipos.size() ; i++){
            if(tipoAnterior.equals(comboBoxTipo.getItemAt(i))){
                comboBoxTipo.setSelectedIndex(i);
                break;
            }
        }

        tfObs.setText(reg.get(6));
        
          
    }
    
    public void mostraDados(ResultSet rs) throws SQLException{
        
        if(!rs.first()){
            JOptionPane.showMessageDialog(this, "Não há dados na tabela.");
            DefaultTableModel tableModel = new DefaultTableModel(0, 0);
            
            tabelaProdutos.setModel(tableModel);
            return;
        }
        
        ArrayList<String> cab = new ArrayList<>();
        ArrayList<String> reg = new ArrayList<>();
        ArrayList<ArrayList<String>> regs = new ArrayList<>();
        
        try {
            
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                cab.add(rsmd.getColumnName(i));
            }
            // obtem dados da linha
            do {
                reg = ProximoRegistro(rs, rsmd);
                regs.add(reg);
            } while (rs.next());
            
            
            
            String col[] = new String[cab.size()];
            
            for(int i = 0 ; i < cab.size() ; i++){
                 col[i] = cab.get(i);
            }
            
            DefaultTableModel tableModel = new DefaultTableModel(col, 0);
            
            tabelaProdutos.setModel(tableModel);
            
            Object[] objs = new Object[cab.size()];
            
            for(ArrayList<String> array : regs){
                for(String valor : array){
                    objs[array.indexOf(valor)] = valor;
                }
                tableModel.addRow(objs);
            }
            
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir tabela: " +e, "Erro tabela", 0);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao montar tabela: \n\n" +e, "Erro montagem", 0);
        }
        
    }
    
    private ArrayList<String> ProximoRegistro(ResultSet rs, ResultSetMetaData rsmd) throws SQLException {
        ArrayList<String> registro = new ArrayList<>();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            
            if (rsmd.getColumnType(i) == Types.VARCHAR || rsmd.getColumnClassName(i).equalsIgnoreCase("java.lang.String")) {//para string
                registro.add(rs.getString(i));
            } else if (rsmd.getColumnType(i) == Types.INTEGER) {
                registro.add(Integer.toString(rs.getInt(i)));
            } else if (rsmd.getColumnType(i) == Types.DOUBLE){
                registro.add(Double.toString(rs.getDouble(i)));
            }else{
                
            }
        }
        return registro;
    }
    
    public void preencheFields(){
        
    }
    
    public void popularComboBox(){
        for(String tipo : Principal.tipos){
            comboBoxTipo.addItem(tipo);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonApagar;
    private javax.swing.JButton buttonAtt;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.ButtonGroup buttonGroupFornecedor;
    private javax.swing.ButtonGroup buttonGrouptipoPes;
    private javax.swing.JButton buttonID;
    private javax.swing.JButton buttonNome;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonTodos;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel labelAtt;
    private javax.swing.JLabel labelProdutos;
    private javax.swing.JPanel painelCamposProdutos;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextArea tfObs;
    private javax.swing.JTextField tfQtde;
    private javax.swing.JTextField tfRevenda;
    // End of variables declaration//GEN-END:variables
}
