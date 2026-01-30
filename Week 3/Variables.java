class ArrayOps
{
//1   
    public static int sumArray(int values[])
   {
      int sum = 0;
      int i = 0;
      while (i<values.length){
        sum = sum + values[i];
        i = i + 1;
      }
      return sum;
   }
//3   
   public static int countOccurs(int[] theArray, int theInt)
   {
      int count = 0;
      int i = 0;
      while (i<theArray.length){
         if (theArray[i] == theInt){
            count = count + 1;
         }
         i= i+1;
      }
      return count;
   }
}  

class Prices
{
//2   
    public static double averagePrice(double[] priceData)
   {
      double sum = 0;
      int i = 0;
      while (i<priceData.length){
         sum = sum + priceData[i];
         i=i+1;
      }
      double average = sum/priceData.length;
      return average;
   }
}

class Swapper
{
//4    
    public void swapAdjacentElements(int[] values)
   {
      int temp = 0;
      int i = 0;
      while (i < values.length - 1){
        temp = values[i];
        values[i] = values[i + 1];
        values[i + 1] = temp;
        i = i + 2;
      }
   }
//5   
   public void swapFirstAndSecondHalf(int[] values)
   {
      int n = values.length / 2;
      int i = 0;
      int temp = 0;
        while (i < n){
             temp = values[i];
             values[i] = values[i + n + values.length % 2];
             values[i + n + values.length % 2] = temp;
             i = i + 1;
        }
   }
}