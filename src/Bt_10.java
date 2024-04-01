import java.util.Scanner;
public class Bt_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double radius = 0;
            while (true) {
                try {
                    System.out.println("Nhập bán kính của hình tròn: ");
                    radius = scanner.nextDouble();
                    // Kiểm tra giá trị âm
                    if (radius < 0) {
                        System.err.println("Lỗi: Bán kính không thể là một số âm.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    // Xử lý ngoại lệ khi người dùng nhập không phải số
                    System.out.println("Lỗi: Không thể chuyển đổi thành số. Hãy nhập lại.");
                }
            }

            // Tính diện tích hình tròn
            double area = calculateCircleArea(radius);
            System.out.println("Diện tích của hình tròn là: " + area);
        }
        // Hàm tính diện tích hình tròn
        public static double calculateCircleArea(double radius) {
            double pi = 3.14159;
            return pi * radius * radius;
        }
    }

