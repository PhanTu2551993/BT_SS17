
import java.util.Arrays;
import java.util.Scanner;
public class Bt_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Nhập dữ liệu
            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = Integer.parseInt(scanner.nextLine());
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(scanner.nextLine());
            }
            //Sắp xếp mảng
            System.out.println("Mảng sau khi được sắp xếp");
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.print("Nhập phần tử cần tìm kiếm: ");
            int inputNumber = Integer.parseInt(scanner.nextLine());
            // Tìm kiếm nhị phân
            try {
                int resultIndex = binarySearch(arr, inputNumber);
                // Xử lý kết quả
                if (resultIndex != -1) {
                    System.out.println("Phần tử " + inputNumber + " được tìm thấy tại vị trí " + resultIndex);
                } else {
                    throw new Exception("Phần tử " + inputNumber + " không được tìm thấy trong mảng.");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        // Phương thức tìm kiếm nhị phân
        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Nếu phần tử được tìm kiếm nằm ở giữa
                if (arr[mid] == target) {
                    return mid;
                }
                // Nếu phần tử được tìm kiếm nằm ở bên trái của mid
                else if (arr[mid] > target) {
                    right = mid - 1;
                }
                // Nếu phần tử được tìm kiếm nằm ở bên phải của mid
                else {
                    left = mid + 1;
                }
            }

            // Trả về -1 nếu không tìm thấy phần tử trong mảng
            return -1;
        }


}
