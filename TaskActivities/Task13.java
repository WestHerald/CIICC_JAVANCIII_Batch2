public class Task13 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 2022, 4);
        c1.displayDetails();
    }
}

class Vehicle extends java.lang.Object {
    String make;
    String model;
    int year;
    public Vehicle (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    public Car (String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car details: ");
        System.out.println("Make: " + super.make);
        System.out.println("Model: " + super.model);
        System.out.println("Year " + super.year);
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
