public class SumofN {
    public static void main(String[] args) {
        //sum of first N numbers example:- 0 to 15   Formula:  [n x (n+1)] / 2
        int n = 15;
        System.out.println("Sum of first " + n + " numbers: " + (n*(n+1))/2 );

        //sum of numbers between particular numbers : example:- from 35 to 45  Formula - [sum of 45 numbers - sum of 35 numbers]
        int n1 = 35, n2 = 45;
        int total = ((n2*(n2+1))/2) - (((n1-1)*((n1-1)+1))/2); // n1-1 to exclude 35
        System.out.println("Sum of numbers between " + n1 + " and " + n2 + " is " + total);

        //Average of the numbers
        int numbers = n2 - n1 + 1; // include 35
        System.out.println("Average between " + n1 + " and " + n2 + " is " + total/numbers );
    }
    
}
