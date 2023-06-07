import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int count = 0;
        int num = 2;
        System.out.println("20 số nguyên tố đầu tiên:");
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}