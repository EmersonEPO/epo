/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.trabalho.telas;

import br.edu.ifnmg.trabalho.DataAccess.PagamentoDao;
import br.edu.ifnmg.trabalho.classes.ErroValidacaoException;
import br.edu.ifnmg.trabalho.classes.Pagamento;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author emerson
 */
public class frmPagamentoCad extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmProdutoInterno
     */
    public frmPagamentoCad() {
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

        lblCadNomePaga = new javax.swing.JLabel();
        lblCadJurosPaga = new javax.swing.JLabel();
        txtCadNomePaga = new javax.swing.JTextField();
        txtCadJurosPaga = new javax.swing.JTextField();
        btnFinalizarPaga = new javax.swing.JButton();
        btnCancelarPaga = new javax.swing.JButton();
        btnLimparPaga = new javax.swing.JButton();
        jpTituloPagamentoCad = new javax.swing.JPanel();
        lblTituloPagamentoCad = new javax.swing.JLabel();

        setClosable(true);

        lblCadNomePaga.setText("Nome");

        lblCadJurosPaga.setText("Juros");

        txtCadJurosPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadJurosPagaActionPerformed(evt);
            }
        });

        btnFinalizarPaga.setText("Finalizar");
        btnFinalizarPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPagaActionPerformed(evt);
            }
        });

        btnCancelarPaga.setText("Cancelar");
        btnCancelarPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPagaActionPerformed(evt);
            }
        });

        btnLimparPaga.setText("Limpar");
        btnLimparPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPagaActionPerformed(evt);
            }
        });

        jpTituloPagamentoCad.setBackground(new java.awt.Color(0, 102, 153));

        lblTituloPagamentoCad.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lblTituloPagamentoCad.setText("Cadastrar Pagamento");

        javax.swing.GroupLayout jpTituloPagamentoCadLayout = new javax.swing.GroupLayout(jpTituloPagamentoCad);
        jpTituloPagamentoCad.setLayout(jpTituloPagamentoCadLayout);
        jpTituloPagamentoCadLayout.setHorizontalGroup(
            jpTituloPagamentoCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloPagamentoCadLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(lblTituloPagamentoCad)
                .addGap(163, 163, 163))
        );
        jpTituloPagamentoCadLayout.setVerticalGroup(
            jpTituloPagamentoCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloPagamentoCadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPagamentoCad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCadJurosPaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCadJurosPaga, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCadNomePaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCadNomePaga, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimparPaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizarPaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarPaga))
                .addContainerGap())
            .addComponent(jpTituloPagamentoCad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTituloPagamentoCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFinalizarPaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparPaga))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCadNomePaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCadNomePaga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCadJurosPaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCadJurosPaga))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarPaga)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPagaActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane,  "Deseja Cancelar?") == 0){              
            JOptionPane.showMessageDialog(rootPane, "Operação Cancelada");
            this.dispose();
        } else {               
            JOptionPane.showMessageDialog(rootPane,"Operação Não cancelada!");
            
        }
        
        
    }//GEN-LAST:event_btnCancelarPagaActionPerformed

    private void btnFinalizarPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPagaActionPerformed
         if(JOptionPane.showConfirmDialog(rootPane,  "Deseja Salvar?") == 0){  
            try{
                Pagamento paga = new Pagamento();
                
                //Setando os dados e convertendo de text para seus respectivos tipos.
                paga.setNome(txtCadNomePaga.getText());
                paga.setJuros(Double.parseDouble(txtCadJurosPaga.getText()));
              
                
                //Criando variavel dao para salvar os dados no BD.
                PagamentoDao dao = new PagamentoDao();
                //mandando prod para dao.Salvar.
                //Mensagem de confirmação!
                if(dao.Salvar(paga)){
                    JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Erro ao salvar! Consulte o administrador do sistema");
                }
            
                //Limpando campos do formularios para o usuarios nao inserir os mesmos dados novamente.
                txtCadNomePaga.setText(null);
                txtCadJurosPaga.setText(null);
                
            }catch (ExceptionInInitializerError ex) {
                Logger.getLogger(frmPagamentoCad.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {               
            JOptionPane.showMessageDialog(rootPane,"Operação Não cancelada!");
            
        }
    }//GEN-LAST:event_btnFinalizarPagaActionPerformed

    private void txtCadJurosPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadJurosPagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadJurosPagaActionPerformed

    private void btnLimparPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPagaActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente limpar os seguintes campos?") == 0) {
            txtCadNomePaga.setText(null);
            txtCadJurosPaga.setText(null);
            
            JOptionPane.showMessageDialog(rootPane, "Os Campos foram limpos!");
   
        } else {                
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }
    }//GEN-LAST:event_btnLimparPagaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPaga;
    private javax.swing.JButton btnFinalizarPaga;
    private javax.swing.JButton btnLimparPaga;
    private javax.swing.JPanel jpTituloPagamentoCad;
    private javax.swing.JLabel lblCadJurosPaga;
    private javax.swing.JLabel lblCadNomePaga;
    private javax.swing.JLabel lblTituloPagamentoCad;
    private javax.swing.JTextField txtCadJurosPaga;
    private javax.swing.JTextField txtCadNomePaga;
    // End of variables declaration//GEN-END:variables
}
