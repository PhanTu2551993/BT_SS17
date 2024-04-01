import java.util.Scanner;
public class Bt_9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                //Khai báo biến và nhập dữ liệu
                System.out.print("Nhập số Fibonacci thứ n: ");
                int n = scanner.nextInt();
                //Kiểm tra điều kiện n là số nguyên dương
                if (n <= 0) {
                    System.err.println("Lỗi: Số n không phải là số nguyên dương.");
                } else {
                    //Tính số Fibonacci thứ n
                    int result = calculateFibonacci(n);
                    //Hiển thị kết quả
                    System.out.println("Số Fibonacci thứ " + n + " là: " + result);
                }
            } catch (Exception e) {
                System.out.println("Lỗi: Không thể chuyển đổi thành số nguyên. Hãy nhập lại.");
            }
        }
        // Hàm tính số Fibonacci thứ n
        public static int calculateFibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                int a = 0, b = 1;
                for (int i = 2; i <= n; i++) {
                    int temp = b;
                    b = a + b;
                    a = temp;
                }
                return b;
            }
        }
}
