//import java.util.Arrays;
//import java.util.List;
//public class Final{
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(5, 3, 6, 1, 2, 4);
////        List<Integer> sortedNumbers =
////                numbers.stream().sorted().collect(Collectors.toList());
//        numbers.forEach(number -> System.out.print(number + " "));
//    }
// }

public class Parent {
    public int cal(int a, int b) {
        return a + b;
    }
}
class Child extends Parent {
    @Override
    public int cal(int a, int b) {
        return a * b;
    }
}