import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* Create a function for filtering the list

Create a list of 'n' random numbers 'L' outside the function
Input to the function should be array or list 'L' and integer 'N' 1 <= x <= 100 
result should be filtered array or list 'L' and filtering rule is less than integer 'N'
Example input

L = [2,9,4,9,3]
N = 6
Result should be..
[2,4,3] */

public class LessThanN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        System.out.print("Enter the range of elements: ");
        int range = sc.nextInt();

        System.out.print("Enter the number N to check: ");
        int N = sc.nextInt();

        // Generate the list of random elements
        int[] list = set(num, range);
        System.out.println("Original List: " + Arrays.toString(list));

        // Filter the list based on N
        int[] filteredList = check(list, N);
        System.out.println("Filtered List: " + Arrays.toString(filteredList));

        sc.close();
    }

    // Method to generate a list of random integers
    public static int[] set(int num, int range) {   
        int[] list = new int[num];
        Random rd = new Random();
        for (int i = 0; i < num; i++) {
            list[i] = rd.nextInt(range);// 0 to range
        }
        return list;
    }

    // Method to filter the list based on value N
    public static int[] check(int[] list, int N) {
        // Count elements less than N
        int count = 0;
        for (int value : list) {
            if (value < N) {
                count++;
            }
        }

        // Create and populate the filtered list
        int[] filteredList = new int[count];
        int index = 0;
        for (int value : list) {
            if (value < N) {
                filteredList[index++] = value;// post increment
            }
        }

        return filteredList;
    }
}
