import java.sql.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;

public class SecondDonorForm extends javax.swing.JFrame {

  
    private DBCon dbcon=new DBCon();
    /**
     * Creates new form SecondFormS
     */
        public void reset() {
        
        
        this.IdNo.setText("");
        this.DonorName.setText("");
        this.DonorAddr.setText("");
        this.DonorPhnNum.setText("");
        this.DonorAge.setText("");
        this.DonorGender.setSelectedItem("");
        this.DonorHeight.setText("");
        this.DonorWeight.setText("");
        this.DonorBloodGr.setSelectedItem("");
        this.LastDateOfDn.setText("");
    }
    
    public SecondDonorForm() {
        initComponents();
        this.setResizable(false);
        //getContentPane().setBackground(new Color(102,0,0));
        //getContentPane().setBackground(new Color(229,255,204));
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

        DonorGender = new javax.swing.JComboBox();
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
        DonorBloodGr = new javax.swing.JComboBox();
        nameLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DonorPhnNum = new javax.swing.JTextField();
        BackBt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        IdNo = new javax.swing.JTextField();
        lastdonationLabel = new javax.swing.JLabel();
        LastDateOfDn = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Donor Form");
        setBackground(new java.awt.Color(255, 0, 0));

        DonorGender.setFont(new java.awt.Font("Nokia Sans S60", 0, 18)); // NOI18N
        DonorGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female", "Decline to State" }));

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

        DonorBloodGr.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DonorBloodGr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+" }));

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel1.setText("Full Name");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel1.setText("Donor Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Address");

        DonorPhnNum.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        BackBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackBt.setText("Back");
        BackBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Donor Id No.");

        IdNo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        IdNo.setToolTipText("Must be 3 to 5 letters");

        lastdonationLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lastdonationLabel.setText("Last Date of Donation");

        LastDateOfDn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(BackBt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LastDateOfDn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(DonorAddr, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DonorName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DonorHeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastdonationLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ageLabel)
                                            .addComponent(weightLabel)
                                            .addComponent(DonorWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bloodgroupLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DonorBloodGr, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DonorAge, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DonorPhnNum, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(33, 33, 33))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DonorGender, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel)
                                    .addComponent(contactLabel))
                                .addGap(42, 42, 42))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonorGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonorPhnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastDateOfDn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DonorBloodGr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BackBt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        setSize(new java.awt.Dimension(613, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtActionPerformed
        close();
        StartForm s=new StartForm();
        s.setVisible(true);
    }//GEN-LAST:event_BackBtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String sql;
        String id=IdNo.getText();
        String name=DonorName.getText().toLowerCase();
        String num=DonorPhnNum.getText();
        String addr=DonorAddr.getText();
        String age=DonorAge.getText();
        String gender=(String) DonorGender.getSelectedItem();
        String height=DonorHeight.getText();
        String weight=DonorWeight.getText();
        String blood_group=(String) DonorBloodGr.getSelectedItem();
        String last_date_of_dn=LastDateOfDn.getText();
        
        if(id.length()>=3 &&id.length()<=5 && name.length()>5 && num.length()>0 && addr.length()>0 && age.length()>0 && 
                gender.length()>0 && height.length()>0&& weight.length()>0&& blood_group.length()>0&& 
                last_date_of_dn.length()>0) {
            
            sql="INSERT INTO donor_table(Id,Name,Phone_Number,Address,Age,Gender,Height,Weight,Blood_Group,Last_Date_Of_Donation)"
                    + "VALUES('"+id+"','"+name+"','"+num+"','"+addr+"','"+age+"','"+gender+"','"+height+"','"+weight+"',"
                    + "'"+blood_group+"','"+last_date_of_dn+"')";
            
            if(dbcon.InsertionCheckDonor(id).equals("found")) {
            
            dbcon.Insert(sql);
            JOptionPane.showMessageDialog(null, "Successfully Insrted");
             reset();
             close();
            StartForm s= new StartForm();
            s.setVisible(true);
            }
            
            else {
                
                JOptionPane.showMessageDialog(null, "Id Already Exist !");
            }
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Incomplete entries");
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondDonorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBt;
    private javax.swing.JTextField DonorAddr;
    private javax.swing.JTextField DonorAge;
    private javax.swing.JComboBox DonorBloodGr;
    private javax.swing.JComboBox DonorGender;
    private javax.swing.JTextField DonorHeight;
    private javax.swing.JTextField DonorName;
    private javax.swing.JTextField DonorPhnNum;
    private javax.swing.JTextField DonorWeight;
    private javax.swing.JTextField IdNo;
    private javax.swing.JTextField LastDateOfDn;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel bloodgroupLabel1;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastdonationLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
