class sup
{ int x;
sup(int x){
this.x=x;
}
void display()
{ System.out.println("Super x="+x);
}
}
class sub extends sup
{ int y;
  sub(int x,int y){
super(x);
this.y=y;
}
 void display(){
System.out.println("Super x="+x);
System.out.println("Sub y="+y);
}
}
class override
{
public static void main(String args[])
{
sub s1=new sub(26,36);
s1.display();
}
}