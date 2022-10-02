import java.util.Scanner;

public class VucutKitleHesaplama {
    public static void main(String[] args) {
        //Vücut kitle değerlerini belirleyelim
        double boy,kilo,vkitleindeks;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu m türünde giriniz:");
        boy= input.nextDouble();
        System.out.print("Lütfen kilonuzu kg giriniz:");
        kilo= input.nextDouble();
        // Değişkenlerimize göre indeks hesaplayalım
        vkitleindeks= kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz:"+vkitleindeks);

    }
}
