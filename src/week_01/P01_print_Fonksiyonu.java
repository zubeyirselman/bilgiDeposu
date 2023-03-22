package week_01;

public class P01_print_Fonksiyonu {
    public static void main(String[] args) {

        /*soru1: Konsola Hello World ve "Hello World" yazdiriniz.
         */

        System.out.println("Hello World");
        System.out.println("\"Hello World\"");

        /*
        soru2: Konsola: "Hello   \
        'World' \/"  yazdirin.
         */

        /*
        \n : bir alt satirdan yazmaya devam eder.
        \t : 1 TAB bosluk birakir.
        \" : " yazar.
        \' : ' yazar.
        \\ : \ yazar.
        \/ : / yazar.
         */

        System.out.println("========================");
        System.out.println("\"Hello\t\\\n\'World\'\t\\/\"");

        /*
        soru3: deger atayarak; Tarik Yigit - QA Software Test Engineer yazdirin.
         */

        String isim= "Tarik";
        String soyisim= "Yigit";
        String meslek= "QA Software Test Engineer";

        System.out.println(isim+" " + soyisim+ " - " + meslek); //Tarik Yigit - QA Software Test Engineer









    }
}