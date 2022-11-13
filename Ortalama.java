
package Giris;
import java.util.Scanner;
public class Ortalama {
    public static void main(String[] args) {
       // Derslerin notlarını atayabileceğimiz değişkenleri tanımlıyoruz..
        int mtmtk, fzk, kmy, trkc, trh, mzk;

        //girilen verilerin geçici olarak tutulacağı alanı tanımladık.
        Scanner girilennot = new Scanner(System.in);

        /*Matematik dersinin notunu alabilmek için kullanıcı ekranına
        matematik dersinin notunu girmesi için mesaj yazıyoruz. Notların
        alt alta çıkabilmesi için \t kaçış karakteri kullandım.
        */
        System.out.print("Matematik Dersinden Aldığınız Notu Giriniz:\t ");
        // Kullanıcın girmiş olduğu notu mtmtk adındaki değişkene atıyoruz.
        mtmtk = girilennot.nextInt();
        /*Fizik dersinin notunu alabilmek için kullanıcı ekranına
        fizik dersinin notunu girmesi için mesaj yazıyoruz.
         */
        System.out.print("Fizik Dersinden Aldığınız Notu Giriniz:\t\t ");
        // Kullanıcın girmiş olduğu notu fzk adındaki değişkene atıyoruz.
        fzk = girilennot.nextInt();
        /* Kimya dersinin notunu alabilmek için kullanıcı ekranına
        kimya dersinin notunu girmesi için mesaj yazıyoruz.
         */
        System.out.print("Kimya Dersinden Aldığınız Notu Giriniz:\t\t ");
        // Kullanıcın girmiş olduğu notu kmy adındaki değişkene atıyoruz.
        kmy = girilennot.nextInt();
        /* Türkçe dersinin notunu alabilmek için kullanıcı ekranına
        türkçe dersinin notunu girmesi için mesaj yazıyoruz.
         */
        System.out.print("Türkçe Dersinden Aldığınız Notu Giriniz:\t ");
        // Kullanıcın girmiş olduğu notu trkc adındaki değişkene atıyoruz.
        trkc = girilennot.nextInt();
        /* Tarih dersinin notunu alabilmek için kullanıcı ekranına
        tarih dersinin notunu girmesi için mesaj yazıyoruz.
         */
        System.out.print("Tarih Dersinden Aldığınız Notu Giriniz:\t\t ");
        // Kullanıcın girmiş olduğu notu trh adındaki değişkene atıyoruz.
        trh = girilennot.nextInt();
        /* Müzik dersinin notunu alabilmek için kullanıcı ekranına
        müzik dersinin notunu girmesi için mesaj yazıyoruz.
         */
        System.out.print("Müzik Dersinden Aldığınız Notu Giriniz:\t\t ");
        // Kullanıcın girmiş olduğu notu mzk adındaki değişkene atıyoruz.
        mzk = girilennot.nextInt();
        /* Tüm derslerin toplamını alabilmek için integer tipinde bir değişken
        tanımlayarak bu değişkene derslerden alınan notların toplamını atıyoruz.
         */
        int toplam = (mtmtk+fzk+kmy+trkc+trh+mzk);
        /* Not ortalamasını bulabilmek için derslerden alınan notların toplamını
        6 adet ders olduğundan 6 ya bölmemiz gerekiyor, çıkan sonuç büyük ihtimalle
        küsüratlı olacağından integer yerine double tipi bir değişken tanımlayıp ona
        atama işlemi yapıyoruz.Bölme işleminde tanımladığımız değişkenin veri tipine
        uyması için 6 tam sayısı yerine 6.0 a bölüyoruz.
         */
       double notOrtalama = toplam / 6.0;
       // Not ortamasını kullanıcın görebilmesi için ekrana yazdırıyoruz.

       System.out.print("Derslerinizin Not Ortalaması:\t\t\t\t ") ;
       System.out.println(notOrtalama);
       boolean gecmeNotu = notOrtalama >= 60.0;
       String str = gecmeNotu ? "Ortalamanız 60.0 dan büyük olduğundan Sınıfı GEÇTİNİZ" : "Not Ortalamanız 60.0 dan küçük olduğundan Sınıfta KALDINIZ";
       System.out.print(str);




    }
}
