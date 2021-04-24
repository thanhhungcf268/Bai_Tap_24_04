package QuanLy_Diem_Thi_Dai_Hoc;

public class Khoi_C {
    private double literature;
    private double history;
    private double geography;

    public Khoi_C( double literature, double history, double geography) {
        this.literature = literature;
        this.history = history;
        this.geography = geography;
    }

    @Override
    public String toString() {
        return "Khoi_C{" +
                ", Literature=" + literature +
                ", history=" + history +
                ", geography=" + geography +
                '}';
    }


    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getHistory() {
        return history;
    }

    public void setHistory(double history) {
        this.history = history;
    }

    public double getGeography() {
        return geography;
    }

    public void setGeography(double geography) {
        this.geography = geography;
    }
}
