import java.util.Scanner;
class Student{
public static void main(String args[]){
int t[]=new int[1000],s[]=new int[1000];
int n,m,i,j,total=0;
float avg=0,per;
Scanner in=new Scanner(System.in);
System.out.print("Enter the no. of students: ");
m=in.nextInt();
System.out.print("Enter the no. of subjects: ");
n=in.nextInt();
for(j=0;j<m;j++){
  System.out.println("Enter the marks of Student "+(j+1));
for(i=0;i<n;i++){
System.out.print("Subject marks: ");
s[i]=in.nextInt();
System.out.print("Total marks: ");
 t[i]=in.nextInt();
}
for(i=0;i<n;i++){
 avg+=s[i];
total+=t[i];
}
per=(avg*100)/total;
avg=avg/n;
System.out.println("Average marks= "+avg+" Percentage= "+per);
if(per<40)
   System.out.println(" Fail");
else if((per>=40)&&(per<55))
      System.out.println(" Grade: D");  
else if((per>=55)&&(per<70))
      System.out.println(" Grade: C");
else if((per>=70)&&(per<85))
      System.out.println(" Grade: B");  
else if(per<85)
      System.out.println(" Grade: A"); 
avg=0;total=0;
}
}}