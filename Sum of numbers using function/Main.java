import java.util.Scanner;
class Main
{
   public static int sqr(int n)
   {
     int i,sum=0;
     for(i=1; i<=n; i++)
     {
       sum = sum + i;    
     }
      return sum;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int sum = sqr(n);
     System.out.println(sum);
	}
}