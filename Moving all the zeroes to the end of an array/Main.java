import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int i;
      
      for(i=0; i<=n-1; i++)
      {
        arr[i] = in.nextInt();
      }
      partition(n, arr);
      for(i=0; i<=n-1; i++)
      {
        System.out.print(arr[i] + " ");
      }
    }
  public static void partition(int n, int arr[])
  {
    int p[] = new int[n];
    int ps = 0;
    int o[] = new int[n];
    int os = 0;
    int i;
    
      for(i=0; i<n; i++)
      {
        if(arr[i] > 0)
        {
          p[ps] = arr[i];
          ps++;
        }
        else if(arr[i]<=0)
        {
          o[os] = arr[i];
          os++;
        }
      }
    int index = 0;
      for(i=0; i<=ps-1; i++)
      {
        arr[index] = p[i];
        index++;
      }
      for(i=0; i<=os-1; i++)
      {
        arr[index] = o[i];
        index++;
      }
  }
}