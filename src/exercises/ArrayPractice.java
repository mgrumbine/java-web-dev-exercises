package exercises;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 5, 8};

        for (int i : numbers) {
            System.out.println(i);
        }

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 1) {
                System.out.println(numbers[index]);
            }
        }

        String passage = "I would not, could not, in a box. I would not, could " +
                "not with a fox. I will not eat them in a house. I will not eat" +
                " them with a mouse.";
        String[] passageSplitBySpace = passage.split(" ");
        String[] passageSplitByPeriod = passage.split("\\.");
        System.out.println(Arrays.toString(passageSplitBySpace));
        System.out.println(Arrays.toString(passageSplitByPeriod));

    }
}
