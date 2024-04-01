import java.util.Scanner;

public class Bt_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //Nhập vào hai số từ người dùng
            System.out.println("Nhập số thứ nhất:");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số thứ hai:");
            int num2 = Integer.parseInt(scanner.nextLine());
            //Kiểm tra điều kiện cả hai số bằng 0
            if (num1 == 0 && num2 == 0) {
                throw new RuntimeException("Cả hai số đều bằng 0");
            }
            // Tìm ước chung lớn nhất (UCLN)
            int ucln = findUcln(Math.abs(num1), Math.abs(num2));
            System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + ucln);
        } catch (NumberFormatException e) {
            // Xử lý ngoại lệ nếu người dùng nhập không phải là số
            System.out.println("Lỗi: Vui lòng nhập số nguyên.");
        } catch (RuntimeException e) {
            // Xử lý ngoại lệ nếu cả hai số đều bằng 0
            System.err.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức tìm ước chung lớn nhất (UCLN) sử dụng thuật toán Euclid
    private static int findUcln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
