
public class string1 {

    public static void main(String[] args) {
        String takim = "fenerbahçe";
        
        System.out.println("fenerbahçenin karakter uzunluğu : "+takim.length());
        System.out.println("indisi 7 olan karakter : "+takim.charAt(7));
        System.out.println(takim.substring(5, 9));
        System.out.println("e karakterinin 1. indisi : "+takim.indexOf("e"));
        System.out.println("e karakterinin 2. indisi : "+takim.indexOf("e", 2));
        System.out.println("f ile ş yer değiştir : "+takim.replace("f", "ş"));
        System.out.println("tüm harfler büyük : "+takim.toUpperCase());
        
        String takim2 = "1907";
        System.out.println("integer'a çevirelim : "+Integer.parseInt(takim2));
        
    }
    
}
