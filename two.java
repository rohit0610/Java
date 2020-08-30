import java.util.Scanner;
class two
{
  public static void main(String args[])
{
  Float a,b,c,d,e,f,g;
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the input Numbers=");
  a=in.nextFloat();
  b=in.nextFloat();
  c=a+b; d=a-b; e=a*b; f=a/b; g=a%b;
  System.out.println("Add="+c);
  System.out.println("Sub="+d);
  System.out.println("Mul="+e);
  System.out.println("Div="+f);
  System.out.println("Rem="+g);
}
} 