package collectionEx2;

import java.util.Random;

public class List5 {
    public class ShuffleList {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.print("Əvvəlki sıra: ");
            printArray(arr);

            shuffleArray(arr);
            System.out.println("Qarışdırılmış sıra: ");
            printArray(arr);
        }

        static void shuffleArray(int[] arr) {
            Random rand = new Random();
            for (int i = arr.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                int mixer = arr[i];
                arr[i] = arr[j];
                arr[j] = mixer;
            }
        }

        static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}