class sumofint
{
public static void main(String args[])
{
int i,s=0;
for(i=100;i<200;i++)
{   if(i%7==0)
      {    System.out.println(i);
s=s+i;}
}
System.out.println("Sum of integers="+s);
}
}