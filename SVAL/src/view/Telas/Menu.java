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
public class Menu extends javax.swing.JInternalFrame {

    /**
     * Creates new form Menu1
     */
    public Menu() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblLivros1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblLivros2 = new javax.swing.JTable();

        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo0", "Autor", "Edicao", "ISBN", "Data public", "Quant", "Preco"
            }
        ));
        jScrollPane1.setViewportView(tblLivros);

        jTabbedPane1.addTab("Emprestimos efectuados", jScrollPane1);

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
        jScrollPane6.setViewportView(tblLivros1);

        jTabbedPane1.addTab("Vendas Efectuadas", jScrollPane6);

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
        jScrollPane7.setViewportView(tblLivros2);

        jTabbedPane1.addTab("Devolucoes", jScrollPane7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLivros1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivros1MousePressed
        // TODO add your handling code here:
        //Long id = pegarId();
    }//GEN-LAST:event_tblLivros1MousePressed

    private void tblLivros2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivros2MousePressed
        // TODO add your handling code here:
        //Long id = pegarId();
        //txtIdLivro.setText(String.valueOf(pegarId()));
    }//GEN-LAST:event_tblLivros2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLivros;
    private javax.swing.JTable tblLivros1;
    private javax.swing.JTable tblLivros2;
    // End of variables declaration//GEN-END:variables
}