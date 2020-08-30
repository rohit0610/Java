import java.util.Scanner;
import java.lang.Math;
class three{
  public static void main(String args[]){
  double a,b;
System.out.print("Enter the input No.=");
  Scanner in=new Scanner(System.in);
  a=in.nextDouble();
  
  b=Math.sqrt(a);
  System.out.print("Square root of "+a);
 System.out.println("is "+b);
}
}