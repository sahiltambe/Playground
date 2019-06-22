import java.util.*;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int k= in.nextInt();
      int i,j;
      for(i=0; i<=n-1; i++)
      {
        arr[i] = in.nextInt();
      }
      int start =1;
      for(i=0; i<=n-1; i++)
      {
        int count=0;
        for(j=0; j<=n-1; j++)
        {
          if(start == arr[j])
          {
            count++;
          }
        }
        if(start<=k)
        {
        System.out.println(start + " " + count);
        }
        start++;
      }
    }
}