import java.util.Scanner; 
class seven
{
public static void main(String args[])
{
 int a,s;
System.out.println("Enter the number to check whether it is odd or even\n");
Scanner in= new Scanner(System.in);
a=in.nextInt();
s=a%2;
if(s==0)
   System.out.println(a+" is an even number");
else
System.out.println(a+" is an odd number");
}

}