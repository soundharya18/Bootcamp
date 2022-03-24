public class car extends Vehicle {
    int yearModel;
    String brand;
    int priceModel;
    int numberModel;
    int numberOfSeats;
    int gear;
    int maxSpeed;
    int numberOfGears;

    public car(String brand, int yearModel, int priceModel, int numberModel, int gear, int numberOfGears, int maxSpeed) {
        this();
        this.yearModel = yearModel;
        this.brand = brand;
        this.priceModel = priceModel;
        this.numberModel = numberModel;
        this.gear = gear;
        this.numberOfGears = numberOfGears;
        this.maxSpeed = maxSpeed;
    }

    public car(String brand, int gear, int numberOfGears, int maxSpeed) {
        this.gear = gear;
        this.brand = brand;
        this.numberOfGears = numberOfGears;
        this.maxSpeed = maxSpeed;
    }


    public car() {
        super();
    }


    public int getPriceModel() {

        return priceModel;
    }


    public int getNumberModel() {
        return numberModel;
    }

    public void changeGears(int gear) {
        if (gear < 1 || gear > numberOfGears) {
            System.out.println("Gear one to" + numberOfGears);
        } else {
            this.gear = gear;
            System.out.println("gear changed to" + gear);
        }


    }

}