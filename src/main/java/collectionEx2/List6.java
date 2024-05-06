package collectionEx2;

import java.util.Scanner;

public class List6 {
    public static int binarySearch(int[] array, int left, int right, int target){
        while (left <= right){
            int mid = left + (right - left)/2;
            if (array[mid] == target){
                return mid;
            }
            if (array[mid] < target){
                left = mid + 1;
            }
            if (array[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the left index: ");
        int left = scanner.nextInt();
        System.out.print("Enter the right index: ");
        int right = scanner.nextInt();
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        int index = binarySearch(array, left, right, target);
        if (index == -1) {
            System.out.println("Index not found.");
        } else {
            System.out.println("Index " + index + ".");
        }
    }
}