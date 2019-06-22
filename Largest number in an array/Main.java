import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int max=arr[0],i;
      for(i=0; i<=n-1; i++)
      {
        arr[i]= in.nextInt();
      }
      
      for(i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
      System.out.println(max);
    }
}