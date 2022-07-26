import java.util.Scanner;
public class Shop {
public static void main(String[] args)
      {
       Scanner sc=new Scanner(System.in);
       System.out.println("T-shirt value is 200");
       int a=sc.nextInt(); 
       int e= a*200-20;
       System.out.println("Pajama value is 305");
       int b=sc.nextInt();
       double f= b*305-30.5;
       System.out.println("Shirt value is 550");
       int c=sc.nextInt();
       int g= c*550-55;
       double z=e+f+g;
       
       System.out.println("The total amount is Rupees=" +z); 
      }
}
       
       