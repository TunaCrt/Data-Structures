public class çevrimselKuyruk {//ÇEVRİMSEL KUYRUK
    Eleman[] dizi;
    int bas;
    int son;
    int N;
    public çevrimselKuyruk(int N){
        dizi=new Eleman[N];
        this.N=N;
        bas=0;
        son=0;
    }
    boolean kuyrukDolu(){
        if (bas==(son+1)%N){
            return true;
        }else return false;
    }boolean kuyrukBos(){
        if (bas==son){
            return true;
        }else return false;
    }
    public void ekle(Eleman yeni){
        if (!kuyrukDolu()){
            dizi[son]=yeni;
            son=(son+1)%N;
        }
    }
    Eleman kuyrukSil(){
        Eleman sonuc;
        if (!kuyrukDolu()){
            sonuc=dizi[bas];
            bas=(bas+1)%N;
            return sonuc;
        }
        return null;
    }
    String listele(){
        String sonuc="";
            Eleman[] tmp=dizi;
            int tmpB=bas;
            int tmpS=son;
            while (tmpB!=tmpS){
                sonuc=sonuc+tmp[tmpB].icerik+"<-";
                tmpB=(tmpB+1)%N;
            }

        return sonuc;
    }
}
