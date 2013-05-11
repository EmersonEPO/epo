/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.trabalho.telas;

import br.edu.ifnmg.trabalho.DataAccess.ProdutoDao;
import br.edu.ifnmg.trabalho.classes.ErroValidacaoException;
import br.edu.ifnmg.trabalho.classes.Produto;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author emerson
 */
public class frmListarProduto extends javax.swing.JInternalFrame {
    ProdutoDao dao;
    /**
     * Creates new form frmListarProduto
     */
    public frmListarProduto() throws ErroValidacaoException {
        initComponents();
        dao = new ProdutoDao();
        
        List<Produto> produtos = dao.listarTodos();
        
        preencheTabela(produtos);
    }
    
    //Metodo para listar Produtos na Tabela tblListagemProd
    private void preencheTabela(List<Produto> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("Valor compra");
        model.addColumn("Valor venda");
        model.addColumn("Descrição");
        model.addColumn("Estoque");
        
        for (Produto prod : lista) {
            Vector valores = new Vector();
            valores.add(0,prod.getId());
            valores.add(1,prod.getNome());
            valores.add(2,prod.getValor_comp());
            valores.add(3,prod.getValor_vend());
            valores.add(4,prod.getDescricao());
            valores.add(5,prod.getEstoque());
            
            model.addRow(valores);
        }
        tblListagemProd.setModel(model);
        tblListagemProd.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeProd = new javax.swing.JLabel();
        txtFiltrarProd = new javax.swing.JTextField();
        btnFiltrarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemProd = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(600, 380));

        lblNomeProd.setText("Nome");

        btnFiltrarProd.setText("Filtrar");
        btnFiltrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarProdActionPerformed(evt);
            }
        });

        tblListagemProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListagemProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListagemProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListagemProd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNomeProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrarProd)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProd)
                    .addComponent(txtFiltrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarProdActionPerformed
        Produto prod = new Produto();
        try {
            prod.setNome(txtFiltrarProd.getText());
        } catch (ErroValidacaoException ex) {
            System.out.printf("Erro");
        }
        
        List<Produto> lista = null;
        try {
            lista = dao.buscar(prod);
        } catch (ErroValidacaoException ex) {
            System.out.printf("Erro");
        }
        
        preencheTabela(lista);
    }//GEN-LAST:event_btnFiltrarProdActionPerformed

    private void tblListagemProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListagemProdMouseClicked
        Object valor = tblListagemProd.getValueAt( tblListagemProd.getSelectedRow(), 0);
        Produto prod = null;
        try {
            prod = dao.Abrir((int)valor);
        } catch (ErroValidacaoException ex) {
            System.out.printf("Erro");        }
        frmProdutoEditar janela = new frmProdutoEditar(prod, dao);
        this.getParent().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tblListagemProdMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeProd;
    private javax.swing.JTable tblListagemProd;
    private javax.swing.JTextField txtFiltrarProd;
    // End of variables declaration//GEN-END:variables
}
