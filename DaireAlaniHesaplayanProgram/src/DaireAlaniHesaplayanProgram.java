import java.util.Scanner;

public class DaireAlaniHesaplayanProgram {

    public static void main(String[] args) {
        //Değişkenlerimizi belirleyelim
        int r;
        double pi=3.14,m,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("Yarı çapını giriniz:");
        r= input.nextInt();
        System.out.print("Merkez ölçüsünü giriniz:");
        m=input.nextDouble();

        //Değişkenlerimize göre alan hesaplayalım
        alan=(pi*(r*r)*m)/360;
        System.out.println("Daire Diliminin Alanını Bulunuz:"+alan);
    }
}