public class bağlıListeKuyruk {//BAĞLANTILI LİSTELİ KUYRUK
    Eleman2 bas;
    Eleman2 son;

    public bağlıListeKuyruk() {
        bas=null;
        son=null;
    }
    public boolean kuyrukbos(){
        if (bas==null){
            return true;
        }else return false;
    }
    public void ekle(Eleman2 yeni){
        if (!kuyrukbos()){
            son.ileri=yeni;
        }else bas=yeni;
        son=yeni;
    }
    Eleman2 kuyruktanSil(){
        Eleman2 sonuc;
        sonuc=bas;
        if (!kuyrukbos()){
            bas=bas.ileri;
            if (bas==null){
                son=null;
            }
        }
        return sonuc;
    }
    String listele(){
        Eleman2 tmp=bas;
        String sonuc="";
        while (tmp!=null){
        if (!kuyrukbos()){
            sonuc=sonuc+tmp.icerik+"<-";
        }
        tmp=tmp.ileri;
        }
         return sonuc;
    }
}
