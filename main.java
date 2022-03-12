import java.util.Scanner;


class Main {

    public static void main(String[] args) {

        //fizik, kimya,matematik,biyoloji,türkçe,tarih,müzik

        int fizik, mat, kimya, biyo, tarih, turkce, muzik;


        Scanner input = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("Biyoloji notunuzu giriniz: ");
        biyo = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        int toplam = fizik+kimya+mat+biyo+turkce+tarih+muzik;

        double sonuc = toplam/7;

        System.out.println("Not ortalamanız:" + sonuc);

        if (
                sonuc <=60
        )
            System.out.println("Sınıfta kaldınız!!!");
        else
            System.out.println("Geçtiniz Tebrikler!!!");


    }
}