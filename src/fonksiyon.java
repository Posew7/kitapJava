
import java.util.Scanner;

public class fonksiyon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;
        int fxy = 0;

        System.out.println("x değerini girin");
        x = input.nextInt();
        System.out.println("y değerini girin");
        y = input.nextInt();

        if (x > 0 && y < 0) {
            fxy = 4 * x + 2 * y + 4;
        } else if (x > 0 && y == 0) {
            fxy = 2 * x - y - 3;
        } else if (x < 0 && y > 0) {
            fxy = 3 * x + 4 * y + 3;
        }

        System.out.println("fxy : " + fxy);

    }

}
