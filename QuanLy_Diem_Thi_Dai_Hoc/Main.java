package QuanLy_Diem_Thi_Dai_Hoc;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Admissions admissions = new Admissions();
        selection(admissions);
    }
    static void menu(){
        System.out.println(" nhập lựa chọn của bạn ? ");
        System.out.println(" 1. Hiển thị thông tin của các thí sinh ! ");
        System.out.println(" 2. Sắp xếp thí sinh theo họ tên ");
        System.out.println(" 3. Tìm kiếm 1 thí sinh theo id  ");
        System.out.println(" 4. Chỉnh sửa thông tin của 1 thí sinh ");
        System.out.println(" 5. Xóa thông tin của một thí sinh ");
        System.out.println(" 6. Nhập thông tin của thí sinh ");
        System.out.println(" 0. Thoát ");
    }
    static void selection(Admissions admissions){
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice){
                case 1->admissions.displayInformationStudent();
                case 2->admissions.selectionSort();
                case 3->admissions.displayAInformationStudent();
                case 4->admissions.editInformationOfAStudent();
                case 5->admissions.deleteAStudent();
                case 6->admissions.enterInformationStudent();
            }
        }while (choice!=0);
    }
}
