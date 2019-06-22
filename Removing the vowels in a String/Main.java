import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int str_len = str.length();
    int i,j,k;
	
    String strNew = str.replaceAll("[aeiouAEIOU]", "");           
    System.out.print(strNew);
  }
}