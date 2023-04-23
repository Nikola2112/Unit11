import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args){
        List<String> inputList = Arrays.asList("Ivan", "Peter", "Alex", "John", "Mark");
        List<String> sortedList = sortedUpperCase(inputList);
        System.out.println(sortedList);
        }
    public static List<String> sortedUpperCase(List<String> inputList) {
        return inputList.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}


