import java.util.*;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int arr[] = new int[n];
      int i;
      for(i=0; i<=n-1; i++)
      {
        arr[i]=in.nextInt();
      }
      int k=n;
      while(k != 0)
      {
        int present = 0;
        for(i=0; i<=n-1; i++)
        {
          if(k == arr[i])
          {
            present = 1;
            break;
          }
        }
        if(present == 0)
        {
          System.out.println(k);
          break;
        }
       k--;
      }
    }
}