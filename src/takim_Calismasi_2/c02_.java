package takim_Calismasi_2;

import java.util.Arrays;

public class c02_ {
    public static void main(String[] args) {

        // Bir dizinin değerlerini toplamak için bir Java programı yazın.

        int[] arr = {334,52,2,1,3};

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i];
        }

        System.out.println(toplam);

    }
}
