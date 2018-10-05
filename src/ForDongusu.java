
public class ForDongusu {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("sayı = " + i);
        }

        for (int a = 5, b = 6; a * b < 50; a++, b += 3) {
            System.out.println("a değişkeninin ilk değeri : " + a);
            System.out.println("b değişkenin ilk değeri : " + b);
            System.out.println("çarpma işleminin sonucu : " + a * b);
        }
    }
}
