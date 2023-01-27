public class Kuyruk {
    Eleman bas;
    Eleman son;
    public Kuyruk() {
        bas=null;
        son=null;}
    void ekle(int yeni){
     Eleman e=new Eleman(yeni);
     if (!bosMu()){
         e.ileri=son;
         son=e;
     }else {
         bas=e;
     }

    }int sil(){
        Eleman tmp=bas;
        if (!bosMu()){
            bas=bas.ileri;
        }else {

        }
        return tmp.icerik;
    }boolean bosMu(){
        return bas==null;
    }
}
