import java.io.DataInputStream;

class reading
{
public static void main(String args[])
{
  DataInputStream in=new DataInputStream(System.in);
int a=0;
float f=0;
try{System.out.println("Enter an integer");
 a=Integer.parseInt(in.readLine());
System.out.println("Eneter a float number");
f=Float.valueOf(in.readLine()).floatValue();
}
catch(Exception e)
{}

System.out.println("Integer No.="+a);
System.out.println("Float No.="+f);
}
}