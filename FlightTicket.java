

import java.util.Scanner;


public class FlightTicket {
    public static void main(String[] args) {

        int mesafe, yas, yon;

        double discountRateElli = 0.50;
        double discountRateOn = 0.10;
        double discountRateOtuz = 0.30;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kaç KM gideceğinizi giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Lütfen yolculuk tipini giriniz : 1 Tek Yön , 2 Çift Yön;   ");
        yon = input.nextInt();


        double ucret = mesafe * 0.10;

        if (yas < 12) {
            System.out.println("12 Yaşından Küçükler için Tek Yön Tarife: " + (ucret -= ucret * discountRateElli) + "TL");
        }

            if (yas >= 12 && yas <= 24) {
                System.out.println("12-24 Yaş arası Tarife Tek yön: " + (ucret -= ucret * discountRateOn) + "TL");
            }


            if (yas > 65) {
                System.out.println("65 Yaş Üstü Tarife Tek Yön: " + (ucret -= ucret * discountRateOtuz) + "TL");
            }
            if (yas >= 24 && yas < 65) {
                System.out.println("Fiyat : " + ucret);
            }
            if (yon == 2) {
                System.out.println("Çift Yön Fiyat : " + (ucret * 0.80) * 2 + "TL");
            }
            else System.out.println("Hatalı Veri Girdiniz!!!");

        }
    }



