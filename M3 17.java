class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2020;
        car.displayDetails();
    }
}