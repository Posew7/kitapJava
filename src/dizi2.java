
import java.util.Scanner;

public class dizi2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dizi[] = new int[10];

        System.out.println("10 tane değer giriniz");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = input.nextInt();
        }
        System.out.println("10 değer girildi\n"
                + "****************************\n");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi["+i+"] = "+dizi[i]);
        }
    
    }

}
