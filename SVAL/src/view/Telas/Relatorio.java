/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Telas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author kevin
 */
public class Relatorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form Menu1
     */
    public Relatorio() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLivros1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLivros2 = new javax.swing.JTable();

        tblLivros1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Edicao", "ISBN", "Data public", "Quant", "Preco"
            }
        ));
        tblLivros1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLivros1MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tblLivros1);

        jTabbedPane6.addTab("Vendas", jScrollPane3);

        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Edicao", "ISBN", "Data public", "Quant", "Preco"
            }
        ));
        tblLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLivrosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblLivros);

        jTabbedPane6.addTab("Emprestimos", jScrollPane2);

        tblLivros2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Edicao", "ISBN", "Data public", "Quant", "Preco"
            }
        ));
        tblLivros2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLivros2MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tblLivros2);

        jTabbedPane6.addTab("Devolucoes", jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLivros1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivros1MousePressed
        // TODO add your handling code here:
     //   Long id = pegarId();
    }//GEN-LAST:event_tblLivros1MousePressed

    private void tblLivrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivrosMousePressed
        // TODO add your handling code here:
      //  Long id = pegarId();
      //  txtIdLivro.setText(String.valueOf(pegarId()));
    }//GEN-LAST:event_tblLivrosMousePressed

    private void tblLivros2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivros2MousePressed
        // TODO add your handling code here:
        //Long id = pegarId();
        //txtIdLivro.setText(String.valueOf(pegarId()));
    }//GEN-LAST:event_tblLivros2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable tblLivros;
    private javax.swing.JTable tblLivros1;
    private javax.swing.JTable tblLivros2;
    // End of variables declaration//GEN-END:variables
}
