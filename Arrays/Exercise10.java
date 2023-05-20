package Arrays;

/* Exercise 10: Create a program that reads a table of 10 numbers by keyboard
  * integers and move N positions in the array (N is typed by the user)
  */

import java.util.Scanner;

public class Exercise10{

     public static void main(String[] args) {
         int[] numbers = new int[10];
         Scanner sc = new Scanner(System.in);

         // Read the numbers by keyboard
         System.out.println("Enter 10 integers:");
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = sc.nextInt();
         }

         // Prompt the user for the number of positions to move
         System.out.println("Enter the number of positions to move:");
         int n = sc.nextInt();

         // Perform the shift of N positions in the array
         int[] result = movePositions(numbers, n);

         // Print the resulting array
         System.out.println("Resulting array:");
         for (int i = 0; i < result.length; i++) {
             System.out.print(result[i] + " ");
         }
     }

     public static int[] movePositions(int[] numbers, int n) {
         int[] result = new int[numbers.length];

         for (int i = 0; i < numbers.length; i++) {
         int newIndex = (i + n) % numbers.length;

             if (newIndex >= numbers.length) {
                 newIndex -= numbers.length;
             } else if (newIndex < 0) {
                 newIndex += numbers.length;
             }

             result[newIndex] = numbers[i];
         }

         return result;
     }
}
