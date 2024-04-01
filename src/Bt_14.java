import java.util.Scanner;

public class Bt_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập số lượng phần tử của mảng
            System.out.println("Nhập số lượng phần tử của mảng:");
            int n = scanner.nextInt();
            //Kiểm tra điều kiện mảng rỗng
            if (n <= 0) {
                throw new RuntimeException("Mảng không có phần tử nào");
            }
            // Nhập giá trị cho mảng
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            //Tính giá trị trung bình
            double average = calculateAverage(arr);
            System.out.println("Giá trị trung bình của mảng là: " + average);
        } catch (RuntimeException e) {
            // Xử lý ngoại lệ nếu mảng không có phần tử
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Phương thức tính giá trị trung bình của mảng
    private static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
