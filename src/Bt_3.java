public class Bt_3 {
        public static void main(String[] args) {
            String[] input = {"1", "5", "22", "a","12"};
            int sum = 0;
            for (String str : input) {
                try {
                    int number = Integer.parseInt(str);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.err.println("Có ký tự không phải số nguyên trong mảng");
                    return;
                }
            }
            System.out.println("Tổng của các số nguyên trong mảng là: " + sum);
        }
}
