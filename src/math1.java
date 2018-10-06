
import java.util.Random;

public class math1 {

    public static void main(String[] args) {

        Random rand = new Random();

        int a = rand.nextInt(50) + 1;
        int b = rand.nextInt(50) + 1;

        System.out.println("büyük olan : " + Math.max(a, b));
        System.out.println("küçük olan : " + Math.min(a, b));
    }

}
