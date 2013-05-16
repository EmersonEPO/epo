/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.trabalho.telas;

import br.edu.ifnmg.trabalho.DataAccess.ClienteDao;
import br.edu.ifnmg.trabalho.DataAccess.FuncionarioDao;
import br.edu.ifnmg.trabalho.classes.Cliente;
import br.edu.ifnmg.trabalho.classes.Email;
import br.edu.ifnmg.trabalho.classes.Endereco;
import br.edu.ifnmg.trabalho.classes.ErroValidacaoException;
import br.edu.ifnmg.trabalho.classes.Funcionario;
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
public class frmFuncionarioListar extends javax.swing.JInternalFrame {
    FuncionarioDao dao;
    Funcionario funcionario = new Funcionario();
    Telefone aux = new Telefone();
    /**
     * Creates new form frmListarProduto
     */
    public frmFuncionarioListar() throws ErroValidacaoException, ParseException {
        initComponents();
        dao = new FuncionarioDao();
        
        List<Funcionario> funcionarios = dao.listarTodos();
        
        preencheTabela(funcionarios);
    }
    
    //Metodo para listar Produtos na Tabela tblListagemProd
    private void preencheTabela(List<Funcionario> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("Cpf");
        model.addColumn("Rg");
        model.addColumn("Nascimento");
        model.addColumn("Usuario");
        model.addColumn("Senha");

        
        for (Funcionario funcionario : lista) {
            Vector valores = new Vector();
            valores.add(0,funcionario.getId());
            valores.add(1,funcionario.getNome());
            valores.add(2,funcionario.getCpf());
            valores.add(3,funcionario.getRg());
            valores.add(4,funcionario.getDataRetorno());
            valores.add(5,funcionario.getUsuario());
            valores.add(6,funcionario.getSenha());
            
            model.addRow(valores);
        }
        tblListagemFuncionario.setModel(model);
        tblListagemFuncionario.repaint();
        
    }
    
   private void addCamposTelefone() {
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Numero Telefone");

       for (Telefone te : funcionario.getTelefones()) {
           Vector v = new Vector();
           v.add(te.getNum()); 
           model.addRow(v);
       }

       jtbTelefoneFuncionario.setModel(model);
    }
    //Add Email
    private void addCamposEmail() {
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("E-mail");

       for (Email email : funcionario.getEmails()) {
           Vector v = new Vector();
           v.add(email.getEmail_nome()); 
           model.addRow(v);
       }

       jtbEmailsFuncionario.setModel(model);
    }
    
     //Add Email
    private void addCamposEndereco() {
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Rua");
        model.addColumn("Numero");
        model.addColumn("Bairro");

       for (Endereco endereco : funcionario.getEnderecos()) {
           Vector v = new Vector();
           v.add(0, endereco.getRua());
           v.add(1, endereco.getNum());
           v.add(2, endereco.getBairro());
           model.addRow(v);
       }

       jtbEnderecoFuncionario.setModel(model);
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
        txtFiltrarFuncionario = new javax.swing.JTextField();
        btnFiltrarFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemFuncionario = new javax.swing.JTable();
        jpTituloProdutoListar = new javax.swing.JPanel();
        lblTituloProdutoListar = new javax.swing.JLabel();
        lblTituloClienteListar = new javax.swing.JLabel();
        jpRemoverItemtbEndereco = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTelefoneFuncionario = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbEnderecoFuncionario = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbEmailsFuncionario = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1000, 420));

        lblNomeProd.setText("Nome");

        btnFiltrarFuncionario.setText("Filtrar");
        btnFiltrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarFuncionarioActionPerformed(evt);
            }
        });

        tblListagemFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListagemFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListagemFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListagemFuncionario);

        jpTituloProdutoListar.setBackground(new java.awt.Color(0, 102, 153));

        lblTituloProdutoListar.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        lblTituloProdutoListar.setText("Clique sobre o funcionario para editar.");

        lblTituloClienteListar.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTituloClienteListar.setText("Listagem de Funcionarios");

        javax.swing.GroupLayout jpTituloProdutoListarLayout = new javax.swing.GroupLayout(jpTituloProdutoListar);
        jpTituloProdutoListar.setLayout(jpTituloProdutoListarLayout);
        jpTituloProdutoListarLayout.setHorizontalGroup(
            jpTituloProdutoListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloProdutoListarLayout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(lblTituloProdutoListar)
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloProdutoListarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloClienteListar)
                .addGap(334, 334, 334))
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

        jtbTelefoneFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbTelefoneFuncionario);

        jtbEnderecoFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtbEnderecoFuncionario);

        jtbEmailsFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jtbEmailsFuncionario);

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
                        .addComponent(txtFiltrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrarFuncionario))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                            .addComponent(txtFiltrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeProd)
                            .addComponent(btnFiltrarFuncionario))
                        .addGap(34, 34, 34)
                        .addComponent(jpRemoverItemtbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarFuncionarioActionPerformed
        Funcionario func = new Funcionario();
        try {
            func.setNome(txtFiltrarFuncionario.getText());
        } catch (ErroValidacaoException ex) {
            System.out.printf("Erro");
        }
        
        List<Funcionario> lista = null;
        try {
            lista = dao.buscar(func);
        } catch (ErroValidacaoException ex) {
            System.out.printf("Erro");
        }
        
        preencheTabela(lista);
    }//GEN-LAST:event_btnFiltrarFuncionarioActionPerformed

    private void tblListagemFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListagemFuncionarioMouseClicked
        //====================
        Telefone aux = new Telefone();
        Object valor = jtbTelefoneFuncionario.getValueAt( jtbTelefoneFuncionario.getSelectedRow(), 0);
            
        aux.setNum((int)valor);
        funcionario.removeTelefone(aux);
        //Chamar tabela novamente
        addCamposTelefone();
        
        //=====================
    }//GEN-LAST:event_tblListagemFuncionarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarFuncionario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpRemoverItemtbEndereco;
    private javax.swing.JPanel jpTituloProdutoListar;
    private javax.swing.JTable jtbEmailsFuncionario;
    private javax.swing.JTable jtbEnderecoFuncionario;
    private javax.swing.JTable jtbTelefoneFuncionario;
    private javax.swing.JLabel lblNomeProd;
    private javax.swing.JLabel lblTituloClienteListar;
    private javax.swing.JLabel lblTituloProdutoListar;
    private javax.swing.JTable tblListagemFuncionario;
    private javax.swing.JTextField txtFiltrarFuncionario;
    // End of variables declaration//GEN-END:variables
}
