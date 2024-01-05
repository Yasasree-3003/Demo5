import java.util.Scanner;
class ProductDigit
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n;
int rem;
int pd=1;//product of given digits
System.out.println("Enter any positive integer:");
n=s1.nextInt();
while(n>0)
{
rem=n%10;
pd=pd*rem;
n=n/10;
}
System.out.println(pd);
}
}