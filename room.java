class area
{
 int x,y;
area(int l,int b)
{ x=l;
y=b;
}
int ar(){
return(x*y);
}
}
class volume extends area
{
int z;
volume(int l,int b,int h){
  super(l,b);
  z=h;
}
int vol(){
return(x*y*z);
}
}
class room
{
public static void main(String args[])
{
volume r1=new volume(12,10,10);
int area1=r1.ar( );
int vol1=r1.vol( );
System.out.println("Area of the room="+area1);
System.out.println("Volume of the room="+vol1);
}
}
