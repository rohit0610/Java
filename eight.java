import java.util.Scanner; 
class eight
{
public static void main(String args[])
{
int a,b,c;
 Scanner in=new Scanner(System.in);
System.out.println("Enter the input Numbers=");
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
if(a==b){
     if(b==c)
     System.out.println("All inputs are same");

  }
if(a>b)
     if(a>c)
            System.out.println(a+" is largest no.");
else
{ if(b>c) 
       System.out.println(b+" is largest no.");
     else
     System.out.println(c+" is largest no.");}
}

}