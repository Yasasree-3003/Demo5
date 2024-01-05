//reverse of the given digits
import java.util.Scanner;
class Palindrom
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n,temp;
int rd=0;//reverse of given digits
n=s1.nextInt();
temp=n;
while(n>0)
{
rd=rd*10+(n%10);
n=n/10;
}
if(rd==temp)
System.out.println("Given digit is Palindrome");
else
System.out.println("Given digit is not Palindrome");
}
}

