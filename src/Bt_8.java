import java.util.Scanner;

public class Bt_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();
        // Kiểm tra điều kiện số không phải số nguyên tố
        if (number < 2) {
            System.err.println("Lỗi: Số không phải là số nguyên tố.");
        } else {
            // Kiểm tra tính số nguyên tố
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Hiển thị kết quả
            if (isPrime) {
                System.out.println(number + " là số nguyên tố.");
            } else {
                System.err.println(number + " không phải là số nguyên tố.");
            }
        }
    }
}
