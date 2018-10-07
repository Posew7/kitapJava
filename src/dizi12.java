
import java.util.ArrayList;

public class dizi12 {

    public static void main(String[] args) {
        ArrayList<String> dizi = new ArrayList<String>();
        dizi.add("alp");
        dizi.add("alper");
        dizi.add("akalın");
        dizi.add(2, "alperen");
        System.out.println("dizimizin boyutu : " + dizi.size());

        for (int i = 0; i < dizi.size(); i++) {
            System.out.println("indis [" + i + "] : " + dizi.get(i));
        }
        dizi.remove(3);
        for (int i = 0; i < dizi.size(); i++) {
            System.out.println("indis [" + i + "] : " + dizi.get(i));
        }
    }

}
