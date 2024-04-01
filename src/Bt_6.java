import java.util.Scanner;
public class Bt_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //  Nhập dữ liệu
            System.out.print("Nhập số bị chia: ");
            int soBiChia = scanner.nextInt();
            System.out.print("Nhập số chia: ");
            int soChia = scanner.nextInt();

            //Xử lý ngoại lệ
            try {
                int thuong = soChia / soBiChia;
                System.out.println("Kết quả của phép chia là: " + thuong);
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Só bị chia không được bằng 0 ");
            }
        }

}
