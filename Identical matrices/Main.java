import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int a[][] = new int[r][c];
    int b[][] = new int[r][c];
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
             a[i][j] = in.nextInt();
         }
     }
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
             b[i][j] = in.nextInt();
         }
     }
    int flag=1;
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
          if(a[i][j] != b[i][j])
          {
            flag=0;
          }
         }
     }
    if(flag == 0)
    {
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }
  }
}