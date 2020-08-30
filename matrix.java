import java.util.Scanner;
 
class matrix
{
   public static void main(String args[])
   {
      int  c, d;
       Scanner in=new Scanner(System.in);   
      
     
      int first[][] = new int[3][3];
      int second[][] = new int[3][3];
      int sum[][] = new int[3][3];
     
      System.out.println("Enter the elements of first matrix");
     
      for (c = 0; c < 3; c++)
         for (d = 0; d < 3; d++)
            first[c][d] = in.nextInt();
           
      System.out.println("Enter the elements of second matrix");
     
      for (c = 0 ; c < 3 ; c++)
         for (d = 0 ; d < 3; d++)
            second[c][d] = in.nextInt();
           
      for (c = 0; c < 3; c++)
         for (d = 0; d < 3; d++)
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
 
      System.out.println("Sum of the matrices:");
     
      for (c = 0; c < 3; c++)
      {
         for (d = 0; d < 3; d++)
            System.out.print(sum[c][d]+"\t");
         
         System.out.println();
      }
   }
}