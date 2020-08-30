import java.util.Scanner;
class power
{
public static void main(String args[])
{
int n,i=0,pow=1;
System.out.println("Enter the power of 2");
Scanner in=new Scanner(System.in);
n=in.nextInt();
while(i<=n)
{
System.out.println("2^"+i+"="+pow);
pow=2*pow;
i++;
}
}
}