class rectc
{ int l,w;
rectc(int a,int b)
{
 l=a;
w=b;
}
 int rectarea(){
    return(l*w);
}
}
class rectca
{
public static void main(String args[])
{  
   rectc rec1=new rectc(20,25);
int area1=rec1.rectarea();
System.out.println(" Area="+area1);
}
}