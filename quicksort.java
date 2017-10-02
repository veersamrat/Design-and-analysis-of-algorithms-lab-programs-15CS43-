
import java.util.Scanner;
import java.util.Random;

class quick {

  int array[] ;

  void sort(int input_array[],int n)
    {
        array = input_array ;
        int len = array.length ;
        long stime = System.currentTimeMillis();
        quicksort(0, len-1);
        long etime = System.currentTimeMillis();
        int time = etime-stime;
        System.out.println("time required for sorting in milli seconds = "+time);


        /*
      len-1, one is subracted because we need the last index of the array
      the method array.lenght always returns the number elements not the last index
      if we have array of 10 ,we need the  last index which is 9
        */
    }

    void quicksort(int low , int high)
    {
        int pivot = array[(high+low)/2];
       int i = low;
       int j = high;

       while(i <= j )
       {
           while(array[i] < pivot)
           {
               i++;
           }

           while (array[j] > pivot)
           {
               j--;
           }

           if(i <= j )
           {
               swap(i , j); //passing the indexes
               j--;
               i++;
           }
       }//end of while

       if(low < j )
               quicksort(low,j);
      if(i < high)
               quicksort(i,high);

    }

    private void swap(int i , int j ) //receiveing indexes but swaping numbers of the array
            {
                int temp ;
                temp = array[i];
                array[i]= array[j];
                array[j]=temp;
            }
    public void display() {
            for (int i = 0; i <= array.length - 1; i++) {
                  System.out.println(array[i]);

          }
}

}


class quicksort{

  public static void main(String args[]){

    Random r = new Random();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of Random number to be Generated and then sorted");
    int n = in.nextInt();
    int array[] = new int[n];

    for(int i=0 ; i<n ; i++)
    {
      array[i] = r.nextInt(100);
    }

    quick q = new quick();
    q.sort(array,n);
    q.display();
    //uncommunt the display function to see the elements

  }
}
