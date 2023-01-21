public class CiftYonluBagliListe {
    Eleman bas;
    Eleman son;
    public CiftYonluBagliListe() {
        bas=null;
        son=null;
    }void basaEkle(Eleman yeni){
        if (!bosMu()){
            bas.geri=yeni;
            yeni.ileri=bas;
            bas=yeni;
        }else{ bas=yeni;
        son=yeni;
        }


    }void sonaEkle(Eleman yeni){
        if (!bosMu()){
            son.ileri=yeni;
            yeni.geri=son;

        }else bas=yeni;

        son=yeni;
    }void bastanSil(){
        if (!bosMu()){
            bas=bas.ileri;
        }
    }void sondanSil(){
        if (!bosMu()){
            son=son.geri;
            son.ileri=null;
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