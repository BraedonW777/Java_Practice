import java.util.Scanner;
import java.util.Arrays;

public class Sort {

   static int[] selectionSort(int[] numbers) {
      //sort algorithm comparing the index and will swap
      for(int i = 0; i < numbers.length - 1; i++){
         int indexSmallest = i;
         for(int j = i + 1; j < numbers.length; j++){
            if (numbers[j] < numbers[indexSmallest]){
               indexSmallest = j;
            }
         }
         //swap the numbers
         int temp = numbers[i];
         numbers[i] = numbers[indexSmallest];
         numbers[indexSmallest] = temp;
      }
      return numbers;
   }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   //get the input
   String line = sc.nextLine();
   //split the srting at each space in the line
   String[] numberStrs = line.split(" ");
   //new array at legnth of the string
   int[] unsortedNumbers = new int[numberStrs.length];
   //convert string to int array. 
   for(int i = 0;i < numberStrs.length;i++)
   {
      unsortedNumbers[i] = Integer.parseInt(numberStrs[i]);
   }
   //calls selectionSort function
   int[] sortedNumbers = selectionSort(unsortedNumbers);
   // print the array 
   System.out.println(Arrays.toString(sortedNumbers));

   }
}