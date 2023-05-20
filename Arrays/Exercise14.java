package Arrays;

/* Exercise 14: Read two series of 10 whole numbers, which will be ordered increasing. copy(merge)
 * the two tables in a third so that they remain ordered  
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] series1 = new int[10];
        System.out.println("Ingresa la primera serie de 10 números en orden creciente:");
        for (int i = 0; i < series1.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            series1[i] = sc.nextInt();
        }

        int[] series2 = new int[10];
        System.out.println("Ingresa la segunda serie de 10 números en orden creciente:");
        for (int i = 0; i < series2.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            series2[i] = sc.nextInt();
        }

        int[] mergedSeries = new int[20];
        System.arraycopy(series1, 0, mergedSeries, 0, series1.length);
        System.arraycopy(series2, 0, mergedSeries, series1.length, series2.length);
        Arrays.sort(mergedSeries);

        System.out.println("Series fusionadas en orden creciente: " + Arrays.toString(mergedSeries));

        sc.close();
    }
}

