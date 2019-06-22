import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int str_len = input.length();
    String[] words=input.split(" ");
    int i,j,k;
		for(i=0; i<words.length; i++)				
		{
			if(words[i]!=null)
			{			
			for(j=i+1;j<words.length;j++)
			{				
			if(words[i].equals(words[j]))	
				{
					words[j]=null;	
				}
			}
			}
		}
		for(k=0;k<words.length;k++)	
		{
			if(words[k]!=null)
			{
				System.out.print(words[k] + " ");
			}			
	     }
  }
}