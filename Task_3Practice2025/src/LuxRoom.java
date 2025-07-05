public abstract class LuxRoom extends ProRoom {
    public LuxRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, (int)(Math.random() * 4) + 2, pricePerNight); // 2-5 человек
    }
}