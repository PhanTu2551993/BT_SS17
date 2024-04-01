import java.util.Scanner;

public class Bt_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập chuỗi từ người dùng
            System.out.println("Nhập chuỗi:");
            String string = scanner.nextLine();

            // Kiểm tra điều kiện chuỗi rỗng hoặc null
            if (string == null || string.isEmpty()) {
                throw new RuntimeException("Chuỗi không hợp lệ");
            }
            // Đảo ngược chuỗi
            String reversedString = reverseString(string);
            // Hiển thị kết quả
            System.out.println("Chuỗi đảo ngược: " + reversedString);
        } catch (RuntimeException e) {
            // Xử lý ngoại lệ nếu chuỗi không hợp lệ
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
    // Phương thức đảo ngược chuỗi
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
