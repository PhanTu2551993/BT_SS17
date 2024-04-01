import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bt_4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập chuỗi cần chuyển đổi:");
            String input = scanner.nextLine();

            List<Integer> integerList = new ArrayList<>();

            for (int i = 0; i < input.length(); i++) {
                try {
                    int number = Integer.parseInt(String.valueOf(input.charAt(i)));
                    integerList.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Ký tự '" + input.charAt(i) + "' không phải là số nguyên, đã được thay thế bằng 0.");
                    integerList.add(0);
                }
            }

            System.out.print("Chuỗi đã chuyển đổi thành số nguyên: ");
            for (int number : integerList) {
                System.out.print(number + " ");
            }
        }


}
