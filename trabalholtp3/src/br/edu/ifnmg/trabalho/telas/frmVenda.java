/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.trabalho.telas;

import br.edu.ifnmg.trabalho.DataAccess.ClienteDao;
import br.edu.ifnmg.trabalho.DataAccess.FuncionarioDao;
import br.edu.ifnmg.trabalho.DataAccess.PagamentoDao;
import br.edu.ifnmg.trabalho.DataAccess.ProdutoDao;
import br.edu.ifnmg.trabalho.classes.Cliente;
import br.edu.ifnmg.trabalho.classes.ErroValidacaoException;
import br.edu.ifnmg.trabalho.classes.Funcionario;
import br.edu.ifnmg.trabalho.classes.Item_venda;
import br.edu.ifnmg.trabalho.classes.Pagamento;
import br.edu.ifnmg.trabalho.classes.Produto;
import br.edu.ifnmg.trabalho.classes.Venda;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emerson
 */
public class frmVenda extends javax.swing.JInternalFrame {

        Venda venda;
        ProdutoDao pdao;
        PagamentoDao pgdao;
        ClienteDao cdao;
        FuncionarioDao fdao;
        List<Produto> produtos;
        List<Cliente> clientes;
        List<Funcionario> funcionarios;
    
    /**
     * Creates new form frmVenda
     */
    public frmVenda() throws ErroValidacaoException, ParseException {
        initComponents();
        
        pgdao = new PagamentoDao();
        pdao = new ProdutoDao();
        cdao = new ClienteDao();
        fdao = new FuncionarioDao();
        //============
        List<Pagamento> pagamentos = pgdao.listarTodos();
        jcbPagamentoVend.removeAllItems();
        for(Pagamento pg: pagamentos){
            jcbPagamentoVend.addItem(pg.getNome());
        }
        //============
        List<Cliente> clientes = cdao.listarTodos();
        jbcClienteVend.removeAllItems();
        for(Cliente c: clientes){
            jbcClienteVend.addItem(c.getNome());
        }
        //============
        List<Funcionario> funcionarios = fdao.listarTodos();
        jcbFuncionarioVend.removeAllItems();
        for(Funcionario f: funcionarios){
            jcbFuncionarioVend.addItem(f.getNome());
        }
        //============
        List<Produto> produtos = pdao.listarTodos();
        jcbItemVend.removeAllItems();
        for(Produto p: produtos){
            jcbItemVend.addItem(p.getNome());
        }
        
    }
    private void configuraCamposFormulario() {
        txtValorParcial.setText(Double.toString(venda.getTotal()));
        txtValorParcialCompra.setText(Double.toString(venda.getTotal()));

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Produto");
        model.addColumn("Quantidade");
        model.addColumn("Preço Unid");

        for (Item_venda i : venda.getItens()) {
            Vector v = new Vector();
            v.add(i.getProduto().getNome());
            v.add(i.getQtd());
            v.add(i.getV_produto());
            model.addRow(v);
        }

        jtItensVenda.setModel(model);
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
        txtValorFinal = new javax.swing.JTextField();
        txtValorParcialVend = new javax.swing.JTextField();
        txtValorParcial = new javax.swing.JTextField();
        jcbFuncionarioVend = new javax.swing.JComboBox();
        jcbPagamentoVend = new javax.swing.JComboBox();
        jPItem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItensVenda = new javax.swing.JTable();
        lblItemVend = new javax.swing.JLabel();
        jcbItemVend = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        lblValorParcialComp = new javax.swing.JLabel();
        txtValorParcialCompra = new javax.swing.JTextField();
        txtQtdVend = new javax.swing.JTextField();
        btnFinalizarVend = new javax.swing.JButton();
        btnCancelarVend = new javax.swing.JButton();

        jbcClienteVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jbcClienteVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcClienteVendActionPerformed(evt);
            }
        });

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
                    .addComponent(txtValorFinal)
                    .addComponent(txtValorParcial)
                    .addComponent(jcbFuncionarioVend, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbPagamentoVend, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorParcialVend))
                .addContainerGap(350, Short.MAX_VALUE))
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
                            .addComponent(txtValorParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorPVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorFVend))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jtbVenda.addTab("Geral", jPGeral);

        jtItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtItensVenda);

        lblItemVend.setText("Item");

        jcbItemVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Qtd.");

        btnAddItem.setText("Adicionar");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddItem))
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
                .addGap(21, 21, 21)
                .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemVend)
                    .addComponent(jcbItemVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQtdVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorParcialCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorParcialComp))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtbVenda.addTab("Item", jPItem);

        btnFinalizarVend.setText("Finalizar");
        btnFinalizarVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnFinalizarVend)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarVend))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jtbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVend)
                    .addComponent(btnFinalizarVend))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente adicionar o item?")== 0) {

            Produto p = (Produto) jcbItemVend.getSelectedItem();
            int qtd = Integer.parseInt(txtQtdVend.getText());
            Item_venda item = new Item_venda();
            item.setProduto(p);
            try {
                item.setQtd(qtd);
            } catch (ErroValidacaoException ex) {
                System.out.printf("Valor nao pode ser zero");
            }
            
            venda.addItem(item);

            JOptionPane.showMessageDialog(rootPane, "Item adicionado com sucesso!");

            configuraCamposFormulario();
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Ação cancelada pelo usuário!");
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnCancelarVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendActionPerformed
         if(JOptionPane.showConfirmDialog(rootPane,  "Deseja Cancelar?") == 0){              
            JOptionPane.showMessageDialog(rootPane, "Operação Cancelada");
            this.dispose();
        } else {               
            JOptionPane.showMessageDialog(rootPane,"Operação Não cancelada!");
            
        }
    }//GEN-LAST:event_btnCancelarVendActionPerformed

    private void btnFinalizarVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendActionPerformed
         if(JOptionPane.showConfirmDialog(rootPane,  "Deseja Salvar?") == 0){   
      
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso");
            
        } else {               
            JOptionPane.showMessageDialog(rootPane,"Operação Não cancelada!");
            
        }
    }//GEN-LAST:event_btnFinalizarVendActionPerformed

    private void jbcClienteVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcClienteVendActionPerformed
       
    }//GEN-LAST:event_jbcClienteVendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnCancelarVend;
    private javax.swing.JButton btnFinalizarVend;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPGeral;
    private javax.swing.JPanel jPItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jbcClienteVend;
    private javax.swing.JComboBox jcbFuncionarioVend;
    private javax.swing.JComboBox jcbItemVend;
    private javax.swing.JComboBox jcbPagamentoVend;
    private javax.swing.JTable jtItensVenda;
    private javax.swing.JTabbedPane jtbVenda;
    private javax.swing.JLabel lblClienteVend;
    private javax.swing.JLabel lblDataVend;
    private javax.swing.JLabel lblFuncionarioVend;
    private javax.swing.JLabel lblItemVend;
    private javax.swing.JLabel lblPagamentoVend;
    private javax.swing.JLabel lblValorFVend;
    private javax.swing.JLabel lblValorPVenda;
    private javax.swing.JLabel lblValorParcialComp;
    private javax.swing.JTextField txtQtdVend;
    private javax.swing.JTextField txtValorFinal;
    private javax.swing.JTextField txtValorParcial;
    private javax.swing.JTextField txtValorParcialCompra;
    private javax.swing.JTextField txtValorParcialVend;
    // End of variables declaration//GEN-END:variables
}
