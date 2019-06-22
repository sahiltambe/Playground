import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int i, i_1, i_2;
      for(i = 0; i <= (n-1); i++)
      {
        arr[i] = in.nextInt();
      }
      subset(n, arr);
    }
  public static void subset(int n, int arr[])
  {
      for(int i_1=0; i_1 <= (n-2); i_1++)
      {
        
        for(int i_2 = (i_1+1); i_2 <= (n-1); i_2++)
        { 
          for(int i_3 = (i_2+1); i_3<=(n-1); i_3++)
          {
            System.out.print("(" + arr[i_1] + "," + " " + arr[i_2] + ","+ " " + arr[i_3] + ")" + " ");
          }
        }
        System.out.print("\n");
      }
  }
}