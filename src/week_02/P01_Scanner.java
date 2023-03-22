package week_02;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        **       KAYIT BAŞARILI      **
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
        */

        Scanner scan = new Scanner(System.in);
        //System.out.println("Lutfen adinizi giriniz: ");
        //String name = scan.nextLine();
        //System.out.println("Lutfen soyadinizi giriniz :");
        //String surname = scan.nextLine();
        //System.out.println("Lutfen yasinizi giriniz: ");
        //int yas = scan.nextInt();
        //System.out.println("Lutfen e-posta adresinizi giriniz: ");
        //String mail = scan.next();
        //System.out.println("Lutfen bir sifre belirleyiniz: ");
        //String sifre = scan.next();

        //System.out.println("*****       KAYIT BASRILI       *****");
        //System.out.println("Adiniz: " + name);
        //System.out.println("Soyadiniz: " + surname);
        //System.out.println("Yasiniz: " + yas);
        //System.out.println("Mail Adresiniz: " + mail);
        //System.out.println("Sifreniz: " + sifre);
        //System.out.println("sistemimize kaydınız başarıyla tamamlanmıştır.");
        //System.out.println("===========================================");


        /*
            Yukarıda aldığınız bilgileri
            Kullanıcı : T.Yiğit, 42
            şeklinde yazdırın
        */

        //System.out.println("Kullanıcı : " +name.charAt(0)+"."+surname+", "+yas);

        /*
            2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
            üçgenin alanını hesaplayıp yazdırın

        */

        //int a = 100, h = 120;
        //System.out.println("ucgenin alani: "+ (a*h/2));


        /*
            3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
            değiştirin (Swap)
         */

        System.out.println("Lutfen 2 adet sayi giriniz: ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("1. sayi olarak: " + sayi1 + " girdiniz.");
        System.out.println("2. sayi olarak: " + sayi2 + " girdiniz.");
        System.out.println("---------- HOKUS POKUS -----------");
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println(" 1. sayi: " + sayi1 + "\n 2. sayi: " + sayi2);



    }
}
