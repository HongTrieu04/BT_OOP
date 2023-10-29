public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Hàm lấy thông tin cua xe máy.
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }


    /**
     * Hàm trả về thông tin của xe.
     */
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Motor Bike:").append("\n");
        s.append("\tBrand: ").append(brand).append("\n");
        s.append("\tModel: ").append(model).append("\n");
        s.append("\tRegistration Number: ").append(registrationNumber).append("\n");
        s.append("\tHas Side Car: ").append(hasSidecar).append("\n");
        s.append("\tBelongs to ").append(owner.getName()).append(" - ").append(owner.getAddress());
        return s.toString();
    }
}
