
import java.util.Scanner;

public class dizi13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dizi[][] = new int[3][5];

        for (int satir = 0; satir < dizi.length; satir++) {
            for (int sutun = 0; sutun < dizi[satir].length; sutun++) {
                dizi[satir][sutun] = input.nextInt();
            }
        }
        for (int satir = 0; satir < dizi.length; satir++) {
            for (int sutun = 0; sutun < dizi[satir].length; sutun++) {
                System.out.print(dizi[satir][sutun] + " ");
            }
            System.out.println();
        }
    }

}
