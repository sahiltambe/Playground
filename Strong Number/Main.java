import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fact,rem, sum=0,num;
      num=n;
      while(n!=0)
      {
        rem = n%10;
        fact=1;
      	for(int i=1;i<=rem;i++)
      	{    
      		fact=fact*i;    
  		}
        sum = sum + fact;
        n = n/10;
      }
        if(sum == num)
        {
          System.out.println("Yes");
        }
      	else
        {
          System.out.println("No");
    	}
	}
}