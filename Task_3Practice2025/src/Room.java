// Создать класс Room с следующими полями:
//● Целочисленное, номер комнаты
//● Целочисленное, максимальное количество человек в комнате
//● Целочисленное, цена за ночь
//● Логическое, забронирована ли комната
//Добавить конструкторы
public abstract class Room {
    private int roomNumber;
    private int maxCapacity;
    private int pricePerNight;
    private boolean isBooked;

    public Room(int roomNumber, int maxCapacity, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.maxCapacity = maxCapacity;
        this.pricePerNight = pricePerNight;
        this.isBooked = false;
    }

    // Геттеры и сеттеры
    public int getRoomNumber() {
        return roomNumber;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
}
