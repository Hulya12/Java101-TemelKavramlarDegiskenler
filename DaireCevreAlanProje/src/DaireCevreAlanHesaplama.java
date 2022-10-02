import java.util.Scanner;

public class DaireCevreAlanHesaplama {
    public static void main(String[] args) {
        // pi ve r değerlerimizi tanımlayalım
        int r;
        double pi=3.14,cevre,alan;

        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz:");

        r= input.nextInt();

        // Değerlerimize göre alan ve çevrenin formullerini belirleyelim
        cevre=(2*pi*r);

        alan=(pi*r*r);

        System.out.println("Dairenin Çevresini Bulunuz:"+cevre);

        System.out.println("Dairenin Alanını Bulunuz:"+alan);

    }
}
