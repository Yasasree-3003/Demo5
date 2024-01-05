import java.util.Scanner;
class ContinueEx1
{
public static void main(String args[])
{
//Scanner s1=new Scanner(System.in);
//int n=s1.nextInt();
byte i=0;
while(true)
{
i++;
if(i%5==0)
{
continue;
} 
else
{
System.out.print(i+",");
}
}
}
}

