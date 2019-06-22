import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = great(n1, n2);
      if(result>n3)
      {
        System.out.println(result);
      }
      else
      {
        System.out.println(n3);
      }
	}
  public static int great(int n1, int n2)
  {
    if(n1>n2)
    {
      return n1;
    }
    else
    {
      return n2;
    }
  }
}