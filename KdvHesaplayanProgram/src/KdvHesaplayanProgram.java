import java.util.Scanner;

public class KdvHesaplayanProgram{
    public static void main(String[] args) {
        //Verilecek tutarı double olarak tanımlayacağız.
        double tutar,kdvOran1=0.18,kdvoran2=0.08,kdvtutari1,kdvtutari2,kdvlitutar1,kdvlitutar2;
        Scanner input=new Scanner(System.in);
        System.out.print("Ödenecek tutarı giriniz :");
        tutar= input.nextDouble();
        kdvtutari1=tutar*kdvOran1;
        kdvlitutar1=tutar+kdvtutari1;
        kdvtutari2=tutar*kdvoran2;
        kdvlitutar2=tutar+kdvtutari2;
        boolean kosul1=tutar<=1000;


        String kosul=kosul1 ? "Kdv'li Tutar:"+kdvlitutar1:"Kdv'li Tutar:"+kdvlitutar2;

        System.out.println(kosul);

    }
}