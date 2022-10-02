import java.util.Scanner;

public class DikUcgendeHipotenusProje {
    public static void main(String[] args) {
        //Değişkenleri belirtelim
        int a,b;
        double c;
        //Kullanıcıdan veri isteyelim
        Scanner veri = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz:");
        a= veri.nextInt();
        System.out.print("2.Kenarı Giriniz");
        b= veri.nextInt();
        c= Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs:"+c);
    }
}
