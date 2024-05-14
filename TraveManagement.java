package daily_programs;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TraveManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TourManager tourManager = new TourManager();

        while (true) {
            displayMenu();

            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    addTour(scanner, tourManager);
                    break;

                case 2:
                    tourManager.displayTours();
                    break;

                case 3:
                    bookTour(scanner, tourManager);
                    break;

                case 4:
                    tourManager.displayBookedTours();
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("1. Add Tour");
        System.out.println("2. Display Available Tours");
        System.out.println("3. Book a Tour");
        System.out.println("4. Display Booked Tours");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // Consume the invalid input
        }
        return choice;
    }

    private static void addTour(Scanner scanner, TourManager tourManager) {
        System.out.print("Enter destination: ");
        String destination = scanner.next();
        System.out.print("Enter cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        Tour newTour = new Tour(destination, cost, description);
        tourManager.addTour(newTour);
        System.out.println("Tour added successfully!");
    }

    private static void bookTour(Scanner scanner, TourManager tourManager) {
        System.out.print("Enter your name: ");
        String customerName = scanner.next();
        System.out.print("Enter the tour index you want to book: ");
        int tourIndex = getUserChoice(scanner) - 1;

        System.out.println("Select Discount Type:");
        System.out.println("1. Regular Discount");
        System.out.println("2. VIP Discount");
        System.out.println("3. Special Discount");
        int discountTypeChoice = getUserChoice(scanner);

        Discount customerDiscount = null;

        switch (discountTypeChoice) {
            case 1:
                customerDiscount = new RegularDiscount(0.1); // 10% discount
                break;

            case 2:
                customerDiscount = new VIPDiscount(0.2); // 20% discount for VIP
                break;

            case 3:
                System.out.print("Enter special discount rate: ");
                double discountRate = scanner.nextDouble();
                customerDiscount = new SpecialDiscount(discountRate);
                break;

            default:
                System.out.println("Invalid discount type. Applying no discount.");
        }

        tourManager.bookTour(customerName, tourIndex, customerDiscount);
    }
}