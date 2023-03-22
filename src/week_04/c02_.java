package week_04;

public class c02_ {
    public static void main(String[] args) {

        // Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.

        int sayi1 = 155;
        int sayi2 = 27;

       int sonuc = sayi1<sayi2 ? sayi1 : sayi2 ;
        System.out.println(sonuc);



        int sayi = 3415;

        if (sayi>99 && sayi<1000){
            System.out.println("Bu sayı 3 basamaklıdır");
        } else {
            System.out.println("Bu sayı 3 basamaklı degildir.");
        }




    }
}
