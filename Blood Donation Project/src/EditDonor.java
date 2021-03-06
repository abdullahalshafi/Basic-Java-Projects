import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAFKAT
 */
public class EditDonor extends javax.swing.JFrame {
    private DBCon dbcon=new DBCon();
    
    /**
     * Creates new form EditDonor
     */
    public EditDonor() {
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
        searchTxt = new javax.swing.JTextField();
        EditBt = new javax.swing.JButton();
        BackBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Donor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Enter Donor Id or Name To Edit");

        searchTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        EditBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EditBt.setText("Edit");
        EditBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtActionPerformed(evt);
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
                        .addGap(45, 45, 45)
                        .addComponent(BackBt)
                        .addGap(81, 81, 81)
                        .addComponent(EditBt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(BackBt)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(EditBt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(582, 311));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtActionPerformed
        close();
       String SearchTxt=searchTxt.getText();
       
       DonorUpdate d = new DonorUpdate();
       String sql;
       
       if(SearchTxt.length()>=3 &&SearchTxt.length()<=5 ) {
                if(dbcon.CheckDonor(SearchTxt).equals("found")) {
                
                MainClass m=null;
                sql="SELECT *FROM donor_table WHERE Id='"+SearchTxt+"'";
                m=dbcon.getdonor(sql);
                
                d.setVisible(true);
                d.IdNo.setText(m.get_donor_id());
                d.GenderTxt.setText(m.get_donor_gender());
                d.DonorName.setText(m.get_donor_name());
                d.DonorPhnNum.setText(m.get_donor_num());
                d.DonorAddr.setText(m.get_donor_addr());
                d.DonorAge.setText(m.get_donor_age());
                d.DonorHeight.setText(m.get_donor_height());
                d.DonorWeight.setText(m.get_donor_weight());
                d.LastDateOfDn.setText(m.getlastdateofdn());
                d.BloodGr.setText(m.get_donor_blood_group());
                }
                else {
                    JOptionPane.showMessageDialog(null, "Match Not Found !","Error",JOptionPane.ERROR_MESSAGE);
                }
             
            }
       
       else if(SearchTxt.length()>5) {
             
                if(dbcon.CheckDonor(SearchTxt).equals("found")){
                MainClass m=null;
                sql="SELECT *FROM donor_table WHERE Name='"+SearchTxt.toLowerCase()+"'";
                m=dbcon.getdonor(sql);
                
                d.setVisible(true);
                d.IdNo.setText(m.get_donor_id());
                d.GenderTxt.setText(m.get_donor_gender());
                d.DonorName.setText(m.get_donor_name());
                d.DonorAddr.setText(m.get_donor_num());
                d.DonorPhnNum.setText(m.get_donor_addr());
                d.DonorAge.setText(m.get_donor_age());
                d.DonorHeight.setText(m.get_donor_height());
                d.DonorWeight.setText(m.get_donor_weight());
                d.LastDateOfDn.setText(m.getlastdateofdn());
                
                }
                else {
                    JOptionPane.showMessageDialog(null, "Match Not Found !","Error",JOptionPane.ERROR_MESSAGE);
                }
       }
         else if(SearchTxt.length()<3) {
           JOptionPane.showMessageDialog(null, "Incomplete Entries !" , "Error" ,JOptionPane.ERROR_MESSAGE);
       }
       
    }//GEN-LAST:event_EditBtActionPerformed

    private void BackBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtActionPerformed
         close();
        StartForm s =new StartForm();
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
            java.util.logging.Logger.getLogger(EditDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBt;
    private javax.swing.JButton EditBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
