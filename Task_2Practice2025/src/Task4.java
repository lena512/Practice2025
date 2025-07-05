import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        //Дан список машин (List<Car>):
        List<Car> cars = Arrays.asList(
                new Car("VIN1", "512 TR", "Ferrari", 2020, 30000, 25000),
                new Car("VIN2", "Thunderbird", "Ford", 2021, 45000, 45000),
                new Car("VIN3", "Divo", "Bugatti", 2019, 10000, 60000),
                new Car("VIN4", "Modus", "Renault", 2016, 55000, 30000),
                new Car("VIN5", "Corolla", "Toyota", 2017, 20000, 22000)
        );
// Отфильтруйте только машины с пробегом меньше 50_000 км
//(добавьте поле mileage).
        List<Car> filteredCars = cars.stream()
                .filter(car -> car.getMileage() < 50000)
                .collect(Collectors.toList());
        System.out.println("Машины с пробегом < 50000 км:");
        filteredCars.forEach(System.out::println);

//Отсортируйте по цене (по убыванию).
//Выведите топ-3 самые дорогие машины.
        System.out.println("\nТоп-3 самые дорогие машины:");
        cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice).reversed())
                .limit(3)
                .forEach(System.out::println);

//Посчитайте средний пробег всех машин.
        double avgMileage = cars.stream()
                .mapToInt(Car::getMileage)
                .average()
                .orElse(0);
        System.out.printf("\nСредний пробег: %.1f км%n", avgMileage);

//Сгруппируйте машины по производителю в Map<String,
//List<Car>>.
        Map<String, List<Car>> carsByManufacturer = cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer));
        System.out.println("\nМашины по производителям:");
        carsByManufacturer.forEach((maker, carList) -> {
            System.out.println(maker + ": " + carList);
        });
    }
}