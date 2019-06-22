import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int large_index=0,mx=arr[0];
    for(int i=0; i<=n-1; i++)
    {
      arr[i] = in.nextInt();
    }
    for(int i=0; i<=n-1; i++)
    {
      if(arr[i] > mx)
      {
        mx = arr[i];
      	large_index = i;
      }
    }
    System.out.println(large_index);
  }
}