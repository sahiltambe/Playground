import java.util.*;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int temp[] = new int[n];
      int i,j;
      for(i=0; i<=n-1; i++)
      {
        arr[i] = in.nextInt();
      }
      for(i=0; i<n; i++)
      {
        for(j=0; j<n; j++)
        {
          if( arr[j] > arr[i] )
          {
            int s = arr[i];
            arr[i] = arr[j];
            arr[j] = s;
          }
        }
      }
      int k = in.nextInt();
      System.out.println(arr[n-k]);
    }   
}