
import java.util.Scanner;

public class faktoriyel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("faktoriyeli alınacak sayıyı giriniz");
        int a = input.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= a; i++) {
            faktoriyel *= i;
        }
        System.out.println(a + "nın faktöriyeli : " + faktoriyel);
    }

}
