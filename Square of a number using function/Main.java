import java.util.Scanner;
class Main
{
   public static int sqr(int n)
   {
     int res;
     res= n*n;
      return res;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int res = sqr(n);
     System.out.println(res);
	}
}