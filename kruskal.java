
import java.util.Scanner;

class Edge {

    int v1, v2, wt; // wt is the weight of the edge
}

class kruskals {

    public static void main(String args[]) {
        int i, j, mincost = 0;
        Scanner br = new Scanner(System.in);
        System.out.println(" Enter no.of vertices:");
        int v = br.nextInt();
        int visited[] = new int[v + 1];
        System.out.println(" Enter no.of edges:");
        int e = br.nextInt();
        Edge ed[] = new Edge[e + 1]; //e+1 we want to count starting from 1 not 0 hence one more should be added
        for (i = 1; i <= e; i++) {
            ed[i] = new Edge();
            System.out.println(" Enter the vertices and the weight of edge " + (i) + ":");
            ed[i].v1 = br.nextInt();
            ed[i].v2 = br.nextInt();
            ed[i].wt = br.nextInt();
        }
        for (i = 1; i <= e; i++) // sorting the edges in ascending order
        {
            for (j = 1 ; j <= e - i -1; j++) {
                if (ed[j].wt > ed[j + 1].wt) {
                    Edge t = new Edge();
                    t = ed[j];
                    ed[j] = ed[j + 1];
                    ed[j + 1] = t;
                }
            }
        }

        for (i = 1; i <= v; i++) {
            visited[i] = 0;
        }

        System.out.println("MINIMUM SPANNING TREE :");
        for (i = 1; i <= e; i++) {
            if (i > v) {
                break;
            }
            else if (visited[ed[i].v1] == 0 || visited[ed[i].v2] == 0) {
                System.out.println(ed[i].v1 + " --> " + ed[i].v2);
                visited[ed[i].v1] =  1;
                visited[ed[i].v2] = 1 ;
                mincost += ed[i].wt;
            }
        }
        System.out.println("MINIMUM COST = " + mincost);
    }
}
