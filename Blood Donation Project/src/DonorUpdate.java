import java.sql.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;

public class DonorUpdate extends javax.swing.JFrame {

  
    private DBCon dbcon=new DBCon();
    /**
     * Creates new form SecondFormS
     */
       
    
    public DonorUpdate() {
        initComponents();
        this.setResizable(false);
        //getContentPane().setBackground(new Color(102,0,0));
        
        //getContentPane().setBackground(new Color(229,255,204));
    }
    
    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public void reset() {
        
        this.IdNo.setText("");
        this.DonorName.setText("");
        this.DonorAddr.setText("");
        this.DonorPhnNum.setText("");
        this.DonorAge.setText("");
        this.GenderTxt.setText("");
        this.DonorHeight.setText("");
        this.DonorWeight.setText("");
        this.BloodGr.setText("");
        this.LastDateOfDn.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DonorAddr = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        DonorAge = new javax.swing.JTextField();
        DonorHeight = new javax.swing.JTextField();
        DonorName = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        DonorWeight = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        bloodgroupLabel1 = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DonorPhnNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IdNo = new javax.swing.JTextField();
        lastdonationLabel = new javax.swing.JLabel();
        LastDateOfDn = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        GenderTxt = new javax.swing.JTextField();
        BloodGr = new javax.swing.JTextField();
        UpdateBt = new javax.swing.JButton();
        CancelBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Donor");
        setBackground(new java.awt.Color(255, 0, 0));

        DonorAddr.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        genderLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        genderLabel.setText("Gender");

        DonorAge.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        DonorHeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        DonorName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DonorName.setToolTipText("Must be greater than 6 letters");

        contactLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contactLabel.setText("Contact Number");

        DonorWeight.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        ageLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ageLabel.setText("Age");

        heightLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        heightLabel.setText("Height (in Ft.)");

        bloodgroupLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bloodgroupLabel1.setText("Blood Group");

        weightLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        weightLabel.setText("Weight (in KG.)");

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel1.setText("Full Name");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Donor Update Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Address");

        DonorPhnNum.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Donor Id No.");

        IdNo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        IdNo.setToolTipText("Id won't be changed");

        lastdonationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lastdonationLabel.setText("Last Date of Donation");

        LastDateOfDn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        GenderTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        BloodGr.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        UpdateBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UpdateBt.setText("Update");
        UpdateBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtActionPerformed(evt);
            }
        });

        CancelBt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CancelBt.setText("Cancel");
        CancelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LastDateOfDn, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(DonorAddr)
                            .addComponent(DonorName)
                            .addComponent(IdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(nameLabel1)
                            .addComponent(heightLabel)
                            .addComponent(DonorHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastdonationLabel)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloodgroupLabel1)
                                    .addComponent(BloodGr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DonorAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DonorPhnNum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(GenderTxt)
                                            .addComponent(genderLabel)
                                            .addComponent(contactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CancelBt)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ageLabel)
                                        .addComponent(weightLabel)
                                        .addComponent(DonorWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UpdateBt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenderTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonorPhnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DonorAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DonorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightLabel)
                            .addComponent(heightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DonorWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DonorHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastdonationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodgroupLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BloodGr)
                            .addComponent(LastDateOfDn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(UpdateBt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelBt)
                        .addContainerGap())))
        );

        setSize(new java.awt.Dimension(613, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtActionPerformed
        
        
       
        String sql;
        String id=IdNo.getText();
        String name=DonorName.getText();
        String num=DonorPhnNum.getText();
        String addr=DonorAddr.getText();
        String age=DonorAge.getText();
        String gender=GenderTxt.getText();
        String height=DonorHeight.getText();
        String weight=DonorWeight.getText();
        String blood_group=BloodGr.getText();
        String last_date_of_dn=LastDateOfDn.getText();
        
        if(id.length()>0 && name.length()>5 && num.length()>0 && addr.length()>0 && age.length()>0 && 
                gender.length()>0 && height.length()>0&& weight.length()>0&& blood_group.length()>0&& 
                last_date_of_dn.length()>0) {
            
            int n=JOptionPane.showConfirmDialog(null, "Do You Really Want To Update","Update",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(n==0) {
            sql="UPDATE donor_table SET Name='"+name+"',Phone_Number='"+num+"',Address='"+addr+"',Age='"+age+"',"
                    + "Gender='"+gender+"',Height='"+height+"',Weight='"+weight+"',Blood_Group='"+blood_group.toUpperCase()+"',"
                    + "Last_Date_Of_Donation='"+last_date_of_dn+"' WHERE Id='"+id+"'";
            
            dbcon.update(sql);
            
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            
            reset();
            close();
           StartForm s= new StartForm();
            s.setVisible(true);
            }
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Incomplete entries","Error",JOptionPane.ERROR_MESSAGE);
            //close();
            //StartForm s= new StartForm();
            // s.setVisible(true);
        }
       
    }//GEN-LAST:event_UpdateBtActionPerformed

    private void CancelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtActionPerformed
        close();
        StartForm s = new StartForm();
        s.setVisible(true);
    }//GEN-LAST:event_CancelBtActionPerformed

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
            java.util.logging.Logger.getLogger(SecondDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondDonorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondDonorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField BloodGr;
    private javax.swing.JButton CancelBt;
    public javax.swing.JTextField DonorAddr;
    public javax.swing.JTextField DonorAge;
    public javax.swing.JTextField DonorHeight;
    public javax.swing.JTextField DonorName;
    public javax.swing.JTextField DonorPhnNum;
    public javax.swing.JTextField DonorWeight;
    public javax.swing.JTextField GenderTxt;
    public javax.swing.JTextField IdNo;
    public javax.swing.JTextField LastDateOfDn;
    private javax.swing.JButton UpdateBt;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel bloodgroupLabel1;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastdonationLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
