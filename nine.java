import java.util.Scanner; 
class nine
{
public static void main(String args[])
{
int a,b,c;
 Scanner in=new Scanner(System.in);
System.out.println("Enter the input Numbers=");
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
if(a<b)
     { if(a<c)
            System.out.println(a+" is smallest no.");
       else
             System.out.println(b+" is smallest no.");
}
else
System.out.println(c+" is smallest no.");
}
}