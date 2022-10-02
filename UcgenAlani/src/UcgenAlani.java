import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        //Değişkenlerimizi belirleyelim
        double a,b,c,u;
        //Kullanıcıdan verileri isteyelim
        Scanner veri= new Scanner(System.in);
        System.out.print("1.Kenarı giriniz:");
        a=veri.nextDouble();
        System.out.print("2.Kenarı giriniz:");
        b=veri.nextDouble();
        System.out.print("3.Kenarı giriniz:");
        c=veri.nextDouble();
        //Değişkenlerimize göre çevremizi hesaplayalım

        u=(a+b+c)/2;
        System.out.println("Ucgenin Cevresi:"+2*u);
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        //Üçgenimizin alanı k olsun
        Double k;
        k=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı:"+k);




    }
}