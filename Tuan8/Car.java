public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Hàm lấy thông tin ô tô.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Hàm trả về thông tin của xe.
     */
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Car:").append("\n");
        s.append("\tBrand: ").append(brand).append("\n");
        s.append("\tModel: ").append(model).append("\n");
        s.append("\tRegistration Number: ").append(registrationNumber).append("\n");
        s.append("\tNumber of Doors: ").append(numberOfDoors).append("\n");
        s.append("\tBelongs to ").append(owner.getName()).append(" - ").append(owner.getAddress());
        return s.toString();
    }
}
