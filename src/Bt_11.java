import java.util.Scanner;

public class Bt_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập vào ngày, tháng, năm từ người dùng
        System.out.println("Nhập ngày:");
        int day = scanner.nextInt();
        System.out.println("Nhập tháng:");
        int month = scanner.nextInt();
        System.out.println("Nhập năm:");
        int year = scanner.nextInt();

        try {
            //Kiểm tra tính hợp lệ của ngày tháng năm
            if (year <= 0 || month < 1 || month > 12 || day < 1 || day > numberOfDaysInMonth(month, year)) {
                throw new Exception("Ngày tháng năm không hợp lệ.");
            }
            //Hiển thị thông báo nếu ngày tháng năm hợp lệ
            System.out.println("Ngày tháng năm hợp lệ.");
        } catch (Exception e) {
            //Xử lý ngoại lệ và hiển thị thông báo lỗi
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
    // Hàm tính số ngày trong một tháng của một năm nhất định
    public static int numberOfDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
