/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pancer.dreams;

import javax.swing.JPanel;

/**
 *
 * @author carlos
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.obtenerRecentDreams();

    }

    private void obtenerRecentDreams() {
        // Buscar en la base de datos
        String title = "Carro volando";
        String fecha = "12/12/25";
        String categoria = "Raro";
        String[] tags = new String[]{"Carros", "Terror", "Accion"};
        
        JPanel recentCard = new RecentDreamCard(title, fecha, categoria, tags); 
        recentDreamsPanel.add(recentCard);
        
        String title1 = "Carro volando";
        String fecha1 = "12/12/25";
        String categoria1 = "Raro";
        String[] tags1 = new String[]{"Carros", "Terror", "Accion"};
        
        JPanel recentCard1 = new RecentDreamCard(title1, fecha1, categoria1, tags1); 
        recentDreamsPanel.add(recentCard1);
        
        String title2 = "Carro volando";
        String fecha2 = "12/12/25";
        String categoria2 = "Raro";
        String[] tags2 = new String[]{"Carros", "Terror", "Accion"};
        
        JPanel recentCard2 = new RecentDreamCard(title2, fecha2, categoria2, tags2); 
        recentDreamsPanel.add(recentCard2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        recentDreamsPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(110, 0), new java.awt.Dimension(110, 0), new java.awt.Dimension(110, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 251, 252));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        titlePanel.setBackground(new java.awt.Color(255, 251, 252));
        titlePanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Welcome Back Dreamer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 0, 13);
        titlePanel.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Your dream awaits or idk");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 14, 0);
        titlePanel.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 663;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(titlePanel, gridBagConstraints);

        buttonsPanel.setBackground(new java.awt.Color(255, 251, 252));
        buttonsPanel.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(223, 215, 248));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/microphone-icon.jpg"))); // NOI18N
        jButton1.setText("Grabar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 215, 255), 1, true));
        jButton1.setMaximumSize(new java.awt.Dimension(200, 120));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 18, 18);
        buttonsPanel.add(jButton1, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(223, 215, 248));
        jButton4.setText("Analizar");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 215, 255), 1, true));
        jButton4.setMaximumSize(new java.awt.Dimension(200, 120));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 18, 18);
        buttonsPanel.add(jButton4, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(223, 215, 248));
        jButton5.setText("Ver Patrones");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 215, 255), 1, true));
        jButton5.setMaximumSize(new java.awt.Dimension(200, 120));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 18, 18);
        buttonsPanel.add(jButton5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.ipady = -10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 0, 0);
        jPanel1.add(buttonsPanel, gridBagConstraints);

        recentDreamsPanel.setBackground(new java.awt.Color(255, 255, 255));
        recentDreamsPanel.setLayout(new javax.swing.BoxLayout(recentDreamsPanel, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 32)); // NOI18N
        jLabel3.setText("Recent dreams");
        jPanel2.add(jLabel3);

        jLabel4.setText("View all            >");
        jPanel2.add(jLabel4);

        recentDreamsPanel.add(jPanel2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 27, 0);
        jPanel1.add(recentDreamsPanel, gridBagConstraints);
        jPanel1.add(filler1, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel recentDreamsPanel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
