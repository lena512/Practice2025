import java.util.function.Predicate;

public class Main_empty_2 {
    public static void main(String[] args) {
        // 1. Проверка на null
        Predicate<String> isNotNull = s -> s != null;

        // 2. Проверка на пустоту
        Predicate<String> isNotEmpty = s -> !s.isEmpty();

        // 3. Комбинированная проверка
        Predicate<String> isValid = isNotNull.and(isNotEmpty);

        System.out.println(isValid.test(null));      // false
        System.out.println(isValid.test(""));        // false
        System.out.println(isValid.test("Hello"));    // true
    }
}