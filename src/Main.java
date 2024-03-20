import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(6, 6, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);

        int prewNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != prewNum) {
                System.out.print(num);
                prewNum = num;
            }
        }
    }

    public static void task3() {
        Set<String> uniqueStrings = new HashSet<>(strings);
        System.out.println(uniqueStrings);
    }

    public static void task4() {
        Set<String> uniqueStrings = new HashSet<>(strings);
        System.out.print(strings.size()-uniqueStrings.size());

    }
}