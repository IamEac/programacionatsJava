package Arrays;

/* Exercise 13: Read 10 integers in a table. Save the even elements of the first table in another table
 * and then the odd elements
 */

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        int[] table1 = new int[10];
        int[] evenTable;
        int[] oddTable;
        int evenCount = 0;
        int oddCount = 0;

        Scanner sc = new Scanner(System.in);

        // Read 10 integers into table1
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            table1[i] = sc.nextInt();
        }

        // Count the number of even and odd elements in table1
        for (int i = 0; i < 10; i++) {
            if (table1[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create the evenTable and oddTable with appropriate sizes
        evenTable = new int[evenCount];
        oddTable = new int[oddCount];

        // Populate the evenTable and oddTable
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (table1[i] % 2 == 0) {
                evenTable[evenIndex] = table1[i];
                evenIndex++;
            } else {
                oddTable[oddIndex] = table1[i];
                oddIndex++;
            }
        }

        // Display the evenTable
        System.out.println("\nEven Table:");
        for (int i = 0; i < evenCount; i++) {
            System.out.println("Element " + (i + 1) + ": " + evenTable[i]);
        }

        // Display the oddTable
        System.out.println("\nOdd Table:");
        for (int i = 0; i < oddCount; i++) {
            System.out.println("Element " + (i + 1) + ": " + oddTable[i]);
        }

        sc.close();
    }
}
