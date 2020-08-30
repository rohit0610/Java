import java.util.Scanner;
class powerfor
{
public static void main(String args[])
{
int n,i,pow=1;
System.out.println("Enter the power of 2");
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=0;i<=n;i++)
{
System.out.println("2^"+i+"="+pow);
pow=2*pow;
}
}
}