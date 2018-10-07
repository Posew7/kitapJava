
public class dizi7 {

    public static void main(String[] args) {
        int dizi[] = {1, 3, 2, 12, 54, 7, 2};
        diziDegis(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }

    public static void diziDegis(int dizi[]) {
        dizi[0] = 123;
        dizi[1] = 345;
    }

}
