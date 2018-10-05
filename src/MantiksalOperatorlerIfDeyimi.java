
public class MantiksalOperatorlerIfDeyimi {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int c = 4;

        if (a == b && b == c) {
            System.out.println("üçgenimiz eşkenar üçgendir");
        }
        if (a == b || b == c) {
            System.out.println("üçgenimiz ikizkenar üçgendir");
        }
        if (a != b && b == c) {
            System.out.println("üçgenimiz ikizkenardır");
        }
    }
}
