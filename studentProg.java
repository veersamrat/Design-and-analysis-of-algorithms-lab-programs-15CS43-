/*


Create a Java class called Studentwith the following details as variables within it.
(i) USN
(ii) Name
(iii) Branch
(iv) Phone
Write a Java program to create nStudent objects and print the USN, Name, Branch, and
Phoneof these objects with suitable headings.

*/
import java.util.Scanner;
class student {
  String usn,name,branch,phone;
}
class studentProg{
  public static void main(String args[])
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of stduents");
      int n = input.nextInt();
      student stud[] = new student[n] ;
      for(int i = 0 ; i<n ; i++)
        {
          stud[i]=new student();
          System.out.println("Enter the name of the student");
          stud[i].name = input.next();
          System.out.println("Enter the USN of the student ");
          stud[i].usn = input.next();
          System.out.println("Enter the branch ");
          stud[i].branch = input.next();
          System.out.println("Enter the phone number of the student ");
          stud[i].phone = input.next();
        }
        //printing the students details
        for(int i = 0 ; i<n ; i++)
        {
          System.out.println("Name "+stud[i].name+"\nUSN "+stud[i].usn+"\nBranch "+stud[i].branch+"\nPhone number "+stud[i].phone);
        }
  }
}
