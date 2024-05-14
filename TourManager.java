package daily_programs;

import java.util.ArrayList;

class TourManager {
    ArrayList<Tour> tours;
    ArrayList<Booking> bookings;

    public TourManager() {
        this.tours = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public void displayTours() {
        System.out.println("Available Tours:");
        for (int i = 0; i < tours.size(); i++) {
            System.out.println((i + 1) + ". " + tours.get(i));
        }
    }

    public void bookTour(String customerName, int tourIndex, Discount customerDiscount) {
        if (isValidTourIndex(tourIndex)) {
            Booking booking = new Booking(customerName, tours.get(tourIndex));
            bookings.add(booking);
            double discountedCost = customerDiscount.applyDiscount(tours.get(tourIndex).cost);
            System.out.println("Booking successful! Total Cost: $" +
                    discountedCost + " | Booked on: " + booking.getFormattedDate());
        } else {
            System.out.println("Invalid tour index. Please enter a valid index.");
        }
    }

    public void displayBookedTours() {
        System.out.println("Booked Tours:");
        for (Booking booking : bookings) {
            System.out.println("Customer: " + booking.customerName +
                    ", Tour: " + booking.tour.destination +
                    ", Cost: $" + booking.tour.cost +
                    ", Booked on: " + booking.getFormattedDate());
        }
    }

    public boolean isValidTourIndex(int tourIndex) {
        return tourIndex >= 0 && tourIndex < tours.size();
    }
}
class ExtendedTourManager extends TourManager {
    // Extended functionality specific to the new cases

    public void bookTour(String customerName, int tourIndex, Discount customerDiscount) {
        if (isValidTourIndex(tourIndex)) {
            Tour selectedTour = tours.get(tourIndex);
            Booking booking = new Booking(customerName, selectedTour);
            bookings.add(booking);
            double originalCost = selectedTour.cost;
            double discountedCost = customerDiscount.applyDiscount(originalCost);

            System.out.println("Booking successful! Tour Details:");
            System.out.println("Customer: " + customerName);
            System.out.println("Tour: " + selectedTour.destination);
            System.out.println("Original Cost: $" + originalCost);
            System.out.println("Discount Applied: $" + (originalCost - discountedCost));
            System.out.println("Discounted Cost: $" + discountedCost);
            System.out.println("Booked on: " + booking.getFormattedDate());
        } else {
            System.out.println("Invalid tour index. Please enter a valid index.");
        }
    }
}
