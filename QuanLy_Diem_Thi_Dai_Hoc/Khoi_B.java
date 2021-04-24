package QuanLy_Diem_Thi_Dai_Hoc;

public class Khoi_B {
    private double maths;
    private double physical;
    private double born;

    public Khoi_B( double maths, double physical, double born) {
        this.maths = maths;
        this.physical = physical;
        this.born = born;
    }

    @Override
    public String toString() {
        return "Khoi_B{" +
                ", maths=" + maths +
                ", physical=" + physical +
                ", born=" + born +
                '}';
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

    public double getBorn() {
        return born;
    }

    public void setBorn(double born) {
        this.born = born;
    }
}
