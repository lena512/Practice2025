public class Main {
    public static void main(String[] args) {
        // Создаем сервис для стандартных комнат
        RoomService<StandardRoom> standardService = new RoomServiceImpl<>();
        StandardRoom standardRoom = new StandardRoom(101, 50);

        // Тестируем сервис
        standardService.clean(standardRoom);
        standardService.reserve(standardRoom);

        try {
            standardService.reserve(standardRoom); // Должно выбросить исключение
        } catch (RoomAlreadyBookedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        standardService.free(standardRoom);

        // Создаем сервис для люксовых комнат
        RoomService<LuxRoom> luxService = new RoomServiceImpl<>();
        UltraLuxRoom ultraLuxRoom = new UltraLuxRoom(201, 100);

        // Тестируем сервис
        luxService.clean(ultraLuxRoom);
        luxService.reserve(ultraLuxRoom);
        luxService.free(ultraLuxRoom);
    }
}