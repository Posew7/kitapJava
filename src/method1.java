
import java.util.Scanner;

public class method1 {

    public static void buyukSayiyiGoster(int _a, int _b) {
        System.out.println("büyük sayı : " + Math.max(_a, _b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("birinci sayıyı giriniz");
        a = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        b = input.nextInt();
        buyukSayiyiGoster(a, b);
    }
}
