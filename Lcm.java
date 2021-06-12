import java.util.Scanner;
class Lcm
{
public static void main(String[] args)
{ 
 Scanner s = new Scanner(System.in);
System.out.println("Enter 2 numbers :");
 int a = s.nextInt();
 int b = s.nextInt();

 int temp = 0;
  
  for(int i=1; i<=a && i<=b; i++)
     { 
        if(a%i==0 && b%i==0)
            temp = i;
      }
int lcm = (a*b)/temp;
  System.out.println("GCD =" +lcm );
}
}      