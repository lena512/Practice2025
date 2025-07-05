public class StandardRoom extends ProRoom {
    public StandardRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, (int)(Math.random() * 3) + 1, pricePerNight); // 1-3 человека
    }
}
