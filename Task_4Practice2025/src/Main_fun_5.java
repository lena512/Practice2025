import java.util.function.Function;

public class Main_fun_5 {
    public static void main(String[] args) {
        Function<Integer, String> numberCheck = num -> {
            if (num > 0) return "Положительное число";
            else if (num < 0) return "Отрицательное число";
            else return "Ноль";
        };

        System.out.println(numberCheck.apply(5));    // Положительное число
        System.out.println(numberCheck.apply(-3));   // Отрицательное число
        System.out.println(numberCheck.apply(0));    // Ноль
    }
}