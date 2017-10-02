
import java.util.Scanner ;

class knap{
	private int n,m ;
	private int p[] = new int[10];
	private int w[] = new int[10];
	private int s[] = new int[10] ;
	Scanner input = new Scanner(System.in);

	void Read()
	{

	System.out.println("Enter the number of elements and size of the knapsack");
	n = input.nextInt();
	m = input.nextInt();
	System.out.println("Enter the profit values ");
	for(int i = 0 ; i<n ; i++)
		p[i]=input.nextInt();
	System.out.println("Enter the weight values ");
	for(int i = 0 ; i<n ; i++)
		w[i]=input.nextInt();
	}

	void sort(int n)
	{

		double x , y ;
		int temp ;
		for(int i = 0 ; i < n ; i++)
			for(int j = 0 ; j < n-i-1 ; j++){
				x  = (double)(p[j]/w[j]);
				y  = (double)(p[j+1]/w[j+1]); //mistake double division
			if(x <= y)
				{
				temp = p[j];
				p[j]=p[j+1];
				p[j+1]=temp;

				temp = w[j];
				w[j]=w[j+1];
				w[j+1] = temp;
			}

		}
	}


	void KS( )
	{
		sort(n);

		for(int i=0 ; i < n ; i++)
			s[i]=0;

		int knapsackSize = m ;
		for(int i=0 ; i < n ; i++)
		{
			if(w[i] <= knapsackSize)
				{
				s[i]=1;
				knapsackSize = knapsackSize-w[i] ;
				}
		}
	}

	void Display(){
		System.out.println("item no\tprofit\tweight\tp/w\tsolution vector ");
		for(int i = 0 ; i<n ; i++)
			System.out.println(i+"\t"+p[i]+"\t"+w[i]+"\t"+(p[i]/w[i])+"\t"+s[i]);
	}
}

class knapsackGreedy{
public static void main(String args[]){

	knap knapsack = new knap();
	knapsack.Read();
	knapsack.KS();
	knapsack.Display();
	}
}
