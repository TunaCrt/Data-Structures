public class Yığıt {
    Eleman üst;//bağlı liste kullanılarak yapılan yığıt yapısı
    public Yığıt() {
        üst=null;
    }
    void push(Eleman yeni){
        if (!bosMu()){
            yeni.ileri=üst;
        }
        üst=yeni;
    }Eleman pop(){
        Eleman tmp=üst;
        if (!bosMu()){
            üst=üst.ileri;
        }
        return tmp;
    }boolean bosMu(){return üst==null;}
    Eleman top(){
        return üst;
    }String çıktı(){
        String toplam="";
        Eleman tmp=üst;
        while (tmp!=null){
            toplam=toplam+"->"+tmp.icerik;
            tmp=tmp.ileri;
        }
        return toplam;
    }



}
