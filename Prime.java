public class Prime {
    public static void main(String[] args) {
        int number = 11589887;

        // Check if the number is 2 or 3, which are both prime
        if (number == 2 || number == 3) {
            System.out.println(number + " is prime");
            return;
        }

        // If the number is less than 2, or if it's divisible by 2 or 3, it's not prime
        else if (number < 2 || number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is not prime");
            return;
        }

        // Check divisibility by numbers of the form 6k ± 1
        for(int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                System.out.println(number + " is not prime");
                return;
            }
        }

        // If no divisors were found, the number is prime
        System.out.println(number + " is prime");
    }
}
