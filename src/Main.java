import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;// khai báo biến chiều rộng
        float height;// khai báo biến chiều cao
        Scanner scanner = new Scanner(System.in); //khai báo đối tượng Scanner để thực hiện các chức năng nhập liệu trong JAVA CORE
        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Nhập chiều rộng
        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều cao
        float area = width*height;//Khai báo biến area đồng thời tính diện tích
        System.out.println("Area is: " + area); //In ra kết quả diện tích
    }
}