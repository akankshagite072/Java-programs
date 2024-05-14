import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int i, cal, size;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();

        int[] num = new int[size]; // Array

        System.out.println("Enter " + size + " numbers");
        // Accepting the array numbers
        for (i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        cal = num[0];
        System.out.println("The numbers are");
        // Display the value of the array
        for (i = 0; i < size; i++) {
            System.out.println("num=" + num[i]);
            if (num[i] > cal) {
                cal = num[i];
            }

        }

        System.out.println("The graetest no is =" + cal);

    }

}