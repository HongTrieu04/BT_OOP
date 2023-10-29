import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private static List<Vehicle> vehicleList = new ArrayList<>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Hàm thêm phương tiện cá nhân của chủ sở hữu.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Hàm xóa xe trong danh sách phương tiện cá nhân.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (Objects.equals(vehicleList.get(i).getRegistrationNumber(), registrationNumber)) {
                vehicleList.remove(vehicleList.get(i));
            }
        }
    }

    /**
     * Hàm trả về danh sách phương tiện cá nhân.
     */
    public String getVehiclesInfo() {
        StringBuilder s = new StringBuilder();
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            s.append(name).append(" has:").append("\n\n");
        }

        for (Vehicle vehicle : vehicleList) {
            s.append(vehicle.getInfo()).append("\n");
        }
        return s.toString();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
