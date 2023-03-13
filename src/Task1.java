import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> items = stream.sorted(order).collect(Collectors.toList());
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    public static void main(String[] args) {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(2, 23, 56, 543, 76, 29, 210)).stream();
        findMinMax(
                stream,
                Integer::compareTo,
                (x, y) -> System.out.printf("min: %s, max: %s%n", x, y)
        );
        stream.close();
    }
}