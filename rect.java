class rect
{
 int l,w;
void get(int a, int b){
l=a;
w=b;
}
int area(){ 

 return(l*w);
}
 
public static void main(String args[])
{
  rect r=new rect();
r.get(15,2);
System.out.println("Area of rectangle="+r.area());
  
}
}