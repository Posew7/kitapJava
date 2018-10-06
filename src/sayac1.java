
public class sayac1 {

    public static void main(String[] args) {
        int sayac = 0;
        int toplam = 0;

        do {
            toplam += sayac;
            sayac++;
        } while (sayac <= 100);

        System.out.println("toplam : " + toplam);
    }
}
