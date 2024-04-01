import java.util.Scanner;
public class Bt_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Khai báo biến
            int number1, number2;

            //Lặp cho đến khi nhập đúng
            boolean isValidInput = false;
            do {
                try {
                    // Nhập số thứ nhất
                    System.out.print("Nhập số thứ nhất: ");
                    number1 = Integer.parseInt(scanner.nextLine());

                    // Nhập số thứ hai
                    System.out.print("Nhập số thứ hai: ");
                    number2 = Integer.parseInt(scanner.nextLine());

                    isValidInput = true; // Đánh dấu đã nhập đúng

                    //Tính tổng và hiển thị kết quả
                    int sum = number1 + number2;
                    System.out.println("Tổng của hai số là: " + sum);

                } catch (NumberFormatException e) {
                    System.err.println("Lỗi: Vui lòng chỉ nhập số nguyên.");
                }
            } while (!isValidInput);

            scanner.close();
        }


}
