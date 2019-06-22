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
      int sum = in.nextInt();
      subset(n, arr, sum);
    }
  public static void subset(int n, int arr[], int sum)
  {
      for(int i_1=0; i_1 <= (n-1); i_1++)
      {
        for(int i_2 = (i_1+1); i_2 <= (n-1); i_2++)
        {
		int s = arr[i_1]+ arr[i_2];
          if(s == sum)
          {
            System.out.println(arr[i_1] + "," + " " + arr[i_2]);
          }
        }
      }
  }
}