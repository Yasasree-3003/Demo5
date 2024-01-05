import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
int i;
int count=0;
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
System.out.print(i);
if(i!=n)
System.out.print(",");
}
}
System.out.print("\nCount of factors of "+n+" " +"is"+" " +count);
if(count==2)
{
System.out.print("\nPRIME");}
else {
System.out.print("\nNOT PRIME");}
}
}