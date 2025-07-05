import java.util.*;
//Создайте класс Car с полями: VIN, модель, производитель, год
//выпуска, пробег, цена
class Car {
    private String vin;
    private String model;
    private String manufacturer;
    private int year;
    private int mileage;
    private double price;

    public Car(String vin, String model, String manufacturer,
               int year, int mileage, double price) {
        this.vin = vin;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
//Переопределите equals и hashCode, чтобы две машины
//считались одинаковыми только при совпадении VIN.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return vin.hashCode();
    }

    // Геттеры
    public String getVin() { return vin; }
    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public int getYear() { return year; }
    public int getMileage() { return mileage; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return manufacturer + " " + model + " (" + year + ")";
    }
}
//Добавьте в HashSet несколько машин (включая дубликаты по
//VIN) и убедитесь, что дубликаты не добавляются.
public class Task3 {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();

        Car car1 = new Car("VIN1", "Camry", "Toyota", 2020, 30000, 25000);
        Car car2 = new Car("VIN2", "X5", "BMW", 2021, 15000, 45000);
        Car car3 = new Car("VIN1", "Corolla", "Toyota", 2019, 40000, 20000);

        System.out.println("Добавление car1: " + carSet.add(car1));
        System.out.println("Добавление car2: " + carSet.add(car2));
        System.out.println("Добавление car3 (дубликат VIN): " + carSet.add(car3));

        System.out.println("Машины в HashSet:");
        carSet.forEach(System.out::println);
    }
}