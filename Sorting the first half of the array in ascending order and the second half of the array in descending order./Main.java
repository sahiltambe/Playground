import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int i,j,k,temp; 
    for(i=0; i<=n-1; i++)
    {
      a[i] = in.nextInt();
    }
    
    for(i=0;i<n-1;i++)
	{
      if(n%2==0)
      {
		for(j=0; j<n/2 ;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
      }
      else
        for(j=0; j<(n-1)/2-1 ;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}

		for(j=n/2;j<n-1;j++)
		{
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
    for(i=0;i<=n-1;i++)
	{
		System.out.print(a[i] + " ");
	}
  }
}