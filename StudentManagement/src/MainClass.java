
public class MainClass {
    
    private String name;
    private String id;
    private String dept;
    private String cgpa;
    private String pass;
    
    public MainClass(String name,String id,String dept, String cgpa) {
        this.name=name;
        this.id=id;
        this.dept=dept;
        this.cgpa=cgpa;
    }
    
     public MainClass(String name,String id,String dept, String cgpa,String pass) {
        this.name=name;
        this.id=id;
        this.dept=dept;
        this.cgpa=cgpa;
        this.pass=pass;
    }
    
     public String getpass()
     {
         return pass;
     }     
    public String getname() {
        return name;
    }
    
    public String getid() {
        return id;
    }
    
    public String getdept() {
        return dept;
    }
    
    public String getcgpa() {
        return cgpa;
    }
    
}
