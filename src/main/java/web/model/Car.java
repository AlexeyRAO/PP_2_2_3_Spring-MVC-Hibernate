package web.model;

public class Car {
    private String model;
    private String cale;
    private int series;

    public Car() {
    }

    public Car(String model, String cale, int series) {
        this.model = model;
        this.cale = cale;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCale() {
        return cale;
    }

    public void setCale(String cale) {
        this.cale = cale;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", cale='" + cale + '\'' +
                ", series=" + series +
                '}';
    }
}
