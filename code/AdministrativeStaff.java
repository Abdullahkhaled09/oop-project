
public class AdministrativeStaff extends Person {
        private int StaffID;
        private String role;
        public AdministrativeStaff(int staffID, String role) {
            super();
            this.StaffID = staffID;
           
            this.role = role;
        }
        public int getStaffID() {
            return StaffID;
        }
        public void setStaffID(int staffID) {
            StaffID = staffID;
        }
       
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        
    }