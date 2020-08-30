import java.util.Scanner;
class sumofdigit
{
public static void main(String args[])
{ int n,i,s=0;
System.out.println("Enter the number");
Scanner in=new Scanner(System.in);
i=in.nextInt();
while(i>0)
{
n=i%10;
s=s+n;
i=i/10;
}
System.out.println("Sum of digits="+s);
}
}