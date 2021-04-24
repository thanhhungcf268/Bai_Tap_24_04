package QuanLy_Diem_Thi_Dai_Hoc;

public class Student {
    private Khoi_A khoi_a;
    private Khoi_B khoi_b;
    private Khoi_C khoi_c;
    private int id;
    private String name;
    private String address;
    private double priorityArea;



    public Student(Khoi_A khoi_a,int id, String name, String address, double priorityArea) {
        this.khoi_a = khoi_a;
        this.id = id;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }
    public Student(Khoi_B khoi_b,int id, String name, String address, double priorityArea) {
        this.khoi_b = khoi_b;
        this.id = id;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }
    public Student(Khoi_C khoi_c, int id, String name, String address, double priorityArea) {
        this.khoi_c = khoi_c;
        this.id = id;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }

    public Khoi_A getKhoi_a() {
        return khoi_a;
    }

    public void setKhoi_a(Khoi_A khoi_a) {
        this.khoi_a = khoi_a;
    }

    public Khoi_B getKhoi_b() {
        return khoi_b;
    }

    public void setKhoi_b(Khoi_B khoi_b) {
        this.khoi_b = khoi_b;
    }

    public Khoi_C getKhoi_c() {
        return khoi_c;
    }

    public void setKhoi_c(Khoi_C khoi_c) {
        this.khoi_c = khoi_c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPriorityArea() {
        return priorityArea;
    }

    public void setPriorityArea(double priorityArea) {
        this.priorityArea = priorityArea;
    }
    public void displayKhoi_A(){}
    public void displayKhoi_B(){}
    public void displayKhoi_C(){}
    @Override
    public String toString() {
        return "Student{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea=" + priorityArea +
                '}';
    }
}
