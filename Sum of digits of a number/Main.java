import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
     	int n = in.nextInt();
      	int sum=0,rem;
      	while(n !=0)
        {
          rem = n%10;
          sum = sum + rem;
          n = n/10;
        }
      System.out.println(sum);
	}
}