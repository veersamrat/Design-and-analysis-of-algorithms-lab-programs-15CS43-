import java.util.Scanner;
class stack {


  int n = 5;
 int top=-1; ;
 int stack[] = new int[n];

  void push(int number){
      if(top == n-1 )
        System.out.println("\n Stack overflow\n");
      else
      {
        stack[++top]=number ;
      }
  }

  void pop()
  {
    if(top<0)
      System.out.println("Stack UnderFlow");
    else{
      int num = stack[top];
      top--;
       System.out.println("element "+num+" is successfully removed") ;
    }
  }

  void display(){
    System.out.println("\n=================");
    for(int i = 0 ; i<= top ; i++){
      System.out.println(stack[i]);
    }
    System.out.println("\n=================");
  }

  public static void main(String args[]){
  Scanner input = new Scanner(System.in);
    stack stack_obj= new stack();
    int choice ;
    while(true){
      System.out.println("1-push \n2-pop \n3-Display \n4-exit");
      choice = input.nextInt();
      switch(choice){
        case 1 : System.out.println("Enter the number >>"); int num = input.nextInt();
                 stack_obj.push(num);
                 break;
        case 2 : stack_obj.pop();
                 break;
        case 3 : stack_obj.display();
                 break;
        case 4 : System.exit(0);
      }
    }

  }

}
