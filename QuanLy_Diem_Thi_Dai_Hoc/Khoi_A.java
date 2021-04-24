package QuanLy_Diem_Thi_Dai_Hoc;

public class Khoi_A {
    private double maths;
    private double physical;
    private double chemical;

    public Khoi_A( double maths, double physical, double chemical) {
        this.maths = maths;
        this.physical = physical;
        this.chemical = chemical;
    }



    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemical() {
        return chemical;
    }

    @Override
    public String toString() {
        return "Khoi_A{" +
                ", maths=" + maths +
                ", physical=" + physical +
                ", chemical=" + chemical +
                '}';
    }

    public void setChemical(double chemical) {
        this.chemical = chemical;
    }
}
