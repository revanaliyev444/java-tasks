package leetCode;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Frequency {
    public static int maxFrequency(int[] num){
        Map<Integer, Long> frequency = Arrays.stream(num)
                .boxed()
                .collect(Collectors.toMap(
                        key -> key,
                        value -> 1L,
                        Long::sum));

        Long maxFreq = frequency.values().stream()
                .max(Long::compare)
                .orElse(0L);
        long countFreq = frequency.values().stream()
                .filter(s -> s.equals(maxFreq))
                .count();
        return (int) countFreq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(maxFrequency(nums));

    }
}