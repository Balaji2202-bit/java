import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
public class ArraySpliterator
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        IntStream stream =  Arrays.stream(numbers);

        Spliterator<Integer> spliterator = stream.spliterator();

        spliterator.forEachRemaining(System.out::println);
    }
}

