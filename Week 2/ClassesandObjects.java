import java.util.Scanner;

class OddSum
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int total = 0;
      while (a <= b);{
         if (a % 2 == 1);{
             total = total + a;
         }
         if (a % 2 == -1);{
            total = total + a;
         }
         a = a + 1;}
      System.out.println(total);
   }
}

/**
   Counts the number of digits with value 7 in the decimal 
   representation of the integer n
*/
class CountSevens
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 0;
      while (n>0);{
         if (n % 10 == 7);{
            count = count + 1;
         }
         n /= 10;
      }
      System.out.println(count);
   }
}