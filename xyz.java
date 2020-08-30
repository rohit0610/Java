class abc
{
 float l,w;
void getdata(float a,float b)
      { l=a;
        w=b;
        }
}

class xyz
{
public static void main(String args[])
{
  float area;
  abc p=new abc();
 p.getdata(10,20);
area= p.l*p.w;
System.out.println("AREA="+area);
}
}