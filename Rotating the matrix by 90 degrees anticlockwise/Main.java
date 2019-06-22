import java.util.*; 
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[
	r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    
    for (int i = 0; i < r; i++)
    {  
      for (int j = i + 1; j < c; j++)
       {  
          int temp = matrix[i][j];  
          matrix[i][j] = matrix[j][i] ;  
          matrix[j][i] = temp;  
        }  
     }
    for (int i = 0; i < r / 2; i++) 
    {  
      for (int j = 0; j < c; j++)
       {  
          int temp = matrix[i][j];  
          matrix[i][j] = matrix[r - (i + 1)][j];  
          matrix[r - (i + 1)][j] = temp;  
       } 
    }
    for (int i = 0; i < r; i++) 
    {  
     for (int j = 0; j < c; j++) 
      {  
         System.out.print(matrix[i][j] + " ");  
      }  
            System.out.println();  
    }
  }
}