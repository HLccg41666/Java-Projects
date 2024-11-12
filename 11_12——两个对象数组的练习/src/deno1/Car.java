package deno1;

public class Car {
    private String brand;
    private String price;
    private String color;

    public Car(String brand, String price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    public Car() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
