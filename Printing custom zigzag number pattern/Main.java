import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j,k,c=2;
 	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		System.out.print(c++);
		for(j=1;j<=n-1;j++)
		{
			System.out.print(i);
		}
		if(i%2!=0)
		System.out.print(c++);
		System.out.print("\n");
	}
    }
}