public class CarData {
    private int yearOfRelease;
    private String model;
    private int price;
    private String colour;

    public CarData(int yearOfRelease, String model, int price, String colour) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public CarData() {
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "yearOfRelease=" + yearOfRelease +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
