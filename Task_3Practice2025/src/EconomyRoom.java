
public class EconomyRoom extends Room {
    public EconomyRoom(int roomNumber, int pricePerNight) {
        super(roomNumber, (int)(Math.random() * 2) + 4, pricePerNight);
    }
}