package Assignment1.Task2;

public class Driver implements Prototype<Driver> {
    private String name;
    private String carModel;
    private String carMake;
    private String age;
    private String experience;

    public Driver(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    public Driver(String name, String carModel, String carMake) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
    }

    public Driver(String name, String carModel, String carMake, String age) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }
    public String getCarModel() {
        return this.carModel;
    }
    public String getCarMake() {
        return this.carMake;
    }
    public String getAge() {
        return this.age;
    }
    public String getExperience() {
        return this.experience;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public Driver clone() {
        Driver driverClone = new Driver(name, carModel, carMake, age);
        driverClone.experience = this.experience;
        return driverClone;
    }
}
