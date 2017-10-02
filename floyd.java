
import java.util.Scanner;
class f{
	int n ;

	int c[][] ;

	void Read(){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the value of N ");
	n = input.nextInt();
	c = new int[n][n];
	System.out.println("Enter the cost adjacency Matrix ");
	for(int i = 0 ; i < n ; i++)
		for(int j = 0 ; j < n ; j++)
			c[i][j]=input.nextInt();

	}

void findShortest(){
	for(int k = 0 ; k <n ; k++)
		for(int i = 0 ; i <n ; i++)
			for(int j = 0 ; j <n ; j++)
				c[i][j]=Math.min(c[i][j],c[i][k]+c[k][j]);

}

void Display(){
	for(int i = 0 ; i <n ; i++)
	{
	System.out.print("\n");
		for(int j = 0 ; j < n ; j++)
			System.out.print(c[i][j]+" ");

	}
	System.out.print("\n");

}
}


class floyd{

	public static void main(String args[]){

		f fobj=new f();
		fobj.Read();
		fobj.findShortest();
		fobj.Display();

	}

}
