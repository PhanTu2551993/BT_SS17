import java.util.Scanner;
public class Bt_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Khai báo biến và nhập dữ liệu
            int[] numbers;
            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();

            // Kiểm tra số lượng phần tử
            if (n <= 0) {
                System.err.println("Lỗi: Mảng không có phần tử.");
                return; // Kết thúc chương trình
            }

            numbers = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // Kiểm tra trường hợp mảng rỗng
            if (n == 0) {
                System.err.println("Lỗi: Mảng không có phần tử.");
                return; // Kết thúc chương trình
            }

            //Tìm số lớn nhất
            int max = numbers[0]; // Giả sử phần tử đầu tiên là số lớn nhất
            for (int i = 1; i < n; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            //Hiển thị kết quả hoặc thông báo lỗi
            System.out.println("Số lớn nhất trong mảng là: " + max);

            scanner.close();
        }

}
