import java.util.Scanner;
import java.util.StringTokenizer;


 class customerDetails {

  private String Date;
  private String Name;

   void Read(){

       Scanner input = new Scanner(System.in);

       System.out.println("Enter the name and date ");
       Name = input.next();
       Date = input.next();
   }

   void Display()
    {

    StringTokenizer st = new StringTokenizer(Date,"/"); //variable data and the delimiter /
    System.out.println(Name+", "+st.nextToken()+", "+st.nextToken()+", "+st.nextToken());

    }

}

class stringTokenizer {
  public static void main(String args[]){
    customerDetails c = new customerDetails();
    c.Read();
    c.Display();
  }
}
