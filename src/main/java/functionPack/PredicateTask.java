package functionPack;

import java.util.function.Predicate;

public class PredicateTask {
    public static void main(String[] args) {

        Predicate<Integer> legalSalary = wage -> wage >= 365;
        Predicate<Integer> illegalSalary = wage2 -> wage2 <= 365;

        boolean result = legalSalary.test(255);
        System.out.println(result);
        boolean result2 = illegalSalary.test(244);
        System.out.println(result2);
    }
}