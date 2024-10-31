//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Birden fazla class ı extend edemeyiz.
//    OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//    ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        AskerKrediManager askerKrediManager = new AskerKrediManager();
        askerKrediManager.List();
//        AskerKrediManager askerKrediManager = new AskerKrediManager();
//        askerKrediManager.List();

        // OgretmenKrediManager ın içindeki kod çalışır.


    }
}