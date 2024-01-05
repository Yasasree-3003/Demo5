class Test28
{
public static void main(String args[])
{
int sum=0;
int i;
for(i=0;i<=100;i=i+5)
{
System.out.print(i+"+");
sum=sum+i;//sum+=i;
}
System.out.print("\b"+"="+sum);
}
}