import java.util.Scanner ;
class knap{
    int max(int a , int b ){
        return ((a>b) ? a : b );
    }

    public void solve(int[] wt, int[] val, int capacity, int n)
        {
            int k[][] = new int[n+1][capacity+1];
            int i , j;
            //to fill row 0 with 0
            for(i=0 ;i <= capacity ; i++)
            {
                k[0][i]=0;
            }
            //to fill  column 0 with   0
             for(i=0 ; i <= n ; i++)
            {
                k[i][0]=0;
            }

            for(i=1 ; i<= n ; i++)
                for(j= 1 ; j <= capacity ; j++)
                {
                  if(wt[i] <= j)  {
				                k[i][j] = max(k[i-1][j], (val[i] + k[i-1][j - wt[i]]));
			                     }
                  else {
				                k[i][j] = k[i-1][j];
			                   }
                }
                System.out.println("max value is "+k[n][capacity]);


               int row = n ; // n is the number of elemnts
               int column = capacity;
               System.out.println("Elements chosen:");

               while(row>0 & column>0)
               {
                 if(k[row][column] != k[row-1][column] )
                 {
                   System.out.println(row);
                   column = column-wt[row];
                   row--;
                 }
                 else
                   row--;
              }
            }
}


 class knapsackDynamically {
public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        knap ks  = new knap();
        System.out.println("Enter number of elements ");
        int n = input.nextInt();
        int[] wt = new int[n + 1]; // n+1 to have indexes from 1 to 3 , zero will be neglected
        int[] val = new int[n + 1];
        System.out.println("Enter weight for "+ n +" elements");
        for (int i = 1; i <= n; i++)
            wt[i] = input.nextInt();
        System.out.println("Enter value for "+ n +" elements");
        for (int i = 1; i <= n; i++)
            val[i] = input.nextInt();
        System.out.println("Enter knapsack capacity ");
        int capacity = input.nextInt();
        ks.solve(wt, val, capacity, n);

	}
}
