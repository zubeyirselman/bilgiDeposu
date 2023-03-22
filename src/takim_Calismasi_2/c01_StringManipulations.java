package takim_Calismasi_2;

import java.sql.SQLOutput;

public class c01_StringManipulations {
    public static void main(String[] args) {

        /* SORU1-
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
                Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb
        */

        String str = "MiAmi";
        //String str2 = "miAmI";

        str = str.toLowerCase();
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        //bu kısım ilk harfi buyuk yazdirir(M)        //bu kisimda ilk harften sonra kelimeyi yazdirir.(iami)

        System.out.println(str);

        System.out.println("          =========================================");

        /*SORU2-
            Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
         */

        String isim1 = "Ali Can";
        String isim2 = "Engin Altan Düzyatan";
        String isim3 = "Yakup Kadri Karaosmanoglu";


        int i1 = isim1.replaceAll("\\s", "").length();
        int i2 = isim2.replaceAll("\\s", "").length();
        int i3 = isim3.replaceAll("\\s", "").length();

        System.out.println("Bosluk karakterleri haric 3 isimdeki karakter sayilarinin toplami: " + (i1 + i2 + i3));

        System.out.println("          =========================================");

        /*SORU3:
            Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        konsolda yazdırınız.

         */


        String str2 = "jav9a c6and7ir";
        str2 = str2.replaceAll("[a-z ]", "");
        System.out.println(str2); // 967

        System.out.println("          =========================================");

        /*SORU4-
            Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
         */

        String ism = "java candir  ";
        int int1 = ism.trim().length() - 1;
        System.out.println(int1); //10

        String snc = ism.substring(int1);
        System.out.println(snc); // r


        System.out.println("          =========================================");


        /*SORU5-
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        toplamını bulunuz.
        */

        String strn = "Miami";
        int sonKrkIndex = strn.length() - 1;
        int ilkKrkAscii = strn.charAt(0);
        int sonKrkAscii = strn.charAt(sonKrkIndex);
        System.out.println("ilk ve son karakterlerin ASCII degerlerinin toplami: " + (ilkKrkAscii +
                sonKrkAscii));

        System.out.println("          =========================================");


        /*SORU6-
            Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
            büyük harfle yazdırınız.
            Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.

         */

        String s = "Java";
        Integer sonKrkIndx = s.length() - 1;
        String sonKrkDisindakiler = s.substring(0, sonKrkIndx).toUpperCase();
        System.out.println("son karakter disindaki tum karakterler buyuk harf ile : " + sonKrkDisindakiler);

        System.out.println("          =========================================");


        /*Soru7-
            Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
         */

        String str4 = "Vay be! Ali 13 yasinda ama universite ogrencisi.";

        str4= str4.replaceAll("[a-zA-Z0-9 ]", "");
        System.out.println(str4.length());


    }
}
