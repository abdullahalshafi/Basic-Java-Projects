
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.*;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SabbirE.P
 */
public class StartForm extends javax.swing.JFrame {
    
    private DBCon dbcon=new DBCon(); 
    /**
     * Creates new form StartForm
     */
    public StartForm() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        DonorAddBt = new javax.swing.JButton();
        PatientAddBt = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        SearchBt = new javax.swing.JButton();
        Select = new javax.swing.JComboBox();
        menuBar = new javax.swing.JMenuBar();
        MenuAddDonor = new javax.swing.JMenu();
        MenuAddDonorBt = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        MenuAddPatient = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        ShowDonorDatabaseBt = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        ShowRecipientDatabaseBt = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        MenuExitBt = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        EditDonorMenuBt = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        EditRecipientMenuBt = new javax.swing.JMenuItem();
        DeleteDonorMenuBt = new javax.swing.JMenu();
        MenuDeleteDonorBt = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        DeleteRecipientMenuBt = new javax.swing.JMenuItem();
        AboutMenu = new javax.swing.JMenu();
        ReportBt = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        CheckUpdateBt = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        AboutMenuBt = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Start ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(626, 490));
        getContentPane().setLayout(null);

        DonorAddBt.setFont(new java.awt.Font("Nokia Sans S60", 0, 24)); // NOI18N
        DonorAddBt.setText("+Add Donor");
        DonorAddBt.setToolTipText("Click To Add Donor");
        DonorAddBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonorAddBtActionPerformed(evt);
            }
        });
        getContentPane().add(DonorAddBt);
        DonorAddBt.setBounds(40, 80, 161, 57);

        PatientAddBt.setFont(new java.awt.Font("Nokia Sans S60", 0, 24)); // NOI18N
        PatientAddBt.setText("+Add Recipient");
        PatientAddBt.setToolTipText("Click To Add Recipient");
        PatientAddBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientAddBtActionPerformed(evt);
            }
        });
        getContentPane().add(PatientAddBt);
        PatientAddBt.setBounds(380, 80, 197, 57);

        searchText.setFont(new java.awt.Font("Nokia Sans S60", 0, 18)); // NOI18N
        searchText.setToolTipText("Enter Id,Name or Blood Group to Search Donor,Recipient");
        getContentPane().add(searchText);
        searchText.setBounds(100, 250, 307, 58);

        SearchBt.setFont(new java.awt.Font("Nokia Sans S60", 0, 24)); // NOI18N
        SearchBt.setText("Search");
        SearchBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtActionPerformed(evt);
            }
        });
        getContentPane().add(SearchBt);
        SearchBt.setBounds(220, 360, 162, 43);

        Select.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        Select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Donor", "Recipient" }));
        Select.setToolTipText("Select Donor,Recipient to search");
        getContentPane().add(Select);
        Select.setBounds(420, 250, 115, 58);

        MenuAddDonor.setText("File");

        MenuAddDonorBt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuAddDonorBt.setText("+Add Donor");
        MenuAddDonorBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddDonorBtActionPerformed(evt);
            }
        });
        MenuAddDonor.add(MenuAddDonorBt);
        MenuAddDonor.add(jSeparator5);

        MenuAddPatient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        MenuAddPatient.setText("+Add Recipient");
        MenuAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddPatientActionPerformed(evt);
            }
        });
        MenuAddDonor.add(MenuAddPatient);
        MenuAddDonor.add(jSeparator6);

        ShowDonorDatabaseBt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        ShowDonorDatabaseBt.setText("Show Donor Database");
        ShowDonorDatabaseBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDonorDatabaseBtActionPerformed(evt);
            }
        });
        MenuAddDonor.add(ShowDonorDatabaseBt);
        MenuAddDonor.add(jSeparator7);

        ShowRecipientDatabaseBt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        ShowRecipientDatabaseBt.setText("Show Recipient Database ");
        ShowRecipientDatabaseBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRecipientDatabaseBtActionPerformed(evt);
            }
        });
        MenuAddDonor.add(ShowRecipientDatabaseBt);
        MenuAddDonor.add(jSeparator8);

        MenuExitBt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        MenuExitBt.setText("Exit");
        MenuExitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExitBtActionPerformed(evt);
            }
        });
        MenuAddDonor.add(MenuExitBt);

        menuBar.add(MenuAddDonor);

        jMenu4.setText("Edit");

        EditDonorMenuBt.setText("Edit Donor");
        EditDonorMenuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDonorMenuBtActionPerformed(evt);
            }
        });
        jMenu4.add(EditDonorMenuBt);
        jMenu4.add(jSeparator4);

        EditRecipientMenuBt.setText("Edit Recipient");
        EditRecipientMenuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRecipientMenuBtActionPerformed(evt);
            }
        });
        jMenu4.add(EditRecipientMenuBt);

        menuBar.add(jMenu4);

        DeleteDonorMenuBt.setText("Delete");

        MenuDeleteDonorBt.setText("Delete Donor");
        MenuDeleteDonorBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeleteDonorBtActionPerformed(evt);
            }
        });
        DeleteDonorMenuBt.add(MenuDeleteDonorBt);
        DeleteDonorMenuBt.add(jSeparator3);

        DeleteRecipientMenuBt.setText("Delete Recipient");
        DeleteRecipientMenuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRecipientMenuBtActionPerformed(evt);
            }
        });
        DeleteDonorMenuBt.add(DeleteRecipientMenuBt);

        menuBar.add(DeleteDonorMenuBt);

        AboutMenu.setText("Help");

        ReportBt.setText("Report Problem");
        ReportBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportBtActionPerformed(evt);
            }
        });
        AboutMenu.add(ReportBt);
        AboutMenu.add(jSeparator1);

        CheckUpdateBt.setText("Check for Updates");
        CheckUpdateBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckUpdateBtActionPerformed(evt);
            }
        });
        AboutMenu.add(CheckUpdateBt);
        AboutMenu.add(jSeparator2);

        AboutMenuBt.setText("About");
        AboutMenuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuBtActionPerformed(evt);
            }
        });
        AboutMenu.add(AboutMenuBt);

        menuBar.add(AboutMenu);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(643, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void close() {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    private void DonorAddBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonorAddBtActionPerformed
        close();
        
        FirstDonorForm d=new FirstDonorForm();
        d.setVisible(true);
        
        //SecondForm s = new SecondForm();
        //s.setVisible(true);
    }//GEN-LAST:event_DonorAddBtActionPerformed

    private void PatientAddBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientAddBtActionPerformed
        
        close();
        RecipientForm p=new RecipientForm();
        p.setVisible(true);
    }//GEN-LAST:event_PatientAddBtActionPerformed

    private void MenuAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddPatientActionPerformed
        
        RecipientForm p=new RecipientForm();
        p.setVisible(true);
        close();
    }//GEN-LAST:event_MenuAddPatientActionPerformed

    private void MenuAddDonorBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddDonorBtActionPerformed
        close();
        FirstDonorForm d=new FirstDonorForm();
        d.setVisible(true);
        
    }//GEN-LAST:event_MenuAddDonorBtActionPerformed

    private void DeleteRecipientMenuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRecipientMenuBtActionPerformed
        close();
        DeleteRecipient d=new DeleteRecipient();
        d.setVisible(true);
    }//GEN-LAST:event_DeleteRecipientMenuBtActionPerformed

    private void MenuDeleteDonorBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeleteDonorBtActionPerformed
        close();
        DeleteDonor d=new DeleteDonor() ;
        d.setVisible(true);
    }//GEN-LAST:event_MenuDeleteDonorBtActionPerformed

    private void MenuExitBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExitBtActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_MenuExitBtActionPerformed

    private void AboutMenuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuBtActionPerformed
        close();
        AboutUs a = new AboutUs();
        a.setVisible(true);
    }//GEN-LAST:event_AboutMenuBtActionPerformed

    private void SearchBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtActionPerformed
        close();
        String ItemSelect=(String)Select.getSelectedItem();
        String SearchTxt=searchText.getText();
        
        String  sql;
        
        if(ItemSelect.equals("Donor")) {
            
            DonorSearch d = new DonorSearch();
            
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
            
            else if(SearchTxt.length()<=2) {
                if(dbcon.CheckDonor(SearchTxt.toUpperCase()).equals("found")){
                
                    BloodGroupSearch t = new BloodGroupSearch();
                    t.DonorBloodGroup(SearchTxt);
                    t.setVisible(true);
                /*MainClass m=null;
                sql="SELECT *FROM donor_table WHERE blood_gr='"+SearchTxt+"'";
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
                d.BloodGr.setText(m.get_donor_blood_group());*/
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
            
            
            else {
                JOptionPane.showMessageDialog(null, "Please write Something !","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        else if(ItemSelect.equals("Recipient")) {
            RecepientSearch r=new RecepientSearch();
            
            if(SearchTxt.length()>=3 &&SearchTxt.length()<=5) {
                if(dbcon.CheckRecepient(SearchTxt).equals("found")) {
                
                r.setVisible(true);
                sql="SELECT *FROM recipient_table WHERE Id='"+SearchTxt+"'";
                MainClass m=null;
                m= dbcon.getrecipent(sql);
                r.IdNo.setText(m.getid());
                r.NameText.setText(m.getname());
                r.PhnNum.setText(m.getnum());
                r.AddrTxt.setText(m.getaddr());
                r.AgeTxt.setText(m.getage());
                r.Gender.setText(m.getgender());
                r.Blood_gr.setText(m.getblood_group());
                r.NumBag.setText(m.getnum_of_bag());
                }
                else {
                    JOptionPane.showMessageDialog(null, "Match Not Found !","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else if(SearchTxt.length()<=2) {
                if(dbcon.CheckRecepient(SearchTxt.toUpperCase()).equals("found")) {
                
                 BloodGroupSearch t = new BloodGroupSearch();
                 t.RecipientBloodGroup(SearchTxt);
                 t.setVisible(true);
                 
                /*r.setVisible(true);
                sql="SELECT *FROM recipient_table WHERE Blood_Group='"+SearchTxt+"'";
                MainClass m=null;
                m= dbcon.getrecipent(sql);
                r.IdNo.setText(m.getid());
                r.NameText.setText(m.getname());
                r.PhnNum.setText(m.getnum());
                r.AddrTxt.setText(m.getaddr());
                r.AgeTxt.setText(m.getage());
                r.Gender.setText(m.getgender());
                r.Blood_gr.setText(m.getblood_group());
                r.NumBag.setText(m.getnum_of_bag());*/
                }
                 else {
                    JOptionPane.showMessageDialog(null, "Match Not Found !","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            else if(SearchTxt.length()>5)  {
                
                if(dbcon.CheckRecepient(SearchTxt).equals("found")) {
                  r.setVisible(true);
                sql="SELECT *FROM recipient_table WHERE Name='"+SearchTxt.toLowerCase()+"'";
                MainClass m=null;
                m= dbcon.getrecipent(sql);
                r.IdNo.setText(m.getid());
                r.NameText.setText(m.getname());
                r.PhnNum.setText(m.getnum());
                r.AddrTxt.setText(m.getaddr());
                r.AgeTxt.setText(m.getage());
                r.Gender.setText(m.getgender());
                r.Blood_gr.setText(m.getblood_group());
                r.NumBag.setText(m.getnum_of_bag());
                }
                 else {
                    JOptionPane.showMessageDialog(null, "Match Not Found !","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else {
                JOptionPane.showMessageDialog(null, "Please write Something !","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
  
        
        else {
            JOptionPane.showMessageDialog(null, "Please Select one","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_SearchBtActionPerformed

    private void EditDonorMenuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDonorMenuBtActionPerformed
        close();
        EditDonor e = new EditDonor();
        e.setVisible(true);
    }//GEN-LAST:event_EditDonorMenuBtActionPerformed

    private void EditRecipientMenuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRecipientMenuBtActionPerformed
        close();
        EditRecipient e = new EditRecipient();
        e.setVisible(true);
    }//GEN-LAST:event_EditRecipientMenuBtActionPerformed

    private void ShowDonorDatabaseBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDonorDatabaseBtActionPerformed
        close();
        DonorDatabase d = new DonorDatabase();
        d.DonorDatabase();
        d.setVisible(true);
        
    }//GEN-LAST:event_ShowDonorDatabaseBtActionPerformed

    private void ShowRecipientDatabaseBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowRecipientDatabaseBtActionPerformed
        close();
       RecipientDatabase r = new RecipientDatabase();
        r.RecipientDatabase();
        r.setVisible(true);
    }//GEN-LAST:event_ShowRecipientDatabaseBtActionPerformed

    private void CheckUpdateBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckUpdateBtActionPerformed
        
        JOptionPane.showMessageDialog(null, "You are using the latest version");
    }//GEN-LAST:event_CheckUpdateBtActionPerformed

    private void ReportBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportBtActionPerformed
        close();
        Report r=new Report();
        r.setVisible(true);
    }//GEN-LAST:event_ReportBtActionPerformed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/ //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutMenu;
    private javax.swing.JMenuItem AboutMenuBt;
    private javax.swing.JMenuItem CheckUpdateBt;
    private javax.swing.JMenu DeleteDonorMenuBt;
    private javax.swing.JMenuItem DeleteRecipientMenuBt;
    private javax.swing.JButton DonorAddBt;
    private javax.swing.JMenuItem EditDonorMenuBt;
    private javax.swing.JMenuItem EditRecipientMenuBt;
    private javax.swing.JMenu MenuAddDonor;
    private javax.swing.JMenuItem MenuAddDonorBt;
    private javax.swing.JMenuItem MenuAddPatient;
    private javax.swing.JMenuItem MenuDeleteDonorBt;
    private javax.swing.JMenuItem MenuExitBt;
    private javax.swing.JButton PatientAddBt;
    private javax.swing.JMenuItem ReportBt;
    private javax.swing.JButton SearchBt;
    private javax.swing.JComboBox Select;
    private javax.swing.JMenuItem ShowDonorDatabaseBt;
    private javax.swing.JMenuItem ShowRecipientDatabaseBt;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}
