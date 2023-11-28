import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //1. Given a list of integers, create a new list that contains only the even numbers. Use streams to achieve this.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);



        //2. Using a list of strings, find and print the longest string using Java streams.
        List<String> strings = Arrays.asList("Ion", "Andrei", "Gheorghe", "Sorin", "Petronela");

        String longestString = strings.stream()
                .max((a1, a2) -> Integer.compare(a1.length(), a2.length()))
                .orElse(null);

        System.out.println("Original list: " + strings);
        System.out.println("Longest string: " + longestString);



        //3. Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.
//        class PrimeNumbers {
//            public static void main(String[] args) {
//                IntStream numbers = IntStream.rangeClosed(1, 100);
//
//                IntStream primeNumbers = numbers.filter(PrimeNumbers::isPrime);
//
//                System.out.println("Prime numbers from 1 to 100: ");
//                primeNumbers.forEach(System.out::println);
//            }
//
//            private static boolean isPrime(int number) {
//                return number > 1 &&
//                        IntStream.range(2, (int) Math.sqrt(number) + 1)
//                                .noneMatch(i -> number % i == 0);
//            }
//        }


        //4. Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma.
        List<String> stringList = Arrays.asList("Andrei", "Sorin", "Ion");

        String concatenatedString = stringList.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Original list: " + stringList);
        System.out.println("Concatenated string list: " + concatenatedString);




        //5. Given a list of people (a class) with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.




    }
}

