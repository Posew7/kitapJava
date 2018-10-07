
import java.util.Random;

public class dizi8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] tablo = new int[5][4];
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                tablo[satir][sutun] = rand.nextInt(100);

            }
        }
        for (int satir = 0; satir < tablo.length; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {
                System.out.print(tablo[satir][sutun] + " ");
            }
            System.out.println(" ");
        }
    }

}
