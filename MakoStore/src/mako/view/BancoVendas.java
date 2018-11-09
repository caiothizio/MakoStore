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
import mako.controller.ClienteDAO;
import mako.controller.ProdutoDAO;
import mako.controller.VendaDAO;
import mako.model.Venda;

/**
 *
 * @author CaioThizio
 */

public class BancoVendas extends javax.swing.JFrame{
    private Venda v = new Venda();
    /**
     * Creates new form CadastroProduto
     */
    public BancoVendas() {
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
        painelCliente = new javax.swing.JPanel();
        labelCliente = new javax.swing.JLabel();
        painelCamposCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        buttonID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        buttonTodos = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonApagar = new javax.swing.JButton();
        buttonAtt = new javax.swing.JButton();
        tfID = new javax.swing.JTextField();
        tfQtd = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
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
        buttonCalcularPreco = new javax.swing.JButton();
        comboBoxCliente = new javax.swing.JComboBox<>();
        comboBoxProduto = new javax.swing.JComboBox<>();

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        painelCliente.setBackground(new java.awt.Color(0, 204, 204));
        painelCliente.setForeground(new java.awt.Color(255, 255, 255));

        labelCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setText("Vendas");

        painelCamposCliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setText("ID:");

        buttonID.setText("Busca ID");
        buttonID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIDMouseClicked(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaClientes.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tabelaClientes);

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

        tfID.setUI(new mako.utils.Watermark("ID", true));
        tfID.setEnabled(false);

        tfQtd.setUI(new mako.utils.Watermark("Contato", true));
        tfQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQtdActionPerformed(evt);
            }
        });

        tfPreco.setUI(new mako.utils.Watermark("CPF/CNPJ", true));
        tfPreco.setEnabled(false);

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

        jLabel3.setText("Cliente:");

        jLabel4.setText("ID:");

        jLabel5.setText("Produto:");

        jLabel6.setText("Qtd:");

        jLabel7.setText("Preco:");

        jLabel8.setText("Obs:");

        buttonCalcularPreco.setText("Calcular Preço");
        buttonCalcularPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCalcularPrecoMouseClicked(evt);
            }
        });
        buttonCalcularPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularPrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCamposClienteLayout = new javax.swing.GroupLayout(painelCamposCliente);
        painelCamposCliente.setLayout(painelCamposClienteLayout);
        painelCamposClienteLayout.setHorizontalGroup(
            painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposClienteLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(painelCamposClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposClienteLayout.createSequentialGroup()
                        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAlterar)
                        .addGap(91, 91, 91)
                        .addComponent(buttonApagar))
                    .addComponent(buttonTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCamposClienteLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(labelAtt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelCamposClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposClienteLayout.createSequentialGroup()
                                .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCamposClienteLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addGroup(painelCamposClienteLayout.createSequentialGroup()
                                .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfQtd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(painelCamposClienteLayout.createSequentialGroup()
                                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(painelCamposClienteLayout.createSequentialGroup()
                                                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonCalcularPreco)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(comboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        painelCamposClienteLayout.setVerticalGroup(
            painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposClienteLayout.createSequentialGroup()
                .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCamposClienteLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonID)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCamposClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelAtt)))
                .addGap(18, 18, 18)
                .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCamposClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTodos)
                        .addGap(26, 26, 26))
                    .addGroup(painelCamposClienteLayout.createSequentialGroup()
                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCalcularPreco))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(painelCamposClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonApagar)
                    .addComponent(buttonSair)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonAtt)
                    .addComponent(buttonCancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCamposCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(labelCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelCliente)
                .addGap(18, 18, 18)
                .addComponent(painelCamposCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelCliente);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTodosMouseClicked
        try {
            mostraDados(VendaDAO.getAllVendas());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
        }
    }//GEN-LAST:event_buttonTodosMouseClicked

    private void buttonIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIDMouseClicked
        try {
            mostraDados(VendaDAO.getVendaById(textID.getText()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
        }
    }//GEN-LAST:event_buttonIDMouseClicked

    private void buttonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonSairMouseClicked

    private void buttonApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonApagarMouseClicked
        int row = tabelaClientes.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser apagado.", "Selecionar registro", 0);
            return;
        }
       
        Object idObj = tabelaClientes.getValueAt(row, 0);
        String id = idObj.toString();
        
        if(JOptionPane.showConfirmDialog(null, "Tem certeza que gostaria de apagar o cliente de id "+id+"?", "Apagar Cliente", JOptionPane.YES_NO_OPTION) != 0)
            return;
        
        if(!ClienteDAO.deleteCliente(id)){
            JOptionPane.showMessageDialog(null, "Erro de deleção.", "Erro de deleção", 0);
        }else{
            JOptionPane.showMessageDialog(null, "Registro deletado com sucesso.", "Deletar registro", -1);
            
            try {
                mostraDados(ClienteDAO.getAllClientes());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro SQL ao montar tabela: " +ex, "Erro ao mostrar tabela", 0);
            }
        }
  
    }//GEN-LAST:event_buttonApagarMouseClicked
    
    private void buttonAttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAttMouseClicked
        int row = tabelaClientes.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser apagado.", "Selecionar registro", 0);
            return;
        }
       
        Object idObj = tabelaClientes.getValueAt(row, 0);
        String oldId = idObj.toString();
        
        String id = tfID.getText();
        int idCliente = ClienteDAO.getIdByName(comboBoxCliente.getSelectedItem().toString());
        int idProduto = ProdutoDAO.getIdByName(comboBoxProduto.getSelectedItem().toString());
        String qtd = tfQtd.getText();
        String preco= tfPreco.getText();
        String obs = tfObs.getText();
        
        boolean resp = VendaDAO.updateVenda(id, idCliente, idProduto, obs, qtd, preco, oldId);
        
        if(!resp){
            JOptionPane.showMessageDialog(null, "Erro de atualização.", "Erro de atualização", 0);
        }else{
            JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso.", "Atualizar registro", -1);
            
            tfID.setText("");
            
            tfQtd.setText("");
            tfPreco.setText("");
            tfObs.setText("");
            
            limparComboBoxes();
            
            tfID.setEnabled(false);
            comboBoxCliente.setEnabled(false);
            comboBoxProduto.setEnabled(false);
            tfQtd.setEnabled(false);
            tfPreco.setEnabled(false);
            tfObs.setEnabled(false);
            buttonCancelar.setEnabled(false);
            buttonAtt.setEnabled(false);
            
            try {
                mostraDados(VendaDAO.getAllVendas());
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
        
        tfQtd.setText("");
        tfPreco.setText("");
        tfObs.setText("");
        
        limparComboBoxes();
        
        tfID.setEnabled(false);
        
        tfQtd.setEnabled(false);
        tfPreco.setEnabled(false);
        tfObs.setEnabled(false);
        buttonCancelar.setEnabled(false);
        buttonAtt.setEnabled(false);
    }//GEN-LAST:event_buttonCancelarMouseClicked

    private void buttonAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAlterarMouseClicked
        int row = tabelaClientes.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um registro na tabela para ser apagado.", "Selecionar registro", 0);
            return;
        }
       
        Object idObj = tabelaClientes.getValueAt(row, 0);
        String id = idObj.toString();
        
        try {
            popularComboBoxes();
            preencheCampos(id);
        } catch (SQLException ex) {
            Logger.getLogger(BancoVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAlterarMouseClicked

    private void buttonCalcularPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCalcularPrecoActionPerformed

    private void tfQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQtdActionPerformed

    private void buttonCalcularPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCalcularPrecoMouseClicked
        int qtd = Integer.parseInt(tfQtd.getText());
        double pRevenda = ProdutoDAO.getPrecoRevendaByName(comboBoxProduto.getSelectedItem().toString());
        
        double total = qtd * pRevenda;
        
        tfPreco.setText(Double.toString(total));
    }//GEN-LAST:event_buttonCalcularPrecoMouseClicked
    
    public void preencheCampos(String id) throws SQLException{
        ResultSet rs = VendaDAO.getVendaById(id);
        ResultSetMetaData rsmd = rs.getMetaData();
        ArrayList<String> reg = new ArrayList<>();
        
        rs.next();
        
        tfID.setEnabled(true);
        comboBoxCliente.setEnabled(true);
        comboBoxProduto.setEnabled(true);
        tfQtd.setEnabled(true);
        tfPreco.setEnabled(true);
        tfObs.setEnabled(true);
        buttonCancelar.setEnabled(true);
        buttonAtt.setEnabled(true);
        
        do {
                reg = ProximoRegistro(rs, rsmd);
            } while (rs.next());
        
        tfID.setText(reg.get(0));
        for(int i = 0; i < comboBoxCliente.getItemCount(); i++){
            if(reg.get(1).equals(comboBoxCliente.getItemAt(i))){
                comboBoxCliente.setSelectedIndex(i);
                break;
            }
        }
        
        for(int i = 0; i < comboBoxProduto.getItemCount(); i++){
            if(reg.get(2).equals(comboBoxProduto.getItemAt(i))){
                comboBoxProduto.setSelectedIndex(i);
                break;
            }
        }
        
        tfObs.setText(reg.get(3));
        tfQtd.setText(reg.get(4));
        tfPreco.setText(reg.get(5));
          
    }
    
    public void mostraDados(ResultSet rs) throws SQLException{
        
        if(!rs.first()){
            JOptionPane.showMessageDialog(this, "Não há dados na tabela.");
            DefaultTableModel tableModel = new DefaultTableModel(0, 0);
            
            tabelaClientes.setModel(tableModel);
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
            
            tabelaClientes.setModel(tableModel);
            
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonApagar;
    private javax.swing.JButton buttonAtt;
    private javax.swing.JButton buttonCalcularPreco;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.ButtonGroup buttonGroupFornecedor;
    private javax.swing.ButtonGroup buttonGrouptipoPes;
    private javax.swing.JButton buttonID;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonTodos;
    private javax.swing.JComboBox<String> comboBoxCliente;
    private javax.swing.JComboBox<String> comboBoxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel labelAtt;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JPanel painelCamposCliente;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextArea tfObs;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfQtd;
    // End of variables declaration//GEN-END:variables

    private void popularComboBoxes() {
        if(comboBoxCliente.getItemCount() > 0 || comboBoxProduto.getItemCount() > 0){
            return;
        }
        
        ArrayList<String> clientes, produtos;
        clientes = ClienteDAO.getAllClientesArray();
        produtos = ProdutoDAO.getAllProdutosArray();
        
        clientes.forEach((cliente) -> {
            comboBoxCliente.addItem(cliente);
        });
        
        produtos.forEach((produto) -> {
            comboBoxProduto.addItem(produto);
        });
    }
    
    private void limparComboBoxes(){
        comboBoxCliente.removeAllItems();
        comboBoxProduto.removeAllItems();
    }
}