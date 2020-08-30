import java.util.Scanner;
class prime{
public static void main(String args[])
{
int n,i,c=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the Number: ");
n=in.nextInt();
for(i=1;i<=n;i++){
     if(n%i==0){
             c++;
             }
      
}
if(c==2){    
System.out.println(n+"is a prime number");}
else
    { System.out.println(n+" is not a prime number");}

}
}