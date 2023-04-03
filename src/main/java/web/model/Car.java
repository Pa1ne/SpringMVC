package web.model;

public class Car {
    private String model;
    private String series;
    private int mileage;

    public Car() {}

    public Car(String model, String series, int mileage) {
        this.model = model;
        this.series = series;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getMileage() {
        return mileage;
    }
}