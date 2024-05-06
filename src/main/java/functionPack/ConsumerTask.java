package functionPack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTask {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(5,15,25,35,45);

        Consumer<List<Integer>> averageSum = nums -> {
            int sum = 0;
            for (Integer num : nums){
                sum += num;
            }
            double average = (double) sum / nums.size();
            System.out.println(average);
        };

        averageSum.accept(number);
    }
}