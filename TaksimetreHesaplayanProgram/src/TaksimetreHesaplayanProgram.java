import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        //Değişkenlerimizi belirleyelim
        int km;
        double perKm=2.20, total, starPrice=10;
        Scanner veri = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km=veri.nextInt();
        //km tanımlandıktan sonra totali formülize edelim
        total=(km*perKm);
        total+=starPrice;
        //Eğer toplam tutar 20den küçük ise tutarı 20TL olarak kabul edelim

        total=(total<20)?20 : total;

        System.out.println("Toplam ücret:"+total);




    }
}
