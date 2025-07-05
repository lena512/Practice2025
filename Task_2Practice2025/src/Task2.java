import java.lang.reflect.Array;
import java.util.*;
public class Task2 {
    public static void main(String[]args){
        //Список с названиями моделей машин и дубликатами
        List<String> models = new ArrayList<>(Arrays.asList(
                "VW Touareg","Nissan Micra","Ford Ecosport",
                "Hyundai Sonata","Ford Focus","Tesla Model S",
                "Skoda Felicia","Skoda Felicia"
        ));
        // Удаление дубликатов
        Set<String> uniqueModels = new HashSet<>(models);
        List<String> uniqueList = new ArrayList<>(uniqueModels);

        // Сортировка в обратном алфавитном порядке
        uniqueList.sort(Collections.reverseOrder());
        System.out.println("Уникальные модели (обратный порядок):");
        uniqueList.forEach(System.out::println);

        // Замена Tesla на ELECTRO_CAR
        Set<String> finalSet = new TreeSet<>(Collections.reverseOrder());
        for (String model : uniqueList) {
            if (model.contains("Tesla")) {
                finalSet.add("ELECTRO_CAR");
            } else {
                finalSet.add(model);
            }
        }

        System.out.println("Результат в Set:");
        finalSet.forEach(System.out::println);
    }
}
