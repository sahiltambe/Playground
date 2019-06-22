import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int match=1,i, j=-1;
      for(i=0; i<=n-1; i++)
      {
        arr[i]= in.nextInt();
      }
      int src1 = in.nextInt();
      int src2 = in.nextInt();
      
      for(i=0; i<=n-1; i++)
      {
        match=1;
        if(src1==arr[i])
        {
          match=0;
          break;
        }
      }
      if(match==0)
      {
      System.out.println(i);
      }
      else
      {
        System.out.println(j);
      }
      for(i=0; i<=n-1; i++)
      {
        match=1;
        if(src2==arr[i])
        {
          match=0;
          break;
        }
      }
      if(match==0)
      {
      System.out.println(i);
      }
      else
      {
        System.out.println(j);
      }
    }
}