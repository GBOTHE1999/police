/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policedepartment;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gokul
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        // hh.setBackground(new java.awt.Color(0,0,0,1));
  jLabel2.setIcon(img(jLabel2,"/images/i14.jpg"));
                    j1.setIcon(img(j1,"/images/ab.png"));
                    j2.setIcon(img(j2,"/images/li.png"));
                     //     j3.setIcon(img(j3,"aa.png"));
              j4.setIcon(img(j4,"/images/u1.png"));
              j5.setIcon(img(j5,"/images/p1.png"));
                l6.setIcon(img(l6,"/images/ok1.png"));
                  l7.setIcon(img(l7,"/images/cancel.png"));
                    l8.setIcon(img(l8,"/images/exit.png"));
    }
     public ImageIcon img(JLabel l,String image)
    {
         ImageIcon myimage;
        myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(image)));
Image img1;
     img1 = myimage.getImage();
Image img2=img1.getScaledInstance(l.getWidth(),l.getHeight(),Image.SCALE_SMOOTH);
ImageIcon i=new ImageIcon(img2);
return i;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        j4 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(220, 173, 153,125));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 3));
        jPanel2.setLayout(null);
        jPanel2.add(j4);
        j4.setBounds(131, 313, 35, 32);
        jPanel2.add(j5);
        j5.setBounds(131, 408, 35, 32);

        j2.setText("jLabel1");
        jPanel2.add(j2);
        j2.setBounds(158, 178, 315, 126);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Username:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(175, 313, 104, 32);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(362, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(131, 392, 362, 3);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Password:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(175, 408, 104, 32);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(362, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(131, 482, 362, 3);

        user.setBackground(new java.awt.Color(237, 155, 121));
        user.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        user.setHorizontalAlignment(JLabel.CENTER);
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 155, 121)));
        jPanel2.add(user);
        user.setBounds(175, 354, 312, 36);

        pass.setBackground(new java.awt.Color(186, 135, 122));
        pass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pass.setHorizontalAlignment(JLabel.CENTER);
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 135, 122)));
        jPanel2.add(pass);
        pass.setBounds(175, 447, 310, 34);

        l6.setText("jLabel4");
        l6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });
        jPanel2.add(l6);
        l6.setBounds(431, 540, 152, 54);

        l7.setText("jLabel4");
        l7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });
        jPanel2.add(l7);
        l7.setBounds(230, 540, 153, 54);

        l8.setText("jLabel4");
        l8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });
        jPanel2.add(l8);
        l8.setBounds(43, 540, 154, 54);

        j1.setText("jLabel5");
        jPanel2.add(j1);
        j1.setBounds(250, 0, 130, 160);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flag.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(160, 0, 310, 160);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(330, 0, 620, 710);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1320, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
    int result = JOptionPane.showConfirmDialog(null, "Do you want to Quit?");
      switch (result) {
         case JOptionPane.YES_OPTION:
        System.exit(WIDTH);
         break;
         case JOptionPane.NO_OPTION:
        // System.out.println("No");
         break;
     //    case JOptionPane.CANCEL_OPTION:
      //   System.out.println("Cancel");
      //   break;
         case JOptionPane.CLOSED_OPTION:
         System.out.println("Closed");
         break;
      }
        // TODO add your handling code here:
        
    }//GEN-LAST:event_l8MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        // TODO add your handling code here:
        user.setText("");
        pass.setText("");
    }//GEN-LAST:event_l7MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        // TODO add your handling code here:
                PreparedStatement st;
        ResultSet rs;
  String username1 = user.getText();
        String password1 = String.valueOf(pass.getPassword());
        String sql = "select * from useraccount where username='"+username1+"' and password='"+password1+"'";
   
    if(username1.trim().equals("user name"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
        }
        else if(password1.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
        }
        else{
    
            try {
                
                st = loginconnection.connection().prepareStatement(sql);
                rs= st.executeQuery();
                  ImageIcon myimage;
               
       // myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("round.gif")));

             if(rs.next())
                {
                    
                      try
            {
                   
             
                       //    n1.setIcon(myimage);
     //   n1.setVisible(true);      
             //   Thread.sleep(606);
          DashBoard1 d=new DashBoard1();
           
                    d.setVisible(true);
                    d.pack();
                      d.setLocationRelativeTo(null);
                   this.dispose();
                    d.show();
        
       }catch(Exception e){}
                }else{
                    // error message
                    JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
                }

            } catch (Exception ex) {
                //Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
            }

        }        // TODO add your handling code here:

    }//GEN-LAST:event_l6MouseClicked

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
