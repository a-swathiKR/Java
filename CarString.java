public class CarString {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public CarString(String company, int maxSpeed, String modelNumber, String name, int noOfDoors, int noOfWheels) {
        this.company = company;
        this.maxSpeed = maxSpeed;
        this.modelNumber = modelNumber;
        this.name = name;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "CarString{" +
                "company='" + company + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CarString swift = new CarString("Maruti",120,"SW876","Swift",4,4);
        System.out.println(swift.toString());
    }
}
