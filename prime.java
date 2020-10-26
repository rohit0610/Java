import java.util.Scanner;
class prime{
public static void main(String args[]){
 int n,i,j,c=0;
System.out.print("Enter the nth term: ");
Scanner in=new Scanner(System.in);
n=in.nextInt();
if(n<=1)
  System.out.print("Wrong Input");
for(i=2;i<=n;i++){
   for(j=1;j<=i;j++)
    if(i%j==0)
         c++;
    if(c==2)
        System.out.print("\t"+i);
c=0;
}
}}