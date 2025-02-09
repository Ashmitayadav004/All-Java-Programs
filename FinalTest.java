import java.util.List;

public class FinalTest {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "4");
        numbers.stream()
                .map(Integer::parseInt)
                .map(num -> Math.pow(num, 2))
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);
    }
}
