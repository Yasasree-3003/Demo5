//palindrom of string
import java.util.Scanner;
class PalindromString
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
String n;
String rs="";
n=s1.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+n.charAt(i);
}
if(n.equals(rs))
{
System.out.println("Palindrome");
}
else {
System.out.println("Not Palindrome");
}
}
}

