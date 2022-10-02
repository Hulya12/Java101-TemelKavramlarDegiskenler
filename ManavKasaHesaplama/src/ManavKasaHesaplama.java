import java.util.Scanner;

public class ManavKasaHesaplama {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlayalım
        double armut,elma,domates,muz,patlican;

        //Değişkenlerimizi birim fiyatında belirleyelim
        double armutkg=2.14,elmakg=3.67,domateskg=1.11,muzkg=0.95,patlicankg=5.0,toplamtutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Aldınız:");
        armut=input.nextDouble();
        System.out.print("Kaç Kilo Elma Aldınız:");
        elma= input.nextDouble();
        System.out.print("Kaç Kilo Domates Aldınız:");
        domates= input.nextDouble();
        System.out.print("Kaç Kilo Muz Aldınız:");
        muz= input.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldınız:");
        patlican= input.nextDouble();

        //Değişkenlerimize göre tutarları tanımlayalım
        double armuttutar,elmatutari,domatestutari,muztutari,patlicantutari;
        //Tutarları değişkenlerimize göre formülize edelim
        armuttutar=armutkg*armut;
        elmatutari=elmakg*elma;
        domatestutari=domateskg*domates;
        muztutari=muzkg*muz;
        patlicantutari=patlicankg*patlican;
        //Toplam tutar formülünü belirleyelim
        toplamtutar=(armuttutar+elmatutari+domatestutari+muztutari+patlicantutari);
        System.out.println("Toplam Tutarınız:"+toplamtutar);


    }
}
