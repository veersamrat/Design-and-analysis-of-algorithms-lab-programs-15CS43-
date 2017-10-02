import java.util.Scanner;

public class subset {

    int w[] = new int[20], x[] = new int[20], sum;

    void subset1(int currentsum, int current, int elementsSum) {
        int i;
        x[current] = 1; //First element

        if ((currentsum + w[current]) == sum) { //solution found
            for (i = 0; i <= current; i++) {
                if (x[i] == 1) {
                    System.out.print(w[i]+" ");

                }
            }
              System.out.println("\n");
        }
        //left side of the tree
        else if (currentsum + w[current] + w[current + 1] <= sum) {
            subset1(currentsum + w[current] , current + 1 , elementsSum - w[current]);
        }
        //crrentsum is requrire for every recursive call we shall chceccurrent
        //after excluding a number if the elementsSum is >  the requried sum
        //sd

        //right side of the tree

        if ((currentsum+elementsSum-w[current] >= sum)&&(currentsum + w[current + 1] <= sum)) {
            x[current] = 0;
            subset1(currentsum, current + 1, elementsSum - w[current]);
        }
    }

    public static void main(String args[]) {
        int i, n, elementsSum = 0;
        subset s = new subset();

        System.out.println("Enter the no. of elements: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("Enter the elements in increasing order:\n");
        for (i = 1; i <= n; i++) {
            s.w[i] = in.nextInt();
        }

        System.out.println("Enter the required sum(d): ");
        s.sum = in.nextInt();
        for (i = 1; i <= n; i++) {
            elementsSum += s.w[i];
        }

        if (elementsSum < s.sum || s.w[1] > s.sum) {
            System.out.println("Subset not possible!!\n");
        } else {
            System.out.println("The possible subsets are:\n");
            s.subset1(0, 1, elementsSum);
        }
    }
}
