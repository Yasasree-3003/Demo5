import java.util.Scanner;
class Factor
{
public static void main(String args[])
{
int i;
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.print(i);
if(i!=n)
System.out.print(",");
}
}
}
}