import java.util.*;
class Main
{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int gcdres=1;
      int result = gcd(n1, n2);
      for(int i=1; i<=result && i<=n3; i++)
      {
      if(n3%i==0 && result%i==0)
      {
        gcdres=i;
      }
      }
      System.out.println(gcdres);
	}
  public static int gcd(int n1, int n2)
  {
    int gcdd=1;
    for(int i=1; i<=n1 && i<= n2; i++)
    {
    	if(n1%i==0 && n2%i==0)
    	{
     	 gcdd=i;
    	}
  	}
    return gcdd;
	}
}