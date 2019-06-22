import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    char ch = in . next().charAt(0);
    int key = in.nextInt();
    if(ch >= 'a' && ch <= 'z'){
      ch = (char)(ch + 26 - key);
    }
    else if(ch >= 'A' && ch <= 'Z'){
      int offset = ch - 'A';
      offset = (offset - key) % 26;
      ch = (char)(offset + 'A');
    }
    System.out.print(ch);
  }
}