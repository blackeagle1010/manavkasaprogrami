import java.util.Scanner;
public class ManavKg {
    public static void main (String[] args) {
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.00;
        double ArmutKilo, ElmaKilo, DomatesKilo, MuzKilo, PatlicanKilo;
        double ArmutToplam, ElmaToplam, DomatesToplam, MuzToplam, PatlicanToplam, ToplamTutar;

        Scanner Input = new Scanner (System.in);
        System.out.print("Armut Kac Kilo ? :");
        ArmutKilo = Input.nextDouble();


        System.out.print("Elma Kac Kilo ? :");
        ElmaKilo = Input.nextDouble();


        System.out.print("Domates Kac Kilo ? :");
        DomatesKilo = Input.nextDouble();


        System.out.print("Muz Kac Kilo ? :");
        MuzKilo = Input.nextDouble();


        System.out.print("Patlıcan Kac Kilo ? :");
        PatlicanKilo = Input.nextDouble();

        ArmutToplam = Armut * ArmutKilo;
        ElmaToplam = Elma * ElmaKilo;
        DomatesToplam = Domates * DomatesKilo;
        MuzToplam = Muz * MuzKilo;
        PatlicanToplam = Patlican * PatlicanKilo;
        ToplamTutar = ArmutToplam + ElmaToplam + DomatesToplam + MuzToplam + PatlicanToplam;

        System.out.println("Armut Tutar :" + ArmutToplam);
        System.out.println("Elma Tutar:" + ElmaToplam );
        System.out.println("Domates Tutar:" + DomatesToplam);
        System.out.println("Muz Tutar :" + MuzToplam);
        System.out.println("Patlıcan Tutar:" + PatlicanToplam);

        System.out.println("Toplam Tutar:" + ToplamTutar);


    }
}




    /*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı; */

