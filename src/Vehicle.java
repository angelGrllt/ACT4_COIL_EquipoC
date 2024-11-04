abstract class Vehicle {
    protected int power;
    protected int year;
    protected String brand;

    public Vehicle(int power, int year, String brand) {
        this.power = power;
        this.year = year;
        this.brand = brand;
    }


    public String description(){
        return "La marca del vehiculo es:" + this.brand + "\nEl vehiculo es del año: " + this.year + "\nEl vehiculo tiene un poder de: " + this.power;
    }
}
