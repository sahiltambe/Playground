import java.util.*;
class Main
{
 public static boolean prime(int num)
 {
   int i;
   boolean flag=true;
	for(i=2; i<num; i++)
	{
     		if(num % i == 0)
      		{
        		flag = false;
       			break;
			}
	}
   return flag;
 }
 public static void main(String args[])
 {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
   int res,j;
   	for(j=2; j<n; j++)
	{
       	   if(prime(j))
	   		{
               System.out.println(j);
            }
     }
 }
}