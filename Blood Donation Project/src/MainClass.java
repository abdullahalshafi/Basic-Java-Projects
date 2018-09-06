
public class MainClass {
    
        private String id;
        private String name;
        private String num;
        private String addr;
        private String age;
        private String gender;
        private String blood_group;
        private String num_of_bag;
       
        private String donor_id;
        private String donor_name;
        private String donor_num;
        private String donor_addr;
        private String donor_age;
        private String donor_gender;
        private String donor_height;
        private String donor_weight;
        private String donor_blood_group;
        private String last_date_of_dn;
      
        
        public MainClass() {}
        
        public MainClass(String donor_id, String donor_name,String donor_num,String donor_addr,
                String donor_age,String donor_gender,String donor_height,String donor_weight,String donor_blood_group,String last_date_of_dn) {
            
            this.donor_id=donor_id;
            this.donor_name=donor_name;
            this.donor_num=donor_num;
            this.donor_addr=donor_addr;
            this.donor_age=donor_age;
            this.donor_gender=donor_gender;
            this.donor_height=donor_height;
            this.donor_weight=donor_weight;
            this.donor_blood_group=donor_blood_group;
            this.last_date_of_dn=last_date_of_dn;
            
        }
        
        
        public MainClass(String id, String name,String num,String addr, 
                String age,String gender,String blood_group,String num_of_bag) {
            
            this.id=id;
            this.name=name;
            this.num=num;
            this.addr=addr;
            this.age=age;
            this.gender=gender;
            this.blood_group=blood_group;
            this.num_of_bag=num_of_bag;
        }
        
       
        
          
        public String get_donor_id() {
            return donor_id;
        }
      
        public String get_donor_name() {
            return donor_name;
        }
        
        public String get_donor_num() {
            return donor_num;
        }
        
        public String get_donor_addr() {
            return donor_addr;
        }
        
        public String get_donor_age() {
            return donor_age;
        }
        
        public String get_donor_gender() {
            return donor_gender;
        }
        
        public String get_donor_height() {
            
            return donor_height;
        }
        
        public String get_donor_weight() {
            
            return donor_weight;
        }
        
        public String get_donor_blood_group() {
            return donor_blood_group;
        }
        
        public String getlastdateofdn() {
            
            return last_date_of_dn;
        }
        
        
        public String getid() {
            return id;
        }
      
        public String getname() {
            return name;
        }
        
        public String getnum() {
            return num;
        }
        
        public String getaddr() {
            return addr;
        }
        
        public String getage() {
            return age;
        }
        
        public String getgender() {
            return gender;
        }
        
        public String getblood_group() {
            return blood_group;
        }
        
        public String getnum_of_bag() {
            
            return num_of_bag;
        }
}
