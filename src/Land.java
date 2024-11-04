public class Land extends Vehicle implements iEngine{
    private short type;
    private city cyte;

    public Land(int power, int year, String brand, short type, city cyte) {
        super(power, year, brand);
        this.type = type;
        this.cyte = cyte;
    }

    public String descrption() {
        return "";
    }

    @Override
    public String moveWheels() {
        return "";
    }
}
