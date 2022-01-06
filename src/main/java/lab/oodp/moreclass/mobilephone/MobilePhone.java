package lab.oodp.moreclass.mobilephone;

public class MobilePhone {

    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCheaperThan(MobilePhone other) {
        return this.price < other.price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " which cost $" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MobilePhone) {
            MobilePhone other = (MobilePhone) obj;
            return  brand.equals(other.brand) && model.equals(other.model) && Math.abs(price - other.price) < 1e-12;
        }
        return false;
    }
}


