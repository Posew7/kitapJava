
import java.util.Scanner;

public class dizi3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 ile 12 arasında bir sayı giriniz");
        String ay[] = {"ocak", "şubat", "mart", "nisan", "mayıs", "haziran", "temmuz", "ağustos", "eylül", "ekim", "kasım", "aralık"};

        while (true) {
            int a = input.nextInt();
            if (a > 0 && a <= 12) {
                System.out.println(ay[a - 1] + " ayı");
                break;
            } else {
                System.out.println("yanlış değer girdiniz\n"
                        + "tekrar deneyiniz");
            }
        }

    }

}
