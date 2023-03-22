package takim_Calismasi_2;

import java.util.Arrays;

public class c04_ {
    public static void main(String[] args) {

        // Dizi elemanlarının ortalama değerini hesaplayan bir Java programı yazınız.

        int [] arr = {2,4,5,6,3,3};


        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            toplam = toplam + arr[i];
        }
        double ort = toplam/ arr.length;
        System.out.println(toplam);
        System.out.println(ort);
    }
}
