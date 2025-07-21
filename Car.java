public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    Car(String color){//The initial state when the object is created
        this.color = color;
        noOfWheels = 4;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSeats = 5;
    }
//    Car(){//The initial state when the object is created
//        this.color = "Black";
//        noOfWheels = 4;
//        maxSpeed = 150;
//        currentFuelInLitres = 2;
//        noOfSeats = 5;
//    }
    Car(){
        this("Black");
        currentFuelInLitres = 5;
    }

    static{
        noOfCarsSold = 0;
        System.out.println("Iam in static block");
    }
    {
        noOfCarsSold++;
        System.out.println("Iam in init block");//prints 2 times as there are 2 objects
    }

    public Car start() {
        if (currentFuelInLitres <= 0) {
            System.out.println("Car is out of fuel,cannot start");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserved mode,Please refuel");

        } else {
            System.out.println("Car is started,bruhhhh");


        }
        return this;
    }

    public void drive() {
        currentFuelInLitres--;
        System.out.println("Car is started..");
    }

    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelInLitres(){
        return currentFuelInLitres;
    }

    protected void finalise() throws Throwable{
        System.out.println("Iam in finalise");
    }


}
