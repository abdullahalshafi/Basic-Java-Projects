
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAFKAT
 */
public class DeleteDonor extends javax.swing.JFrame {
    
    private DBCon dbcon = new DBCon();
    
    /**
     * Creates new form DeleteDonor
     */
    public DeleteDonor() {
        initComponents();
        this.setResizable(false);
        //getContentPane().setBackground(new Color(102,0,0));
    }

       public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Text = new javax.swing.JTextField();
        DeleteBt = new javax.swing.JButton();
        BackBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Donor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Enter Donor Id or Name To Delete");

        Text.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Text.setToolTipText("");

        DeleteBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DeleteBt.setText("Delete");
        DeleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtActionPerformed(evt);
            }
        });

        BackBt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BackBt.setText("Back");
        BackBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(DeleteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackBt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackBt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(534, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtActionPerformed
        String text=Text.getText();
        
        
        
        String sql;
        if(text.length()>=3 && text.length()<=5) {
            
            if(dbcon.CheckDonorDelete(text).equals("found")) {
            int n=JOptionPane.showConfirmDialog(null, "Do You Really Want To Delete","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(n==0) {
            sql="DELETE FROM donor_table WHERE Id='"+text+"'";
            dbcon.delete(sql);
            JOptionPane.showMessageDialog(null, "Successfully Deleted!");
            close();
            StartForm s = new StartForm();
            s.setVisible(true);
            }
            }
        
            else {
                
                    JOptionPane.showMessageDialog(null, "Match Not Found !","Error",JOptionPane.ERROR_MESSAGE);
                }
        }
        
        else if(text.length()>5) {
            
            if(dbcon.CheckDonorDelete(text).equals("found")){
            int n=JOptionPane.showConfirmDialog(null, "Do You Really Want To Delete","Delete",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(n==0) {
            sql="DELETE FROM donor_table WHERE Name='"+text+"'";
            dbcon.delete(sql);
            JOptionPane.showMessageDialog(null, "Successfully Deleted!");
            close();
            StartForm s = new StartForm();
            s.setVisible(true);
            }
            }
             else {
                    JOptionPane.showMessageDialog(null, "Match Not Found !","Error",JOptionPane.ERROR_MESSAGE);
                }
        }
          else if(text.length()<3) {
           JOptionPane.showMessageDialog(null, "Incomplete Entries !" , "Error" ,JOptionPane.ERROR_MESSAGE);
       }
        
        else {
            JOptionPane.showMessageDialog(null, "Match Not Found!","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_DeleteBtActionPerformed

    private void BackBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtActionPerformed
        close();
        StartForm s = new StartForm();
        s.setVisible(true);
    }//GEN-LAST:event_BackBtActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBt;
    private javax.swing.JButton DeleteBt;
    private javax.swing.JTextField Text;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
