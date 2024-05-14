package daily_programs;

class Tour {
    String destination;
    double cost;
    String description;

    public Tour(String destination, double cost, String description) {
        this.destination = destination;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Destination: " + destination + ", Cost: $" + cost + ", Description: " + description;
    }
}
class TourWithGuide extends Tour {
    String guide;

    public TourWithGuide(String destination, double cost, String description, String guide) {
        super(destination, cost, description);
        this.guide = guide;
    }

    @Override
    public String toString() {
        return super.toString() + ", Guide: " + guide;
    }
}
