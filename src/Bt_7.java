import java.util.InputMismatchException;
import java.util.Scanner;
public class Bt_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Khai báo biến
            int number1, number2;
            try {
                //Nhập dữ liệu
                System.out.print("Nhập số thứ nhất: ");
                number1 = scanner.nextInt();

                System.out.print("Nhập số thứ hai: ");
                number2 = scanner.nextInt();
                int max = Math.max(number1, number2);
                System.out.println("Số lớn nhất là: " + max);
            } catch (Exception e) {
                System.err.println("Lỗi: Bạn phải nhập số nguyên. Vui lòng nhập lại.");
            }
        }
}
