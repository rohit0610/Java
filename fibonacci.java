import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
{
int f0=0,f1=1,f2,i,n;
System.out.print("Enter the nth term for Fibonacci: ");
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=0;i<n;i++)
{
 f2=f0+f1;
 System.out.print(f2+"\t");
f1=f0;
f0=f2;
}
}
}