import java.util.*;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int rev[] = new int[n];
      int i;
      for(i=0; i<=n-1; i++)
      {
        arr[i] = in.nextInt();
      }
      for(i=0; i<=n-1; i++)
      {
        if(arr[i] != arr[n-1-i])
        {
          System.out.println("No");
          break;
        }
      }
      if(i == n)
      {
        System.out.println("Yes");
      }
    }
}