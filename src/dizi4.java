
public class dizi4 {

    public static void main(String[] args) {

        int dizi[] = new int[10];
        int toplam = 0;

        for (int i = 0; i < 10; i++) {
            dizi[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("dizi[" + i + "] = " + dizi[i]);
            toplam += dizi[i];
        }
        System.out.println("toplam : " + toplam);
    }

}
