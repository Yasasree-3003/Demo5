//reverse of the given digits
import java.util.Scanner;
class Reverseddigit
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n;
int rd=0;//reverse of given digits
n=s1.nextInt();
while(n>0)
{
rd=rd*10+(n%10);
n=n/10;
}
System.out.println(rd);
}
}
