package web.model;

public class Car {
    private String marka = "marka";
    private String model = "model";
    private int series = 0;

    public Car() {
    }

    public Car(String marka, String model, int series) {
        this.marka = marka;
        this.model = model;
        this.series = series;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
