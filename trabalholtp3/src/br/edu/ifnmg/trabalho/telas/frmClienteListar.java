/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.trabalho.telas;

import br.edu.ifnmg.trabalho.DataAccess.ClienteDao;
import br.edu.ifnmg.trabalho.DataAccess.ClienteFuncionarioDao;
import br.edu.ifnmg.trabalho.classes.Cliente;
import br.edu.ifnmg.trabalho.classes.Email;
import br.edu.ifnmg.trabalho.classes.Endereco;
import br.edu.ifnmg.trabalho.classes.ErroValidacaoException;
import br.edu.ifnmg.trabalho.classes.Pessoa;
import br.edu.ifnmg.trabalho.classes.Telefone;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author emerson
 */
public class frmClienteListar extends javax.swing.JInternalFrame {
    ClienteDao dao;
    ClienteFuncionarioDao cfdao;
   
    /**
     * Creates new form frmListarProduto
     */
    public frmClienteListar() throws ErroValidacaoException, ParseException {
        initComponents();
        dao = new ClienteDao();
        cfdao = new ClienteFuncionarioDao();
        
        List<Cliente> clientes = dao.listarTodos();
        List<Telefone> telefones = cfdao.listarTodosTelefone();
        List<Email> emails = cfdao.listarTodosEmail();
        List<Endereco> enderecos = cfdao.listarTodosEndereco();
        
        preencheTabela(clientes);
        preencheTabelaTele(telefones);
        preencheTabelaEmail(emails);
        preencheTabelaEndereco(enderecos);
        
    }
    
    //Metodo para listar Produtos na Tabela tblListagemProd
    private void preencheTabela(List<Cliente> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("Cpf");
        model.addColumn("Rg");
        model.addColumn("Nascimento");

        
        for (Cliente clientes : lista) {
            Vector valores = new Vector();
            valores.add(0,clientes.getId());
            valores.add(1,clientes.getNome());
            valores.add(2,clientes.getCpf());
            valores.add(3,clientes.getRg());
            valores.add(4,clientes.getDataRetorno());
            
            model.addRow(valores);
        }
        tblListagemCliente.setModel(model);
        tblListagemCliente.repaint();
        
    }
     private void preencheTabelaTele(List<Telefone> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Telefone");
    
        for (Telefone telefones : lista) {
            Vector valores = new Vector();
            valores.add(0,telefones.getId());
            valores.add(1,telefones.getNum());
           
            model.addRow(valores);
        }
        jtbTelefone.setModel(model);
        jtbTelefone.repaint();
        
    }
     
    private void preencheTabelaEmail(List<Email> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Email");
     
        for (Email emails : lista) {
            Vector valores = new Vector();
            valores.add(0,emails.getId());
            valores.add(1,emails.getEmail_nome());
           
            model.addRow(valores);
        }
        jtbEmails.setModel(model);
        jtbEmails.repaint();
        
    }
    
