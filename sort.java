class sort
{
  public static void main(String args[])
{ int n[]={55,40,80,65,71};
 int l=n.length;
System.out.println("Given list:");
for(int i=0;i<l;i++){
System.out.println(" "+n[i]);
}
System.out.println("\n");

for(int i=0;i<l;i++){
 for(int j=i+1;j<l;j++){
     if(n[i]>n[j]){
   int t=n[i];
n[i]=n[j];
n[j]=t;
}
}
}
System.out.println("Sorting:");
for(int i=0;i<l;i++){
System.out.println(" "+n[i]);
}
}
}