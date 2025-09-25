import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        //Stream Api in java
//        List<Integer> numbers = Arrays.asList(2,4,5,1,6,7);
//        numbers.stream()
//                .filter(n -> n%2==1)
//                .map(n -> n*2).sorted()
//                .forEach(n -> System.out.println(n));
//        Stream<Integer> sorted = stream.sorted();
//        Long count = stream.count();
//        System.out.println(sorted);
//        sorted.forEach(n -> System.out.println(n));

        List<List<String>> listOfNames = Arrays.asList(
                Arrays.asList("Akhil" , "Aditya" , "Aman" , "Anurag"),
                Arrays.asList("Nikhil" , "Nilesh" , "Nikku" , "Neela"),
                Arrays.asList("Rahul" , "Rohit" , "Raina" , "Ramesh")
        );

        Set<String> result1 = new HashSet<>();

        List<String> result = listOfNames.stream()
                              .flatMap(List::stream)
                              .filter(s -> s.startsWith("A"))
                              .map(String::toUpperCase)
                              .distinct()
                              .peek(s -> result1.add(s))
                              .sorted()
                              .collect(Collectors.toUnmodifiableList());

        System.out.println("result1");
        result.forEach(System.out::println);
        System.out.println("result");
        result.forEach(System.out::println);

    }
}
