import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double boy,kilo;
        Scanner input= new Scanner(System.in);
        System.out.println("Vücut Kitle Endeksi Hesaplama");
        System.out.println("-----------------------------");

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo=input.nextDouble();
        double endex=kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz :"+ new DecimalFormat("##.#").format(endex));

    }
}
