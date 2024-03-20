import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(6, 6, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    public static void main(String[] args) {

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0 ) {
                System.out.print(nums.get(i));
            }
        }

    }
}