package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Removing {
    public static int[] removeElement(int[] nums, int val) {
        int[] newNums = new int[nums.length];
        int count = 0;

        for (int num : nums) {
            if (num != val) {
                newNums[count++] = num;
            }
        }
        return Arrays.copyOf(newNums, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Enter a elements of array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter a value: ");
        int val = scanner.nextInt();

        int[] array2 = removeElement(array, val);
        System.out.println(Arrays.toString(array2) + " " + array2.length);
    }
}
