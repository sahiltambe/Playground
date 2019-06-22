import java.util.*;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    int result[][] = new int[column_size][row_size];
    
    for(int i = 0; i <= row_size - 1; i++)
    {
      for(int j = 0; j <= column_size - 1; j++)
      {
        result[i][j] = matrix1[j][i];
      }
    }
    
    for(int i = 0; i <= row_size - 1; i++)
    {
      for(int j = 0; j <= column_size - 1; j++)
      {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}