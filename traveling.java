
import java.util.Scanner;

    class travel {

    int tspdp(int c[][], int tour[], int start, int n) {
        int i, j, temp[] = new int[100], mintour[] = new int[100];


        int mincost, ccost, k;
        if (start == n - 2) {
            return c[tour[n - 2]][tour[n - 1]] + c[tour[n - 1]][0];
        }

        //============================================

        mincost = 999;
        for (i = start + 1; i < n; i++) {

            for (j = 0; j < n; j++) {
                temp[j] = tour[j];
            }

          //see the visualgo tracing

            temp[start + 1] = tour[i];
            temp[i] = tour[start + 1];

            if (c[tour[start]][tour[i]] + (ccost = tspdp(c, temp, start + 1, n)) < mincost) {
                mincost = c[tour[start]][tour[i]] + ccost;
                for (k = 0; k < n; k++) {
                    mintour[k] = temp[k];
                }
            }
        }
        //===========================================


        for (i = 0; i < n; i++) {
            tour[i] = mintour[i];
        }
        return mincost;
      }


    //===================================

    public static void main(String args[]) {
        travel t = new travel();
        int c[][] = new int[100][100];
        int tour[] = new int[100];
        int n;
        int i, j;
        int cost;
        System.out.println("Travelling Salesman Problem Using Dynamic Programming\n");


        System.out.println("Enter number of cities to traverse : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Enter cost matrix\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = in.nextInt();
                if (c[i][j] == 0) {
                    c[i][j] = 999;
                }
            }
        }


        for (i = 0; i < n; i++) {
            tour[i] = i;
        }


        cost = t.tspdp(c, tour, 0, n);
        System.out.println("Minimum Cost:" + cost);
        System.out.println("Tour:\n");
        for (i = 0; i < n; i++) {
            System.out.println(tour[i] + 1);
        }
        System.out.println("1\n");
    }
}


/*
  -Read n
  -Read cost
  -initilize tour[]
  -cost =  tspdp(cost,tour,0,n);
  -print cost
  -print tour

  ========



*/
