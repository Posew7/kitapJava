
import java.util.Scanner;

public class dizi9 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        String dizi[][] = new String[2][3];

        for (int satir = 0; satir < dizi.length; satir++) {
            for (int sutun = 0; sutun < dizi[satir].length; sutun++) {
                dizi[satir][sutun] = input.nextLine();
            }
        }
        for (int satir = 0; satir < dizi.length; satir++) {
            for (int sutun = 0; sutun < dizi[satir].length; sutun++) {
                System.out.print(dizi[satir][sutun] + " ");
            }
            System.out.println();
        }
        long bitis = System.currentTimeMillis();
        long sonuc = (bitis-start)/1000;
        System.out.println(sonuc+" saniye sürdü");
    }

}
