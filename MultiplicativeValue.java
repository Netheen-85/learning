import java.util.Scanner;
import java.util.Random;

public class MultiplicativeValue {

    public static void main(String[] args) {
        System.out.println("Enter the number of Elements: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Number of random numbers to generate
        System.out.println("Enter the range: ");
        int range = sc.nextInt(); // The range within which random numbers will be generated
        sc.close();

        // Call the mult method and print the result
        System.out.println("Product of the numbers: " + mult(num, range));
    }

    public static float mult(int num, int range) {
        Random rd = new Random();
        float[] set = new float[num]; // Array to store random numbers
        float product = 1f; // Initialize product to 1 (multiplicative identity)

        // Generate 'num' random numbers and multiply them together
        for (int i = 0; i < num - 1; i++) {
            set[i] = rd.nextFloat() * range + 1; // Generate a random float between 1 and 'range + 1' nextFloat() takes no parameters generates 0.0 tp 0.1 but nextInt can take parameters
            System.out.print(set[i] + " x ");
            product *= set[i]; // Multiply the product by the random value
        }

        // Generate and print the last random number
        set[num - 1] = rd.nextFloat() * range + 1;// +1 to shift start range from 0 to 1
        System.out.println(set[num - 1]);
        product *= set[num - 1]; // Multiply by the last random number

        return product; // Return the final product
    }
}
