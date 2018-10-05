
public class IfElseYapisi2 {

    public static void main(String[] args) {

        int puan = 85;
        char sonuc;

        if (puan >= 88) {
            sonuc = 'a';
        } else if (puan <= 90) {
            sonuc = 'b';
        } else if (puan == 88) {
            sonuc = 'c';
        } else {
            sonuc = 'd';
        }
        System.out.println("sonuc "+sonuc);
    }
}