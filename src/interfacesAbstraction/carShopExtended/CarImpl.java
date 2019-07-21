package interfacesAbstraction.carShopExtended;

public class CarImpl implements Car {
    private String model;
    private String color;
    private Integer horsepower;
    private String countryProduced;

    public CarImpl(String model, String color, Integer horsepower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.countryProduced = countryProduced;
        this.horsepower = horsepower;
    }

    @Override
    public String toString(){
String format = "This is %s produced in %s and have %d tires";
return String.format(format, this.getModel(),
        this.countryProduced(),TIRES);
    }


    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsepower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }
}
