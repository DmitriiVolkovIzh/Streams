import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(2, 23, 56, 543, 76, 29, 210)).stream()
                .filter(e -> e % 2 == 0);
        stream.forEach(System.out::println);
    }
}