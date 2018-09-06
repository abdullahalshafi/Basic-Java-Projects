import java.sql.*;
import javax.swing.JOptionPane;

public class DBCon {
        
        private ResultSet rs;
        private Connection con;
        private Statement st;
       private String url="jdbc:sqlite:C:\\Users\\SAFKAT\\Documents\\NetBeansProjects\\Blood Donation Project\\Blood Donation Project.sqlite";
       //private String pass="gamingismylife";
        //private String username="root";
        private String driver="org.sqlite.JDBC";
        
        
       public DBCon() {
           
           try
           {
            
            Class.forName(driver);
           con=DriverManager.getConnection(url);
           st=con.createStatement();
           
           }
           catch(Exception ex) {
               JOptionPane.showMessageDialog(null, ex.toString());
           }
       }
       
       public String Insert(String sql) {
           try{
               
               st.execute(sql);
           }
           catch(Exception e) {
               e.printStackTrace();
           }
           return "Inserted!";
           
       }
       
        public String update(String sql){
        try{
           st.executeUpdate(sql);
        }
        catch(Exception e){e.printStackTrace();}
        return "Updated!";
    }
       
       
       
        public String delete(String sql) {
           
           try{
               st.executeUpdate(sql);
               
           }
           
           catch(Exception e) {
               e.printStackTrace();
           }
           
           return "Deleted";
           
       }
       
       //Insertion Check For Recepient
       
       public String InsertionCheckRecepirnt(String idno) {
     
           String sql="SELECT Id FROM recipient_table WHERE Id='"+idno+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "not found";
           }
           
           
           return "found";
       
       }
       
       //Insertion Check For Donor
       
       public String InsertionCheckDonor(String id) {
           
           String sql="SELECT Id FROM donor_table WHERE Id='"+id+"'";
           String idcheck=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               idcheck=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(idcheck!=null && !idcheck.isEmpty()) {
               return "not found";
           }
           
           
           return "found";
       }
        
       public MainClass getdonor(String sql)  {
       
         String id=null;
         String name=null;;
         String num=null;;
         String addr=null;;
         String age=null;;
         String gender=null;;
         String height=null;
         String weight=null;
         String blood_group=null;;
         String last_date_of_dn=null;;
         
         MainClass m=null;
             
         try{
             rs=st.executeQuery(sql);
             
             while(rs.next()) {
                 id=rs.getString("Id");
                 name=rs.getString("Name");
                num=rs.getString("Phone_Number");
                 addr=rs.getString("Address");
                 age=rs.getString("Age");
                 gender=rs.getString("Gender");
                 height=rs.getString("Height");
                 weight=rs.getString("Weight");
                 blood_group=rs.getString("Blood_Group");
                 last_date_of_dn=rs.getString("Last_Date_Of_Donation");
                 
             }
             m=new MainClass(id,name,num,addr,age,gender,height,weight,blood_group,last_date_of_dn);
             
         }
         catch(Exception e) {
             JOptionPane.showMessageDialog(null, e.toString());
         }
         
         return m;
       }   
       
    //DonorCheck
       
       public String CheckRecipientDelte(String text) {
           String check=text;
           
           if(check.length()>=3 && check.length()<=5) {
           String sql="SELECT Id FROM recipient_table WHERE Id='"+check+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           else if(check.length()>5) {
           String sql="SELECT Id FROM recipient_table WHERE Name='"+check.toLowerCase()+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           return"";
           
       }
       
       public String CheckDonorDelete(String text) {
           
           String check=text;
           
           if(check.length()>=3 && check.length()<=5) {
           String sql="SELECT Id FROM donor_table WHERE Id='"+check+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           else if(check.length()>5) {
           String sql="SELECT Id FROM donor_table WHERE Name='"+check.toLowerCase()+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           return"";
       }
       
       public String CheckDonor(String SearchTxt) {
           
            String check=SearchTxt;
           
           if(check.length()>=3 && check.length()<=5) {
           String sql="SELECT Id FROM donor_table WHERE Id='"+check+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           else if(check.length()>5) {
           String sql="SELECT Id FROM donor_table WHERE Name='"+check.toLowerCase()+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           else if(check.length()<=2) {
           
           String sql="SELECT Id FROM donor_table WHERE Blood_Group='"+check+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           return "not found";
           
       }
       
       public String CheckRecepient(String SearchTxt) {
           
           String check=SearchTxt;
           
           if(check.length()>=3 && check.length()<=5) {
           String sql="SELECT Id FROM recipient_table WHERE Id='"+check+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           else if(check.length()>5) {
           String sql="SELECT Id FROM recipient_table WHERE Name='"+check.toLowerCase()+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           else if(check.length()<=2) {
           
           String sql="SELECT Id FROM recipient_table WHERE Blood_Group='"+check+"'";
           String id=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               id=rs.getString("Id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(id!=null && !id.isEmpty()) {
               return "found";
           }
           
         
           return "not found";
           }
           
           return "not found";
       }
       
       public MainClass getrecipent(String sql) {
         String id=null;
         String name=null;;
         String num=null;;
         String addr=null;;
         String age=null;;
         String gender=null;;
         String blood_group=null;;
         String num_of_bag=null;;
         
         MainClass m=null;
         
         try{
             rs=st.executeQuery(sql);
             
             while(rs.next()) {
                 id=rs.getString("Id");
                 name=rs.getString("Name");
                num=rs.getString("Phone_Number");
                 addr=rs.getString("Address");
                 age=rs.getString("Age");
                 gender=rs.getString("Gender");
                 blood_group=rs.getString("Blood_Group");
                 num_of_bag=rs.getString("Number_Of_Bags");
       
             }
             m=new MainClass(id,name,num,addr,age,gender,blood_group,num_of_bag);
             
         }
         
         catch(Exception ex) {
             JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         return m;
           
       }
}
