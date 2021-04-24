package QuanLy_Diem_Thi_Dai_Hoc;

import java.util.ArrayList;
import java.util.Scanner;
public class Admissions {
    Scanner sc = new Scanner(System.in);
    private final ArrayList<Student> list = new ArrayList<>();

    private Khoi_A enterInformationKhoi_A() {
        System.out.println(" bạn đã chọn khối A ");
        System.out.println(" nhập điểm toán : ");
        double maths = sc.nextDouble();
        System.out.println(" nhập điểm lý : ");
        double physical = sc.nextDouble();
        System.out.println(" nhập điểm hóa : ");
        double chemical = sc.nextDouble();
        return new Khoi_A(maths, physical, chemical);
    }

    private Khoi_B enterInformationKhoi_B() {
        System.out.println(" bạn đã chọn khối B ");
        System.out.println(" nhập điểm toán : ");
        double maths = sc.nextDouble();
        System.out.println(" nhập điểm hóa : ");
        double chemical = sc.nextDouble();
        System.out.println(" nhập điểm sinh : ");
        double born = sc.nextDouble();
        return new Khoi_B(maths, chemical, born);
    }

    private Khoi_C enterInformationKhoi_C() {
        System.out.println(" bạn đã chọn khối C ");
        System.out.println(" nhập điểm văn : ");
        double literature = sc.nextDouble();
        System.out.println(" nhập điểm sử : ");
        double history = sc.nextDouble();
        System.out.println(" nhập điểm địa : ");
        double geography = sc.nextDouble();
        return new Khoi_C(literature, history, geography);
    }

    public void enterInformationStudent() {
        list.add(enterInformationStudents());
    }

    private double priorityArea() {
        System.out.println(" 1. khu vực 1 là thành phố ( điểm ưu tiên 0 )");
        System.out.println(" 2. khu vực 2 là nông thôn ( điểm ưu tiên 2.5 )");
        double index = sc.nextDouble();
        if (index == 1) {
            index = 0;
        } else if (index == 2) {
            index = 2.5;
        } else {
            System.out.println(" Hãy chọn 1 trong 2 khu vực bằng cách nhấn 1 hoặc 2 : ");
            priorityArea();
        }
        return index;
    }

    public void displayInformationStudent() {
        for (Student student : list) {
            if (student.getKhoi_a() != null) {
                System.out.println(student + student.getKhoi_a().toString());
            }
            if (student.getKhoi_b() != null) {
                System.out.println(student + student.getKhoi_b().toString());
            }
            if (student.getKhoi_c() != null) {
                System.out.println(student + student.getKhoi_c().toString());
            }
        }
    }

    private int findStudentById() {
        int id = sc.nextInt();
        int index = -1;
        for (Student student : list) {
            index++;
            if (student.getId() == id) {
                return index;
            }
        }
        return -1;
    }

    public void displayAInformationStudent() {
        for (; ; ) {
            System.out.println(" nhập số báo danh của của thí sinh muốn hiển thị : ");
            int index = findStudentById();
            if (index == -1) {
                System.out.println(" Nhập sai số báo danh ");
                System.out.println(" Nhập 0 nếu muốn thoát hoặc phím số bất kì nếu muốn tiếp tục : ");
                index = sc.nextInt();
                if (index == 0) {
                    return;
                } else {
                    displayAInformationStudent();
                }
            } else {
                if (list.get(index).getKhoi_a() != null) {
                    System.out.println(list.get(index) + list.get(index).getKhoi_a().toString());
                    return;
                }
                if (list.get(index).getKhoi_b() != null) {
                    System.out.println(list.get(index) + list.get(index).getKhoi_b().toString());
                    return;
                }
                if (list.get(index).getKhoi_c() != null) {
                    System.out.println(list.get(index) + list.get(index).getKhoi_c().toString());
                    return;
                }
            }
        }
    }

    public int size() {
        return list.size();
    }

    public void selectionSort() {

        int n = list.size();
        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getName().compareTo(list.get(min_idx).getName())<0){
                   min_idx = j;
                };
            }
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            Student temp = list.get(min_idx);
            list.set(min_idx, list.get(i));
            list.set(i, temp);

        }
    }
    private int checkId(){
        int id = sc.nextInt();
        System.out.println(" Nhập số báo danh : ");
        for (Student list : list){
            if (list.getId()==id){
                System.out.println(" Số báo danh đã tồn tại hãy nhập lại : ");
                checkId();
            }
        }
        return id;
    }
    private Student enterInformationStudents() {
        int id = checkId();
        System.out.println(" Nhập tên : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(" Nhập địa chỉ : ");
        String address = sc.nextLine();
        System.out.println(" chọn vùng ưu tiên : ");
        double priorityArea = priorityArea();
        for (; true; ) {
            int choice = blockSelection();
            if (choice == 1) {
                return new Student(enterInformationKhoi_A(), id, name, address, priorityArea);
            } else if (choice == 2) {
                return new Student(enterInformationKhoi_B(), id, name, address, priorityArea);
            } else if (choice == 3) {
                return new Student(enterInformationKhoi_C(), id, name, address, priorityArea);
            }
            System.out.println(" vui lòng nhập 1, 2 hoặc 3 ! ");
        }
    }

    private int blockSelection() {
        System.out.println("chọn khối bạn muốn thi : ");
        System.out.println("Nhập 1 : khối A");
        System.out.println("Nhập 2 : khối B");
        System.out.println("Nhập 3 : khối C");
        int choice = sc.nextInt();
        if (choice == 1) {
            return 1;
        } else if (choice == 2) {
            return 2;
        } else if (choice == 3) {
            return 3;
        } else {
            blockSelection();
        }
        return choice;
    }

    public void editInformationOfAStudent() {
        for (; ; ) {
            System.out.println(" nhập số báo danh của của thí sinh muốn sửa : ");
            int index = findStudentById();
            if (index == -1) {
                System.out.println(" nhập sai số báo danh ");
                System.out.println(" nhập 0 nếu muốn thoát hoặc phím số bất kì nếu muốn tiếp tục : ");
                index = sc.nextInt();
                if (index == 0) {
                    return;
                } else {
                    editInformationOfAStudent();
                }
            } else {
                list.set(index, enterInformationStudents());
                return;
            }
        }
    }

    public void deleteAStudent() {
        System.out.println(" nhập số báo danh của của thí sinh muốn xóa : ");
        int index = findStudentById();
        if (index == -1) {
            System.out.println(" nhập sai số báo danh ");
            System.out.println(" nhập 0 nếu muốn thoát hoặc phím số bất kì nếu muốn nhập lại : ");
            index = sc.nextInt();
            if (index == 0) {
                return;
            } else {
                deleteAStudent();
            }
        } else {
            list.remove(index);
        }
    }
}
