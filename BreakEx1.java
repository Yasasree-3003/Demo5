import java.util.Scanner;
class BreakEx1
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
byte i=0;
while(true)
{
if(i==n)
{
break;
i++;
} 
else
{
System.out.print(i+",");
}
}
}
}

