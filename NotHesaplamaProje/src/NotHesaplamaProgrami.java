
import java.util.Scanner;

public class NotHesaplamaProgrami {
    public static void main(String[] args) {
        //Ders isimlerini integer olarak tanımla

        int mat,fizik,turkce,kimya,tarih,muzik;

        //Scanner sınıfını tanımla

        Scanner inp = new Scanner(System.in);

        //Ders notlarını giriniz
        System.out.print("Matematik notunuzu giriniz : ");
        mat= inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik= inp.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce= inp.nextInt();

        System.out.print("Kımya notunuzu giriniz : ");
        kimya= inp.nextInt();

        System.out.print("Tarıh notunuzu giriniz : ");
        tarih= inp.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik= inp.nextInt();

        int toplam = (mat+muzik+kimya+tarih+fizik+turkce);

        double sonuc = toplam/6.0;
        System.out.println("Ders notları ortalamanız:"+sonuc);

        System.out.println(sonuc >= 60.0 ? "Sınıfı geçti" : "Sınıfta kaldı");



    }
}