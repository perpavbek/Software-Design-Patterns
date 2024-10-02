package Assignment1.Task3;

public class Client {
    public static void main(String[] args) {
        Driver driver = new Driver.DriverBuilder()
                .withName("Johny Silverhand")
                .withCarModel("Porshe 911")
                .withLicenseNumber("XYZ12345")
                .withExperienceYears(5)
                .isAvailable(true)
                .build();
        System.out.println(driver);
    }
}
