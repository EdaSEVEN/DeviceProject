public class Device {

    private String brand, model;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setBrand(String brand) {
        if (!brand.isEmpty()&&!brand.isBlank()&&brand!=null)
        {
            this.brand = brand;
        }


    }

    public void setModel(String model)
    {
        if (!model.isEmpty()&&!model.isBlank()&&model!=null)
        {
            this.model = model;
        }
    }

    public void setPrice(double price) {
        if (price>0)
            this.price = price;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println("system is on");
    }
    public void turnOff(){
        System.out.println("system is off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
