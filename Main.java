public class Main {

    // Phương thức kiểm tra số chẵn/lẻ
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " la so chan";
        } else {
            return number + " la so le";
        }
    }

    public static void main(String[] args) {

        // Vòng lặp
        for (int i = 1; i <= 10; i++) {
            System.out.println(checkEvenOdd(i));
        }
    }
}