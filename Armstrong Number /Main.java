import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int n1,count=0,sum=0,rem,new_count,temp,num;
      	temp = n;
      	num=n;
      	while(n != 0)
     	 {
        	n = n/10;
        	count++;
      	}
      	new_count = count;
      	for (;temp != 0; temp /= 10)
        {
            rem = temp % 10;
            sum = sum + (int) Math.pow(rem, new_count);
        }
    	if(sum == num)
        {
    		System.out.println("Armstrong Number");
        }
    	else
        {
        	System.out.println("Not a Armstrong Number");
        }
    	
   }
}