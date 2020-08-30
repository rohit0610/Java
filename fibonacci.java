class fibonacci
{
public static void main(String args[])
{
int f0=0,f1=1,f2,i;
for(i=0;i<20;i++)
{
 f2=f0+f1;
 System.out.println(f2);
f1=f0;
f0=f2;
}
}
}