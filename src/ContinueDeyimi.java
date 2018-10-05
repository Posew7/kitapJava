
public class ContinueDeyimi {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println("x = " + i);
        }

        for (int y = 0; y < 8; y++) {

            for (int z = 0; z < 6; z++) {

                if (z == 4) {
                    continue;
                }

                System.out.println("z = " + z);

            }
            System.out.println("döngü pas geçildiğinden ekrana birşey yazdırılmıyor");
            System.out.println("y = " + y);
        }
    }
}
