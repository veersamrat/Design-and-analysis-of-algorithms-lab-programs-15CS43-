
import java.util.Scanner;

class staff{
    String staffID,name,salary,phone;

        staff(String staffID, String name, String salary, String phone) {
        this.staffID = staffID;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

}

class teaching extends staff {
    String publications,domain;

    public teaching(String publications, String domain, String staffID, String name, String salary, String phone) {
        super(staffID, name, salary, phone);
        this.publications = publications;
        this.domain = domain;
    }
}

class technical extends staff{
    String skills;

    public technical(String skills, String staffID, String name, String salary, String phone) {
        super(staffID, name, salary, phone);
        this.skills = skills;
    }
}

class contract extends staff{
    String period ;
    public contract(String period, String staffID, String name, String salary, String phone) {
        super(staffID, name, salary, phone);
        this.period = period;
    }

}


public class StaffDetails {


    public static void main(String[] args) {

      int choice ;
      String name,id,salary,phone;
      Scanner in = new Scanner(System.in);
      while(true){
        System.out.println("Enter the choice:");
        System.out.println("1-Teaching Staff\n2-Technical Staff\n3-contractors  \n4-Exit");
        switch(choice){
          case 1 :
          System.out.println("Enter the name ");

        }

      }


    }

}
