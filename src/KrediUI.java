public class KrediUI {
    public void KrediHesapla(BaseKrediManager baseKrediManager){
        baseKrediManager.Hesapla();
// KrediHesapla BaseKrediManager ı referans aldığı için buradan OgretmenKrediManager ve
// TarimKrediManager a ulaşabiliriz.
// AskerKrediManager ı sonradan dahil ettik ve ona da ulaşabiliriz.
    }
}
