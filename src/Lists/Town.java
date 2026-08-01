package Lists;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Town {
    private String name;
    private int distanceFromSydney;

    // 1. toString ekleyelim ki ekrana "Town@15db9742" yerine isim yazsın
    @Override
    public String toString() { return name + " (" + distanceFromSydney + " km)"; }

    public Town(String name, int distanceFromSydney) {
        this.name = name;
        this.distanceFromSydney = distanceFromSydney;
    }

    // Sınıf seviyesinde tanımladık
    private static LinkedList<Town> list = new LinkedList<>();
    private static ListIterator<Town> iterator = list.listIterator();

    public static void setupTowns() {
        list.add(new Town("Sydney", 0));
        list.add(new Town("Adelaide", 1374));
        list.add(new Town("Alice Springs", 2771));
        list.add(new Town("Brisbane", 917));
        list.add(new Town("Darwin", 3972));
        list.add(new Town("Melbourne", 877));
        list.add(new Town("Perth", 3923));
        // Yeni iterator'ı tekrar tanımlama, sadece referansı güncelle
        iterator = list.listIterator();
    }

    public static void forward() {
        if (iterator.hasNext()) System.out.println("İleri: " + iterator.next());
        else System.out.println("Listenin sonu.");
    }

    public static void backward() {
        if (iterator.hasPrevious()) System.out.println("Geri: " + iterator.previous());
        else System.out.println("Listenin başı.");
    }

    public static void main(String[] args) {
        setupTowns(); // Önce şehirleri kurmalıyız!
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Sisteme hoş geldin! (F)orward, (B)ackward, (L)ist, (Q)uit");
        
        while(running) {
            System.out.print("İşlem seç: ");
            String input = sc.nextLine().toLowerCase();
            switch(input) {
                case "f" -> forward();
                case "b" -> backward();
                case "l" -> System.out.println(list);
                case "q" -> running = false;
                default -> System.out.println("Geçersiz işlem!");
            }
        }
    }
}