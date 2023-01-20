public class TekYonluBagliListe {
    Eleman bas;
    public TekYonluBagliListe() {
        bas=null;
    }void basaEkle(Eleman yeni){
        if (!bosMu()){
            yeni.ileri=bas;
            bas=yeni;
        }else bas=yeni;

    }void sonaEkle(Eleman yeni){
        if (!bosMu()){
            Eleman tmp=bas;
            while (tmp.ileri!=null){
                tmp=tmp.ileri;
            }
            tmp.ileri=yeni;

        }else bas=yeni;
    }void bastanSil(){
        if (!bosMu()){
            bas=bas.ileri;
        }
    }void sondanSil(){
        if (!bosMu()){
            Eleman tmp=bas;
            while (tmp.ileri.ileri!=null){

                tmp=tmp.ileri;
            }
            tmp.ileri=null;
        }
    }
    void tersÇevir(){
        Eleman tmp=bas;

    }int max(){
        Eleman tmp=bas;
        int max=0;
        while (tmp!=null){
            if (tmp.icerik>max)max=tmp.icerik;
            tmp=tmp.ileri;
        }
        return max;
    }
    String cikti(){
        Eleman tmp=bas;
        String toplam="";
        while (tmp!=null){
            toplam=toplam+"->"+tmp.icerik;
            tmp=tmp.ileri;
        }
        return toplam;
    }
    boolean bosMu(){return bas==null;}
}
