import java.util.Scanner;
class dijk{

private int cost[][] = new int [10][10] ;
private int  n ;
private int dest[]=new int [10] ;
private int  v;
Scanner input= new Scanner(System.in);

 void Read()
	{
		int j , i ;
		System.out.println("Enter the value of n");
		n = input.nextInt();
		System.out.println("Enter the cost matrix of the Graph");
		for( i =1 ; i<=n ; i++)
			for( j = 1 ; j<=n ; j++)
				{
				cost[i][j]=input.nextInt();
				if(cost[i][j] == 0 )
					{
						cost[i][j]=999;

					}
				}

		System.out.println("Enter the starting vertex ");
		v = input.nextInt();


	}

void dijk()
	{
		int i ;
		int sel[] = new int [10];
		int min , count , u ;

		for(i = 1 ; i<=n ; i++)
			{
				dest[i] = cost[v][i];
				sel[i]=0;

      }
			sel[v]=1; count =1 ;


			while(count <= n)
			{
			min = 999; u = 1;
			for(i = 1 ; i<=n ; i++)
			{
				if(dest[i] < min && sel[i] == 0)
				{
					min = dest[i];
					u=i;
				}
			}

		    sel[u]=1;

			for( i =1 ; i <= n ; i++)
      //check from current vertx u to all other vertices connected
      //if the destance to the  vertex u + the next vertex i < the current destance to i
				if( (dest[u] + cost[u][i]) < dest[i] && sel[i] == 0)
				{

					dest[i] = dest[u] + cost [u][i] ; // if through u is less cost
                                            //use the path through u
				}
			count++;


    }//end of while
	}

void Display()
	{

	for(int i = 1 ; i<=n ; i++)
  if(i!=v) // don't orint the destence to the starting vertex itslef
		System.out.println(v +" -> "+i+" = "+dest[i]);
	}

}

class dijkstra {

	public static void main(String args[] )
	{

		dijk d = new dijk();
		d.Read();
		d.dijk();
		d.Display();
	}
}



/*
stps
1-read n
2-read the cost matrix
3-read the starting vertix
4-initilize dest[] to cost of all elements and sel[] to zero
5-find the smallest cost from dest[]
6-mark it as visited
7-check if it's not visited yet and path to it is less what is there in the cost[]


*/
