//sum of the given digits
import java.util.Scanner;
class Sumdigit
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n;
int rem;
int sd=0;//sum of given digits
n=s1.nextInt();
while(n>0)
{
rem=n%10;
sd=sd+rem;
n=n/10;
}
System.out.println(sd);
}
}
