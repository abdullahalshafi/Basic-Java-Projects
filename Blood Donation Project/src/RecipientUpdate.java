import javax.swing.*;
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
public class RecipientUpdate extends javax.swing.JFrame {
    
    private DBCon dbcon=new DBCon();
    /**
     * Creates new form PatientForm
     */
    public RecipientUpdate() {
        initComponents();
        this.setResizable(false);
        //getContentPane().setBackground(new Color(102,0,0));
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgeTxt = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        PhnNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AddrTxt = new javax.swing.JTextField();
        bloodgroupLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NumBag = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IdNo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        UpdateBt = new javax.swing.JButton();
        Gender = new javax.swing.JTextField();
        Blood_gr = new javax.swing.JTextField();
        CancelBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Recipient");

        AgeTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameLabel.setText("Full Name");

        ageLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ageLabel.setText("Age");

        NameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NameText.setToolTipText("Must be greater than 6 letters");

        genderLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        genderLabel.setText("Gender");

        nameLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        nameLabel1.setText("Recipient Update Form");
        nameLabel1.setPreferredSize(new java.awt.Dimension(127, 29));

        contactLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contactLabel.setText("Contact Number");

        PhnNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Address");

        AddrTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        bloodgroupLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bloodgroupLabel.setText("Blood Group");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Number of Bag's");

        NumBag.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Recipient Id No.");

        IdNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        IdNo.setToolTipText("Id won't be changed");

        UpdateBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UpdateBt.setText("Update");
        UpdateBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtActionPerformed(evt);
            }
        });

        Gender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Blood_gr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameLabel)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(IdNo, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(NumBag, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(UpdateBt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bloodgroupLabel)
                                    .addComponent(ageLabel)
                                    .addComponent(contactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AgeTxt)
                                    .addComponent(genderLabel)
                                    .addComponent(PhnNum)
                                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CancelBt)
                                        .addComponent(Blood_gr, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(AddrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(47, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelBt)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddrTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumBag, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bloodgroupLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Blood_gr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(UpdateBt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        setSize(new java.awt.Dimension(613, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public void reset() {
        
        this.NameText.setText("");
        this.PhnNum.setText("");
        this.AddrTxt.setText("");
        this.AgeTxt.setText("");
        this.Gender.setText("");
        this.Blood_gr.setText("");
        this.NumBag.setText("");
    }
    
    private void UpdateBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtActionPerformed
        
        String sql;
        
        String idno=IdNo.getText();
        String name=NameText.getText();
        String phnNum=PhnNum.getText();
        String address=AddrTxt.getText();
        String age=AgeTxt.getText();
        String gender=Gender.getText();
        String blood_gr=Blood_gr.getText();
        String num_of_bag=NumBag.getText();
        
        if(IdNo.getText().length()>0 && name.length()>5&&phnNum.length()>0&&address.length()>0
         &&age.length()>0&&gender.length()>0&&blood_gr.length()>0&&num_of_bag.length()>0){
           int n=JOptionPane.showConfirmDialog(null, "Do You Really Want To Update","Update",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
           if(n==0) {
               

            sql="UPDATE recipient_table SET Name='"+name+"',Phone_Number='"+phnNum+"',Address='"+address+"',"
                    + "Age='"+age+"',Gender='"+gender+"',Blood_Group='"+blood_gr.toUpperCase()+"',Number_Of_Bags='"+num_of_bag+"'"
                    + "WHERE Id='"+idno+"'";
            
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
            close();
            StartForm s= new StartForm();
             s.setVisible(true);
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
            java.util.logging.Logger.getLogger(RecipientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecipientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField AddrTxt;
    public javax.swing.JTextField AgeTxt;
    public javax.swing.JTextField Blood_gr;
    private javax.swing.JButton CancelBt;
    public javax.swing.JTextField Gender;
    public javax.swing.JTextField IdNo;
    public javax.swing.JTextField NameText;
    public javax.swing.JTextField NumBag;
    public javax.swing.JTextField PhnNum;
    private javax.swing.JButton UpdateBt;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel bloodgroupLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    // End of variables declaration//GEN-END:variables
}
