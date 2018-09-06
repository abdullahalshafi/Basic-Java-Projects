import java.sql.*;
import javax.swing.JOptionPane;

public class DBCon {
        
        private ResultSet rs;
        private Connection con;
        private Statement st;
       private String url="jdbc:sqlite:C:\\Users\\AbdullahAl\\Documents\\student manager\\student management.sqlite";
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
        
        public MainClass getprofile(String sql) {
            String name=null;
            String id=null;
            String cgpa=null;
            String dept=null;
            
            MainClass m = null;
            
            try{
                rs=st.executeQuery(sql);
                while(rs.next()) {
                    name=rs.getString("name");
                    id=rs.getString("id");
                    cgpa=rs.getString("cgpa");
                    dept=rs.getString("dept");
                }
                m = new MainClass(name,id,dept,cgpa);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            return m;
        }
        
        public MainClass getupdate(String sql) {
            String name=null;
            String id=null;
            String cgpa=null;
            String dept=null;
            String pass=null;
            
            MainClass m = null;
            
            try{
                rs=st.executeQuery(sql);
                while(rs.next()) {
                    name=rs.getString("name");
                    id=rs.getString("id");
                    cgpa=rs.getString("cgpa");
                    dept=rs.getString("dept");
                    pass=rs.getString("pass");
                }
                m = new MainClass(name,id,dept,cgpa,pass);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            return m;
        }
        
        
        
        public String UserCheck(String user) {
     
           String sql="SELECT id FROM stu_manager WHERE id='"+user+"'";
           String user_name=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               user_name=rs.getString("id");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(user_name!=null && !user_name.isEmpty()) {
               return "found";
           }
           
           
           return "not found";
       
    }
        
       
       public String PassCheck(String pass) {
     
           String sql="SELECT pass FROM stu_manager WHERE pass='"+pass+"'";
           String user_pass=null;
           try{
               rs=st.executeQuery(sql);
               
               while(rs.next()) {
               user_pass=rs.getString("pass");
               
               
           }
               
           }
           catch(Exception ex) {
             //ex.printStackTrace();
               JOptionPane.showMessageDialog(null, ex.toString());
             
         }
         
           if(user_pass!=null && !user_pass.isEmpty()) {
               return "found";
           }
           
           
           return "not found";
       
    }
       
       
       
       
}
