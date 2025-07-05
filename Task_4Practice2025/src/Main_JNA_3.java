import java.util.function.Predicate;

public class Main_JNA_3 {
    public static void main(String[] args) {
        Predicate<String> startsWithJorN = s -> s.startsWith("J") || s.startsWith("N");
        Predicate<String> endsWithA = s -> s.endsWith("A");
        Predicate<String> combined = startsWithJorN.and(endsWithA);

        System.out.println(combined.test("Java"));    // false (не заканчивается на A)
        System.out.println(combined.test("JavaA"));   // true
        System.out.println(combined.test("NovaA"));   // true
        System.out.println(combined.test("Hello"));   // false
    }
}