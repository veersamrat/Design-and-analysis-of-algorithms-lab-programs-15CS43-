import java.util.Scanner;
import java.util.Random;
class msort11
{
	private

	int n ;
	int a[] ;

	public
	void read(){

		Random r = new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		n=in.nextInt();
		a = new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(100);

			partition(0,n-1);

	}

	void partition(int l,int h)
	{   int mid;
		if(l<h)
		{
			mid=(l+h)/2;
			partition(l,mid);
			partition(mid+1,h);
			merge(l,mid,h);
		}
	}

	void merge(int l,int m,int h)
	{
		int i=l,j=m+1,k=l;
		int b[]=new int[n];

		while(i<=m &&j<=h)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				k++;
				i++;
			}
			else
			{
				b[k]=a[j];
				k++;
				j++;
			}
		}

		while(i<=m)
		{
			b[k]=a[i];
			k++;
			i++;
		}

		while(j<=h)
		{
			b[k]=a[j];
			k++;
			j++;
		}

		for( i=l;i<=h;i++) // mistake -> start from low to high 
			a[i]=b[i];

	}

void display()
{
	for(int i=0 ; i<n ; i++)
		System.out.println(a[i]);
}

}


class mergeSort
{
	public static void main(String args[])
	{
		msort11 m=new msort11();
		m.read();
		m.display();

	}
}
