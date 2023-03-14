import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenlerimizi Oluşturalım.
        double a, b, c, alan, cevre, u;

        // Kullanıcıdan Verilerimizi Alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextDouble();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextDouble();
        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextDouble();
        cevre = (a + b + c);
        u = (cevre / 2);
        alan = u * (u - a) * (u - b) * (u - c);
        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);
    }
}