    private void preencheTabelaEndereco(List<Endereco> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Rua");
        model.addColumn("Num");
        model.addColumn("Bairro");
        
     
        for (Endereco ends : lista) {
            Vector valores = new Vector();
            valores.add(0,ends.getId());
            valores.add(1,ends.getRua());
            valores.add(2,ends.getNum());
            valores.add(3,ends.getBairro());
      
            model.addRow(valores);
        }
        jtbEndereco.setModel(model);
        jtbEndereco.repaint();
        
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
        txtFiltrarC = new javax.swing.JTextField();
        btnFiltrarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemCliente = new javax.swing.JTable();
        jpTituloProdutoListar = new javax.swing.JPanel();
        lblTituloProdutoListar = new javax.swing.JLabel();
        lblTituloClienteListar = new javax.swing.JLabel();
        jpRemoverItemtbEndereco = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTelefone = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbEndereco = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbEmails = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1000, 420));

        lblNomeProd.setText("Nome");

        btnFiltrarCliente.setText("Filtrar");
        btnFiltrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarClienteActionPerformed(evt);
            }
        });

        tblListagemCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListagemCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListagemClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListagemCliente);

        jpTituloProdutoListar.setBackground(new java.awt.Color(0, 102, 153));

        lblTituloProdutoListar.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        lblTituloProdutoListar.setText("Clique sobre o produto para editar.");

        lblTituloClienteListar.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTituloClienteListar.setText("Listagem de Clientes");

        javax.swing.GroupLayout jpTituloProdutoListarLayout = new javax.swing.GroupLayout(jpTituloProdutoListar);
        jpTituloProdutoListar.setLayout(jpTituloProdutoListarLayout);
        jpTituloProdutoListarLayout.setHorizontalGroup(
            jpTituloProdutoListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloProdutoListarLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addGroup(jpTituloProdutoListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloClienteListar)
                    .addGroup(jpTituloProdutoListarLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblTituloProdutoListar)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jpTituloProdutoListarLayout.setVerticalGroup(
            jpTituloProdutoListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloProdutoListarLayout.createSequentialGroup()
                .addComponent(lblTituloClienteListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloProdutoListar))
        );

        jpRemoverItemtbEndereco.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel3.setText("Clique sobre algum campo para ver versão FULL ");

        javax.swing.GroupLayout jpRemoverItemtbEnderecoLayout = new javax.swing.GroupLayout(jpRemoverItemtbEndereco);
        jpRemoverItemtbEndereco.setLayout(jpRemoverItemtbEnderecoLayout);
        jpRemoverItemtbEnderecoLayout.setHorizontalGroup(
            jpRemoverItemtbEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRemoverItemtbEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(113, 113, 113))
        );
        jpRemoverItemtbEnderecoLayout.setVerticalGroup(
            jpRemoverItemtbEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRemoverItemtbEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbTelefone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbTelefone);

        jtbEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtbEndereco);

        jtbEmails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jtbEmails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTituloProdutoListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpRemoverItemtbEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrarCliente))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTituloProdutoListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiltrarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeProd)
                            .addComponent(btnFiltrarCliente))
                        .addGap(34, 34, 34)
                        .addComponent(jpRemoverItemtbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarClienteActionPerformed
       Cliente c = new Cliente();
        try{
            c.setNome(txtFiltrarC.getText());
        }catch(Exception ex){
            System.out.printf("Erro");
        }
        
        List<Cliente> lista = null;
        try {
            lista = dao.buscar(c);
        } catch (ErroValidacaoException ex) {
            System.out.printf("Erro");
        }
        
        preencheTabela(lista);
        
        
       
       
    }//GEN-LAST:event_btnFiltrarClienteActionPerformed

    private void tblListagemClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListagemClienteMouseClicked
        Object valor = tblListagemCliente.getValueAt( tblListagemCliente.getSelectedRow(), 0);
        Cliente cliente = null;
        try {
            cliente = dao.Abrir((int)valor);
        } catch (ErroValidacaoException ex) {
            System.out.printf("Erro");        }
        frmClienteEditar janela = null;
        try {
            janela = new frmClienteEditar(cliente, dao);
        } catch (ErroValidacaoException ex) {
            Logger.getLogger(frmClienteListar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(frmClienteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getParent().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tblListagemClienteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarCliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpRemoverItemtbEndereco;
    private javax.swing.JPanel jpTituloProdutoListar;
    private javax.swing.JTable jtbEmails;
    private javax.swing.JTable jtbEndereco;
    private javax.swing.JTable jtbTelefone;
    private javax.swing.JLabel lblNomeProd;
    private javax.swing.JLabel lblTituloClienteListar;
    private javax.swing.JLabel lblTituloProdutoListar;
    private javax.swing.JTable tblListagemCliente;
    private javax.swing.JTextField txtFiltrarC;
    // End of variables declaration//GEN-END:variables
}
