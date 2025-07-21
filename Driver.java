public class Driver {

    static int minimumAgeForDriving = 18;

    String color;

    int age = 19;

    public boolean isAllowedToDrive(){
        return this.age >= minimumAgeForDriving;
    }
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(5);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelInLitres());

        Car swift = new Car("red");
        Car thar = new Car();
        //swift.addFuel(6);
//        Car startedCar = swift.start();
//        swift.drive();

        swift.start().drive();
        System.out.println(swift.color);
    }
}
