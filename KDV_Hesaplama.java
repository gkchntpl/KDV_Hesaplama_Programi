import java.util.Scanner;

public class KDV_Hesaplama {
    public static void main(String[] args) {

//Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//
//(Not : KDV tutarını 18% olarak alın)
//
//KDV'siz Fiyat = 10;
//
//KDV'li Fiyat = 11.8;
//
//KDV tutarı = 1.8;

        double kdvOrani = 0.18;
        double kdvliFiyat, kdvTutari;

        Scanner input= new Scanner(System.in);

        System.out.print("KDV'siz fiyatı girin: ");
        double kdvsizFiyat = input.nextDouble();

        kdvOrani = (kdvsizFiyat >= 1000) ? 0.08 : 0.18;

        kdvTutari = kdvsizFiyat * kdvOrani;
        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + kdvsizFiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);








    }
}
