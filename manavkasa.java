import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double a,b,c,d,e,fiyat;


        Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kilosunu Giriniz: ");
        a = inp.nextDouble();

        System.out.println("Elma Kilosunu Giriniz: ");
        b = inp.nextDouble();

        System.out.println("Domates Kilosunu Giriniz: ");
        c = inp.nextDouble();

        System.out.println("Muz Kilosunu Giriniz: ");
        d = inp.nextDouble();

        System.out.println("Patlıcan Kilosunu Giriniz: ");
        e = inp.nextDouble();




        fiyat = (armut*a)+(elma*b)+(domates*c)+(muz*d)+(patlican*e);

        System.out.println("Toplam Ücret: " +fiyat);







    }
}