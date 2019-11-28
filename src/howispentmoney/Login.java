package howispentmoney;

import static howispentmoney.Main.demo;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Dashboard
     */
    public Login() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        login_bn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 560));
        getContentPane().setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(150, 10));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 320, 210, 10);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(150, 10));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(70, 270, 210, 10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 180, 80, 30);

        username_tf.setBackground(new java.awt.Color(31, 34, 41));
        username_tf.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        username_tf.setForeground(new java.awt.Color(255, 255, 255));
        username_tf.setBorder(null);
        getContentPane().add(username_tf);
        username_tf.setBounds(70, 240, 210, 30);

        login_bn.setBackground(new java.awt.Color(190, 28, 80));
        login_bn.setForeground(new java.awt.Color(255, 255, 255));
        login_bn.setText("Login");
        login_bn.setBorder(null);
        login_bn.setBorderPainted(false);
        login_bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_bnActionPerformed(evt);
            }
        });
        getContentPane().add(login_bn);
        login_bn.setBounds(70, 340, 210, 40);

        jButton2.setBackground(new java.awt.Color(38, 41, 48));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 410, 210, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("doesn't have an accout?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 390, 140, 15);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 270, 60, 16);

        jButton1.setBackground(new java.awt.Color(31, 34, 41));
        jButton1.setForeground(new java.awt.Color(31, 34, 41));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/howispentmoney/close.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setDisabledIcon(null);
        jButton1.setDisabledSelectedIcon(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(287, 0, 60, 50);

        password.setBackground(new java.awt.Color(31, 34, 41));
        password.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        getContentPane().add(password);
        password.setBounds(70, 290, 210, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/howispentmoney/hismlogo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 70, 70, 70);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 220, 60, 15);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/howispentmoney/hismloginbg.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 350, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void login_bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_bnActionPerformed
//        System.out.println(DatabaseConnection.login_check(username.getText() ,password.getText()));
        String current_user = DatabaseConnection.login_check(username_tf.getText(), password.getText());
        System.out.println(current_user);
        if(current_user != null) {
            Main.demo = new CardLayoutDemo();
            Main.main_frame = new Frame();
            demo.addComponentToPane(Main.main_frame.getContentPane());
            Main.main_frame.setSize(800, 600);
            Main.main_frame.setResizable(false);
            Main.main_frame.setUndecorated(true);
            Main.main_frame.setLocationRelativeTo(null);
            Main.main_frame.setVisible(true);
            this.setVisible(false);
        } else {
            System.out.println("no user found");
            return;
        }
        this.dispose();
    }//GEN-LAST:event_login_bnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Register rp = new Register();
        rp.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login_bn;
    private javax.swing.JPasswordField password;
    public static javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables

}
