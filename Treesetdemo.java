import java.uti.Scanner;

public class Treesetdemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Add elements to the ArrayList based on user input
        System.out.println("Enter fruits to add to the ArrayList (type 'done' to finish):");
        String input;
        while (!(input = scanner.nextLine()).equals("done")) {
            arrayList.add(input);
        }

        // Close the scanner
        scanner.close();

        // Display the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Iterate over the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Check if an element exists
        System.out.print("Enter a fruit to check its presence: ");
        String searchFruit = scanner.nextLine();
        if (arrayList.contains(searchFruit)) {
            System.out.println(searchFruit + " is present in the ArrayList.");
        } else {
            System.out.println(searchFruit + " is not present in the ArrayList.");
        }

        // Remove an element
        System.out.print("Enter a fruit to remove from the ArrayList: ");
        String removeFruit = scanner.nextLine();
        if (arrayList.remove(removeFruit)) {
            System.out.println(removeFruit + " removed from the ArrayList.");
        } else {
            System.out.println(removeFruit + " not found in the ArrayList.");
        }

        // Display the ArrayList after removal
        System.out.println("ArrayList after removal: " + arrayList);

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // Clear the ArrayList
        arrayList.clear();
        System.out.println("ArrayList cleared.");

        // Check if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());
    }
}
