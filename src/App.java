import java.util.List;

import static java.util.stream.Collectors.*;

public class App {

    static MinMax getMinMax(List<Integer> numbers) {
        return numbers
                .stream()
                .collect(collectingAndThen(
                        summarizingInt(x -> x),
                        MinMax::fromIntStatistics
                ));
    }

    public static void main(String[] args) {
        var numbers = List.of(11, 44, 22, 55, 33);
        System.out.println(getMinMax(numbers));
    }
}
