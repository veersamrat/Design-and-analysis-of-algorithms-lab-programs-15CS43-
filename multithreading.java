
import java.util.Random;
class square extends Thread {

  int x ;
  square(int x ){
    this.x = x ;

  }

  public void run(){
    System.out.println("Squre = "+x*x);
  }
}

class cube extends Thread{

  int x ;
  cube(int x ){
    this.x = x ;

  }

  public void run(){
    System.out.println("cube = "+x*x*x);

  }

}


class A extends Thread {

  Random randomobj = new Random();
public  void run(){

  try{

    for(int i = 0 ; i<3 ; i++)
    {

    int num = randomobj.nextInt(20);
    System.out.println("number = "+num);
    Thread squrethread = new square(num);
    squrethread.start();

    Thread cubethread  = new cube(num);
    cubethread.start();

    
      Thread.sleep(1000);

    System.out.println("\n\n");

  }

  }
  catch(InterruptedException e){
    System.out.println(e.getMessage());
  }

  }

}

class multithreading{
  public static void main(String args[]){
    Thread t1 = new A();
    t1.start();

  }
}
