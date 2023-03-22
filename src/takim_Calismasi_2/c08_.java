package takim_Calismasi_2;

import java.util.Scanner;

public class c08_ {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] arr = {1, 5, 9, 12, 15, 18, 21, 24, 27, 30}; // Örnek bir dizi

        System.out.print("Dizide aranacak öğe: ");
        int aranan = input.nextInt();

        int indeks = -1; // Varsayılan olarak öğenin dizide bulunmadığını gösterir

        // Dizideki öğe bulunana kadar veya dizi tamamen taranana kadar devam eden bir döngü
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aranan) {
                indeks = i;
                break; // Öğe bulundu, döngüyü sonlandır
            }
        }

        // Öğenin dizide bulunup bulunmadığına göre farklı çıktılar veren kod blokları
        if (indeks == -1) {
            System.out.println("Dizide aranan öğe bulunamadı.");
        } else {
            System.out.println("Dizide aranan öğe " + indeks + ". indekste bulundu.");
        }
    }
}
