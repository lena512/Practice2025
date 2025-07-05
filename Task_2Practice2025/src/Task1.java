import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //массив, представляющий годы выпуска 50 случайных машин (от 2000 до 2025).
        int[] years = new int[50];
        Random random = new Random();
        for (int i = 0;i < years.length; i++){
            years[i] = 2000 + random.nextInt(26);
        }
        //Вывод только машин, выпущенные после 2015 года.
        System.out.println("Машины после 2015 года:");
        for (int year : years){
            if (year > 2015){
                System.out.println(year);
            }
        }
        //средний возраст авто.
        int sum = 0;
        for (int year : years) {
            sum += (2023 - year); // Текущий год - год выпуска
        }
        double averageAge = (double) sum / years.length;
        System.out.printf("Средний возраст: %.1f лет%n", averageAge);
    }

}



