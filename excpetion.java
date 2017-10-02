import java.util.Scanner ;
class exception {



  public static void main(String args[]){
    int a , b ;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the values of A and B ");
    a = in.nextInt();
    b = in.nextInt();

    try{
      int result = a/b;
      System.out.println("Result = "+result);
    }
    catch(ArithmeticException e ){
      System.out.println(e);


    }

  }
}
