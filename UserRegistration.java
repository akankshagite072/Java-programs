package lab;

class UserRegistration {
    private String userName;
    private String contactNumber;
    private String carNumber;
    private String carModel;
    private String fuelType;

    public UserRegistration(String userName, String contactNumber, String carNumber, String carModel, String fuelType) {
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.fuelType = fuelType;
    }

    public String getUserName() {
        return userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getFuelType() {
        return fuelType;
    }
}

