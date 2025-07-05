interface Printable {
    void print();
}

public class Main_print_1 {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Hello!!");
        printable.print();
    }
}