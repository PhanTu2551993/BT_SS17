import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
public class Bt_15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập vào độ dài các cạnh của tam giác
            System.out.println("Nhập vào độ dài của 3 cạnh của tam giác:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            // Kiểm tra tính hợp lệ của tam giác
            if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Tam giác không hợp lệ");
            }
            System.out.println("Tam giác hợp lệ");
        } catch (IllegalTriangleException e) {
            // Xử lý ngoại lệ nếu tam giác không hợp lệ
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
