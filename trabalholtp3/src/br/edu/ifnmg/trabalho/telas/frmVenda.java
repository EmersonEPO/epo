/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.trabalho.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author emerson
 */
public class frmVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmVenda
     */
    public frmVenda() {
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

        jtbVenda = new javax.swing.JTabbedPane();
        jPGeral = new javax.swing.JPanel();
        jbcClienteVend = new javax.swing.JComboBox();
        lblClienteVend = new javax.swing.JLabel();
        lblFuncionarioVend = new javax.swing.JLabel();
        lblPagamentoVend = new javax.swing.JLabel();
        lblDataVend = new javax.swing.JLabel();
        lblValorPVenda = new javax.swing.JLabel();
        lblValorFVend = new javax.swing.JLabel();
        txtValorFinalVend = new javax.swing.JTextField();
        txtValorParcialVend = new javax.swing.JTextField();
        txtDataVend = new javax.swing.JTextField();
        jcbFuncionarioVend = new javax.swing.JComboBox();
        jcbPagamentoVend = new javax.swing.JComboBox();
        jPItem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblItemVend = new javax.swing.JLabel();
        jcbItemVend = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblValorParcialComp = new javax.swing.JLabel();
        txtValorParcialCompra = new javax.swing.JTextField();
        txtQtdVend = new javax.swing.JTextField();
        btnFinalizarVend = new javax.swing.JButton();
        btnCancelarVend = new javax.swing.JButton();

        jbcClienteVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblClienteVend.setText("Cliente");

        lblFuncionarioVend.setText("Funcionario");

        lblPagamentoVend.setText("Pagamento");

        lblDataVend.setText("Data");

        lblValorPVenda.setText("Valor Partcial");

        lblValorFVend.setText("Valor Final");

        jcbFuncionarioVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcbPagamentoVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPGeralLayout = new javax.swing.GroupLayout(jPGeral);
        jPGeral.setLayout(jPGeralLayout);
        jPGeralLayout.setHorizontalGroup(
            jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGeralLayout.createSequentialGroup()
                        .addComponent(lblValorPVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPGeralLayout.createSequentialGroup()
                        .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorFVend)
                            .addComponent(lblDataVend)
                            .addComponent(lblClienteVend)
                            .addComponent(lblFuncionarioVend)
                            .addComponent(lblPagamentoVend))
                        .addGap(24, 24, 24)))
                .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbcClienteVend, 0, 117, Short.MAX_VALUE)
                    .addComponent(txtValorFinalVend)
                    .addComponent(txtDataVend)
                    .addComponent(jcbFuncionarioVend, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbPagamentoVend, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorParcialVend))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPGeralLayout.setVerticalGroup(
            jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcClienteVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteVend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFuncionarioVend)
                    .addComponent(jcbFuncionarioVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagamentoVend)
                    .addComponent(jcbPagamentoVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataVend)
                    .addGroup(jPGeralLayout.createSequentialGroup()
                        .addComponent(txtValorParcialVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorPVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorFinalVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorFVend))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jtbVenda.addTab("Geral", jPGeral);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Preço", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblItemVend.setText("Item");

        jcbItemVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Qtd.");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblValorParcialComp.setText("Valor Parcial da Compra:");

        javax.swing.GroupLayout jPItemLayout = new javax.swing.GroupLayout(jPItem);
        jPItem.setLayout(jPItemLayout);
        jPItemLayout.setHorizontalGroup(
            jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPItemLayout.createSequentialGroup()
                        .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPItemLayout.createSequentialGroup()
                                .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPItemLayout.createSequentialGroup()
                                        .addComponent(lblItemVend)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbItemVend, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPItemLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQtdVend)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPItemLayout.createSequentialGroup()
                                .addComponent(lblValorParcialComp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorParcialCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPItemLayout.setVerticalGroup(
            jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPItemLayout.createSequentialGroup()
                .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPItemLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItemVend)
                            .addComponent(jcbItemVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtQtdVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPItemLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorParcialCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorParcialComp))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jtbVenda.addTab("Item", jPItem);

        btnFinalizarVend.setText("Finalizar");

        btnCancelarVend.setText("Cancelar");
        btnCancelarVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtbVenda)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnFinalizarVend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarVend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVend)
                    .addComponent(btnFinalizarVend))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(JOptionPane.showConfirmDialog(rootPane,  "Deseja Mesmo Adicionar o Produto?") == 0){              
            JOptionPane.showMessageDialog(rootPane, "Item Adicionado!");
            this.dispose();
        } else {               
            JOptionPane.showMessageDialog(rootPane,"Item Não Adicionado!");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendActionPerformed
         if(JOptionPane.showConfirmDialog(rootPane,  "Deseja Cancelar?") == 0){              
            JOptionPane.showMessageDialog(rootPane, "Operação Cancelada");
            this.dispose();
        } else {               
            JOptionPane.showMessageDialog(rootPane,"Operação Não cancelada!");
            
        }
    }//GEN-LAST:event_btnCancelarVendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarVend;
    private javax.swing.JButton btnFinalizarVend;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPGeral;
    private javax.swing.JPanel jPItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jbcClienteVend;
    private javax.swing.JComboBox jcbFuncionarioVend;
    private javax.swing.JComboBox jcbItemVend;
    private javax.swing.JComboBox jcbPagamentoVend;
    private javax.swing.JTabbedPane jtbVenda;
    private javax.swing.JLabel lblClienteVend;
    private javax.swing.JLabel lblDataVend;
    private javax.swing.JLabel lblFuncionarioVend;
    private javax.swing.JLabel lblItemVend;
    private javax.swing.JLabel lblPagamentoVend;
    private javax.swing.JLabel lblValorFVend;
    private javax.swing.JLabel lblValorPVenda;
    private javax.swing.JLabel lblValorParcialComp;
    private javax.swing.JTextField txtDataVend;
    private javax.swing.JTextField txtQtdVend;
    private javax.swing.JTextField txtValorFinalVend;
    private javax.swing.JTextField txtValorParcialCompra;
    private javax.swing.JTextField txtValorParcialVend;
    // End of variables declaration//GEN-END:variables
}