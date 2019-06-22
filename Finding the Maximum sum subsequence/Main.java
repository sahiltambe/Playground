import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[20];
        int i, j;
        for(i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
      
        int running_sum, max_sum_sub;
 	    running_sum = arr[0];
  	    max_sum_sub = arr[0];
  	    for(i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                running_sum += arr[i];
            }
            else 
            {
                running_sum = arr[i];
            }
            if(running_sum > max_sum_sub)
            {
                max_sum_sub = running_sum;
            }
        }
        System.out.println(max_sum_sub);
    }
}