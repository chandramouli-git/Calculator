import java.util.Scanner;
class Calculator
{
  public static void main(String arr[])
  {
     int i=1;
     while(i>0)
     {
       System.out.println("Simple Calculator");
     System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\5.Exit");
     Scanner s=new Scanner(System.in);
     System.out.println("Choose any of the operation u desired");
     int choice=s.nextInt();
     System.out.println("Enter the numbers u want to perform  the above operation");
     int a=s.nextInt();
     int b=s.nextInt();
     
       switch(choice)
       {
         case 1:  System.out.println(add(a,b));break;
         case 2:  System.out.println(sub(a,b));break;   
         case 3:  System.out.println(mul(a,b));break;
         case 4:  System.out.println(div(a,b));break;
         case 5:  System.out.println("I hope i'm helpfull");i--;break;
       
       }
     }


  }
  public static int add(int a,int b)
  {
    return a+b;
  }
  
  public static int sub(int a,int b)
  {
    return a-b;
  }
  
  public static int mul(int a,int b)
  {
    return a*b;
  }
  
  public static int div(int a,int b)
  {
    return a/b;
  }
}