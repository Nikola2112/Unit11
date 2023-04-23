import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("Ivan", "Peter", "Alex", "John", "Mark");
    String result = oddIndexedNames(names);
    System.out.println(result); }// "1. Ivan, 3. Alex, 5. Mark"
    public static String oddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
