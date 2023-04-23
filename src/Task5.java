import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args){
        Stream<Integer> first = Stream.of(1, 2, 3, 4);
        Stream<Integer> second = Stream.of(5, 6, 7, 8);
        Stream<Integer> zipped = Task5.zip(first, second);
        zipped.forEach(System.out::println); // Output: 1 5 2 6 3 7 4 8
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> result = new ArrayList<>();
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();

        int size = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < size; i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }
        return result.stream();
    }
}
