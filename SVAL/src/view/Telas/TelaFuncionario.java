package view.Telas;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class TelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    Color DefaultColor, ClickedColor;
    
        

    public TelaFuncionario() {
        initComponents();

        DefaultColor = new Color(20, 20, 49);
        ClickedColor = new Color(250, 87, 9);

        //Set default color to pan on run time
        BtnMenu1.setBackground(DefaultColor);
        BtnEmprestar.setBackground(DefaultColor);
        BtnClientes2.setBackground(DefaultColor);
        BtnVender.setBackground(DefaultColor);
        BtnMultas.setBackground(DefaultColor);
        BtnSair.setBackground(DefaultColor);
        BtnDevolucao.setBackground(DefaultColor);
        BtnMenu1.setBackground(DefaultColor);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BtnMenu1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnEmprestar = new javax.swing.JPanel();
        BtnEmprestar2 = new javax.swing.JLabel();
        BtnClientes2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BtnVender = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnMultas = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BtnSair = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BtnDevolucao = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 87, 9));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/icons8-fechar-janela-55.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, -1, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 20, 49));
        jLabel4.setText("Funcionario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        BtnMenu1.setBackground(new java.awt.Color(20, 20, 49));
        BtnMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenu1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnMenu1MousePressed(evt);
            }
        });
        BtnMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(20, 20, 49));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/menu-50.png"))); // NOI18N
        jLabel2.setText("Menu");
        BtnMenu1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 136, -1));

        BtnEmprestar.setBackground(new java.awt.Color(20, 20, 49));
        BtnEmprestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEmprestarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnEmprestarMousePressed(evt);
            }
        });
        BtnEmprestar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEmprestar2.setBackground(new java.awt.Color(255, 255, 255));
        BtnEmprestar2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        BtnEmprestar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnEmprestar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/emprestar-50.png"))); // NOI18N
        BtnEmprestar2.setText("Emprestar");
        BtnEmprestar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEmprestar2MouseClicked(evt);
            }
        });
        BtnEmprestar.add(BtnEmprestar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        BtnClientes2.setBackground(new java.awt.Color(20, 20, 49));
        BtnClientes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClientes2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnClientes2MousePressed(evt);
            }
        });
        BtnClientes2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Cliente-50.png"))); // NOI18N
        jLabel3.setText("Clientes");
        BtnClientes2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        BtnVender.setBackground(new java.awt.Color(20, 20, 49));
        BtnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVenderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnVenderMousePressed(evt);
            }
        });
        BtnVender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/vender-50.png"))); // NOI18N
        jLabel6.setText("Vender");
        BtnVender.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        BtnMultas.setBackground(new java.awt.Color(20, 20, 49));
        BtnMultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMultasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnMultasMousePressed(evt);
            }
        });
        BtnMultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/stock-50.png"))); // NOI18N
        jLabel7.setText("Relatorio");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        BtnMultas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        BtnSair.setBackground(new java.awt.Color(20, 20, 49));
        BtnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnSairMousePressed(evt);
            }
        });
        BtnSair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/sair-50.png"))); // NOI18N
        jLabel8.setText("Sair");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        BtnSair.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        BtnDevolucao.setBackground(new java.awt.Color(20, 20, 49));
        BtnDevolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDevolucaoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnDevolucaoMousePressed(evt);
            }
        });
        BtnDevolucao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/devolver-o-livro-50.png"))); // NOI18N
        jLabel9.setText("Devolver");
        BtnDevolucao.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnClientes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEmprestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BtnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEmprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BtnClientes2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 690));

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/lOGO.jpg"))); // NOI18N

        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 990, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenu1MousePressed
        // TODO add your handling code here:
        BtnMenu1.setBackground(ClickedColor);
        BtnEmprestar.setBackground(DefaultColor);
        BtnClientes2.setBackground(DefaultColor);
        BtnVender.setBackground(DefaultColor);
        BtnMultas.setBackground(DefaultColor);
        BtnSair.setBackground(DefaultColor);
        BtnDevolucao.setBackground(DefaultColor);      
    }//GEN-LAST:event_BtnMenu1MousePressed

    private void BtnClientes2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientes2MousePressed
        // TODO add your handling code here:
        BtnMenu1.setBackground(DefaultColor);
        BtnEmprestar.setBackground(DefaultColor);
        BtnClientes2.setBackground(ClickedColor);
        BtnVender.setBackground(DefaultColor);
        BtnMultas.setBackground(DefaultColor);
        BtnSair.setBackground(DefaultColor);
        BtnDevolucao.setBackground(DefaultColor);

    }//GEN-LAST:event_BtnClientes2MousePressed

    private void BtnMultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMultasMousePressed
        // TODO add your handling code here:
        BtnMenu1.setBackground(DefaultColor);
        BtnEmprestar.setBackground(DefaultColor);
        BtnClientes2.setBackground(DefaultColor);
        BtnVender.setBackground(DefaultColor);
        BtnMultas.setBackground(ClickedColor);       
        BtnSair.setBackground(DefaultColor);
        BtnDevolucao.setBackground(DefaultColor);
    }//GEN-LAST:event_BtnMultasMousePressed

    private void BtnSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSairMousePressed
        // TODO add your handling code here:
        BtnMenu1.setBackground(DefaultColor);
        BtnEmprestar.setBackground(DefaultColor);
        BtnClientes2.setBackground(DefaultColor);
        BtnVender.setBackground(DefaultColor);
        BtnMultas.setBackground(DefaultColor);
        BtnSair.setBackground(ClickedColor);
        BtnDevolucao.setBackground(DefaultColor);
    }//GEN-LAST:event_BtnSairMousePressed

    private void BtnClientes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClientes2MouseClicked
        
        TelaCadastroCliente menu1 = new TelaCadastroCliente();
        desktop.removeAll();
        desktop.add(menu1).setVisible(true);
    }//GEN-LAST:event_BtnClientes2MouseClicked

    private void BtnMultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMultasMouseClicked
        // TODO add your handling code here:
        Menu menu = new Menu();
        desktop.removeAll();
        desktop.add(menu).setVisible(true);
    }//GEN-LAST:event_BtnMultasMouseClicked

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?");
        if (resposta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void BtnVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVenderMousePressed
        // TODO add your handling code here:
        BtnMenu1.setBackground(DefaultColor);
        BtnEmprestar.setBackground(DefaultColor);
        BtnClientes2.setBackground(DefaultColor);
        BtnVender.setBackground(ClickedColor);
        BtnMultas.setBackground(DefaultColor);
        BtnSair.setBackground(DefaultColor);
        BtnDevolucao.setBackground(DefaultColor);
        
    }//GEN-LAST:event_BtnVenderMousePressed

    private void BtnVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVenderMouseClicked
        // TODO add your handling code here:
        TelaDeVenda menuVender = new TelaDeVenda();
        desktop.removeAll();
        desktop.add(menuVender).setVisible(true);
    }//GEN-LAST:event_BtnVenderMouseClicked

    private void BtnDevolucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDevolucaoMouseClicked
        // TODO add your handling code here:
        
        TelaDevolucao telaDevolucao = new TelaDevolucao();
        desktop.removeAll();
        desktop.add(telaDevolucao).setVisible(true);
        
    }//GEN-LAST:event_BtnDevolucaoMouseClicked

    private void BtnDevolucaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDevolucaoMousePressed
        // TODO add your handling code here:
        BtnMenu1.setBackground(DefaultColor);
        BtnEmprestar.setBackground(DefaultColor);
        BtnClientes2.setBackground(DefaultColor);
        BtnVender.setBackground(DefaultColor);
        BtnDevolucao.setBackground(ClickedColor);
        BtnMultas.setBackground(DefaultColor);
        BtnSair.setBackground(DefaultColor);
    }//GEN-LAST:event_BtnDevolucaoMousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void BtnMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenu1MouseClicked
        // TODO add your handling code here:
        MenuHome menuFuncionario = new MenuHome();
        desktop.removeAll();
        desktop.add(menuFuncionario).setVisible(true);
    }//GEN-LAST:event_BtnMenu1MouseClicked

    private void BtnEmprestar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmprestar2MouseClicked
        ///TODO add your handling code here:
        // MenuCadastroCliente menu1 = new TelaCadastroCliente();
        //jDesktopPanel.removeAll();
        //jDesktopPanel.add(menu1).setVisible(true);
        TelaDeEmprestimo menuEmprestimo = new TelaDeEmprestimo();
        desktop.removeAll();
        desktop.add(menuEmprestimo).setVisible(true);
    }//GEN-LAST:event_BtnEmprestar2MouseClicked

    private void BtnEmprestarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmprestarMousePressed
        // TODO add your handling code here:
        BtnMenu1.setBackground(DefaultColor);
        BtnEmprestar.setBackground(ClickedColor);
        BtnClientes2.setBackground(DefaultColor);
        BtnVender.setBackground(DefaultColor);
        BtnMultas.setBackground(DefaultColor);
        BtnSair.setBackground(DefaultColor);
        BtnDevolucao.setBackground(DefaultColor);
    }//GEN-LAST:event_BtnEmprestarMousePressed

    private void BtnEmprestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmprestarMouseClicked
        // TODO add your handling code here:
        TelaDeEmprestimo telaDeEmprestimo = new TelaDeEmprestimo();
        desktop.removeAll();
        desktop.add(telaDeEmprestimo).setVisible(true);
    }//GEN-LAST:event_BtnEmprestarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    //    MenuHome menuHome = new MenuHome();
    //   desktop.removeAll();
    //    desktop.add(menuHome).setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(Gestor.class.getName())BtnMenu1va.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnClientes2;
    private javax.swing.JPanel BtnDevolucao;
    private javax.swing.JPanel BtnEmprestar;
    private javax.swing.JLabel BtnEmprestar2;
    private javax.swing.JPanel BtnMenu1;
    private javax.swing.JPanel BtnMultas;
    private javax.swing.JPanel BtnSair;
    private javax.swing.JPanel BtnVender;
    public javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
