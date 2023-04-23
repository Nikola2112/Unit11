import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args){
        String[] arr = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);

    }

}
