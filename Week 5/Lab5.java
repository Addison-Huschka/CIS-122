import java.util.Scanner;
class GetVowels
{
   public static void main(String[] args)
   {
      String r = "";
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      for (int i=0;i<s.length();i++){
         char c = s.charAt(i);
         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            r += c;
         }
      }

      System.out.println(r);
   }
}

class ReverseString
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      String reversed = "";
      for (int i=s.length()-1;i>=0;i--){
        char c = s.charAt(i);
        reversed += c;
      }
      System.out.println(reversed);
   }
}

class PalFind
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String ins = in.nextLine();
        String s = ins.toLowerCase();
        boolean isPalindrome = true;
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
   }
}

class ColorCodes
{
   public String doubleImage(String img)
   {   
      String result = "";
      String temp = "";
      for (int i = 0; i < img.length(); i++)
      {
          char ch = img.charAt(i);
          if (ch == '\n')
          {
             result += temp;
             result += "\n";
             result += temp;
             result += "\n";
             temp = "";
          }
          else
          {
                temp += ch;
                temp += ch;
          }          
      }
      return result;
   }  
}

class Compressor
{
   public String compressImage(String imageColors)
   {
        String result = "";
        int count = 0;
        char current = imageColors.charAt(0);
        for (int i = 0; i < imageColors.length(); i++) {
            if (imageColors.charAt(i) == current) {
                count++;
            } else {
                result += count + "" + current;
                current = imageColors.charAt(i);
                count = 1;
            }
        }
        result += count + "" + current;
        return result;
   } 
}