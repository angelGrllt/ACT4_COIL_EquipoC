public class Amphibian extends Vehicle implements WhaterVehicle,iiEngine {
    private String type;

    public Amphibian(int power, int year, String brand, String type) {
        super(power, year, brand);
        this.type = type;
    }

    @Override
    public String pathProgramming() {
        return "";
    }

    @Override
    public String moveWheels() {
        return "";
    }

    @Override
    public String moveJetPropulsion() {
        return "";
    }
}
