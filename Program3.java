import java.util.*;
class Program3
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
try
{
System.out.println("Enter A Number;");
int a = obj.nextInt();
System.out.println("Enter B Number;");
int b = obj.nextInt();
int S=a*b;
System.out.println("A*B = "+S);
int A=a+b;
System.out.println("A+B = "+A);
int B=a-b;
System.out.println("A-B = "+B);
int D=a/b;
System.out.println("A/B = "+D);
}
catch (Exception e)
{
obj.close();
}
}
}
