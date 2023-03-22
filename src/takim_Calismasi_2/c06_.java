package takim_Calismasi_2;

import java.util.Arrays;

public class c06_ {
    public static void main(String[] args) {

        // Bir array' de istedigimiz index' teki elementi yazdiran bir method olusturun.

        int[] arr = {2,3,4,5,5};

        indexBulma(arr, 3);


    }

    public static void indexBulma(int[] arr, int istenenIndex) {

        int index = 3;

        for (int i = 0; i <arr.length ; i++) {
            if (istenenIndex == arr[i]){
                System.out.println(arr[i]);
                break;
            }
        }

        if (index == -1) {
            System.out.println("Dizide aranan öğe bulunamadı.");
        } else {
            System.out.println("Dizide aranan öğe " + istenenIndex + ". indekste bulundu.");
        }

    }
}