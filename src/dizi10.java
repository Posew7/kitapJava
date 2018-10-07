
import java.util.Random;
import java.util.Arrays;

public class dizi10 {

    public static void main(String[] args) {

        int dizi[] = new int[11];
        Random rand = new Random();

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(33) + 1;
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("");
        Arrays.sort(dizi);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }

    }

}
