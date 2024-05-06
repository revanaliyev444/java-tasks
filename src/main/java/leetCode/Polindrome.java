package leetCode;

import java.util.Scanner;

public class Polindrome {
    public static boolean isPolindrome(int x){
        if (x < 0){
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0){
            int last = x % 10;
            reversed = reversed * 10 + last;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(isPolindrome(num));
    }
}
