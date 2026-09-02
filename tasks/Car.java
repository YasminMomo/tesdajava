class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:\nMake: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nNumber of Doors: " + numberOfDoors);
    }
}