/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author micte
 */
public class CAlendar extends javax.swing.JFrame {

    /**
     * Creates new form CAlendar
     */
    public CAlendar() {
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

        jCalModel1 = new com.jcalendar.model.JCalModel();
        jCalModel2 = new com.jcalendar.model.JCalModel();
        jCalModel3 = new com.jcalendar.model.JCalModel();
        jCalModel4 = new com.jcalendar.model.JCalModel();
        jCalModel5 = new com.jcalendar.model.JCalModel();
        jCalModel6 = new com.jcalendar.model.JCalModel();
        jCalModel7 = new com.jcalendar.model.JCalModel();
        jCalModel8 = new com.jcalendar.model.JCalModel();
        jCalModel9 = new com.jcalendar.model.JCalModel();
        jCalModel10 = new com.jcalendar.model.JCalModel();
        jCalModel11 = new com.jcalendar.model.JCalModel();
        jCalModel12 = new com.jcalendar.model.JCalModel();
        jCalModel13 = new com.jcalendar.model.JCalModel();
        jCalModel14 = new com.jcalendar.model.JCalModel();
        jCalModel15 = new com.jcalendar.model.JCalModel();
        jCalModel16 = new com.jcalendar.model.JCalModel();
        jCalModel17 = new com.jcalendar.model.JCalModel();
        jCalModel18 = new com.jcalendar.model.JCalModel();
        jCalModel19 = new com.jcalendar.model.JCalModel();
        jCalModel20 = new com.jcalendar.model.JCalModel();
        jCalModel21 = new com.jcalendar.model.JCalModel();
        jCalModel22 = new com.jcalendar.model.JCalModel();
        jCalModel23 = new com.jcalendar.model.JCalModel();
        jCalModel24 = new com.jcalendar.model.JCalModel();
        jCalModel25 = new com.jcalendar.model.JCalModel();
        jCalModel26 = new com.jcalendar.model.JCalModel();
        jCalendarPanel2 = new de.wannawork.jcalendar.JCalendarPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clock1 = new com.jcalendar.pane.clock.Clock();
        jMonthPanel1 = new de.wannawork.jcalendar.JMonthPanel();
        jCalendarPanel1 = new de.wannawork.jcalendar.JCalendarPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CALENDAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCalendarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMonthPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clock1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMonthPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalendarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CAlendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAlendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAlendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAlendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAlendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.jcalendar.pane.clock.Clock clock1;
    private com.jcalendar.model.JCalModel jCalModel1;
    private com.jcalendar.model.JCalModel jCalModel10;
    private com.jcalendar.model.JCalModel jCalModel11;
    private com.jcalendar.model.JCalModel jCalModel12;
    private com.jcalendar.model.JCalModel jCalModel13;
    private com.jcalendar.model.JCalModel jCalModel14;
    private com.jcalendar.model.JCalModel jCalModel15;
    private com.jcalendar.model.JCalModel jCalModel16;
    private com.jcalendar.model.JCalModel jCalModel17;
    private com.jcalendar.model.JCalModel jCalModel18;
    private com.jcalendar.model.JCalModel jCalModel19;
    private com.jcalendar.model.JCalModel jCalModel2;
    private com.jcalendar.model.JCalModel jCalModel20;
    private com.jcalendar.model.JCalModel jCalModel21;
    private com.jcalendar.model.JCalModel jCalModel22;
    private com.jcalendar.model.JCalModel jCalModel23;
    private com.jcalendar.model.JCalModel jCalModel24;
    private com.jcalendar.model.JCalModel jCalModel25;
    private com.jcalendar.model.JCalModel jCalModel26;
    private com.jcalendar.model.JCalModel jCalModel3;
    private com.jcalendar.model.JCalModel jCalModel4;
    private com.jcalendar.model.JCalModel jCalModel5;
    private com.jcalendar.model.JCalModel jCalModel6;
    private com.jcalendar.model.JCalModel jCalModel7;
    private com.jcalendar.model.JCalModel jCalModel8;
    private com.jcalendar.model.JCalModel jCalModel9;
    private de.wannawork.jcalendar.JCalendarPanel jCalendarPanel1;
    private de.wannawork.jcalendar.JCalendarPanel jCalendarPanel2;
    private javax.swing.JLabel jLabel1;
    private de.wannawork.jcalendar.JMonthPanel jMonthPanel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
