
public class BirdenFazlaIfDeyimi {

    public static void main(String[] args) {

        int yas = 25;
        int dogumTarihi = 1985;

        if (yas == 25 && dogumTarihi == 1985) {
            System.out.println("yazılanlar tamamiyle doğrudur");
        }
        if (yas == 25 && dogumTarihi == 1990) {
            System.out.println("yazılanlar tamamiyle doğrudur");
        }
        if (yas == 25 || dogumTarihi == 1990) {
            System.out.println("yazılanlar tamamiyle doğrudur");
        }
    }

}
