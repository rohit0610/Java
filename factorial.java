import java.util.Scanner;
class factorial
{
public static void main(String args[])
{ int n,i,fact=1;
System.out.println("Enter the no. for factorial");
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=0;i<n;i++)
{ fact=fact+fact*i;
}
System.out.println(fact);
}
}
