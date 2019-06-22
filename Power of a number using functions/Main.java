import java.util.Scanner;
class Main
{
 public static int pow(int n, int p)
 {
   int result=1;
   for(int i=1; i<=p; i++)
   {
    result = result * n;
   }
   return result;
 }
 public static void main(String args[])
 {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
   	int p = in.nextInt();
    int res;
    res = pow(n, p);
    System.out.println(res);
  }
}