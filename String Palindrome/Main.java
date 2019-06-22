import java.util.*;
class Main
{
    public static void main(String args[])
    {
        // Type your code here
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      String temp = new String("");
      int str_l = str.length();
      for(int i= str_l -1; i>=0; i--)
      {
        temp = temp + str.charAt(i);
      }
      if(temp.equals(str) == true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    } 
}