import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int r1 = in.nextInt();
    int c1 = in.nextInt();
    int a[][] = new int[r1][c1];
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
             a[i][j] = in.nextInt();
         }
     }
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
          if(i == j)
          {
             System.out.print(a[i][j] + " ");
          }
         }
     }
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
          if(i < j)
          {
             System.out.print(a[i][j] + " ");
            i++;
          }
         }
     }
    for(int i = 0; i < r1; i++)
    {
        for(int j = 0; j < c1; j++)
        {
          if(i == 0 && j == 2)
          {
             System.out.print(a[i][j] + " ");
          }
         }
     }
  }
}