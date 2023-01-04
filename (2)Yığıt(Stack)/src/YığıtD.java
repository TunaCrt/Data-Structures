public class YığıtD {
    int N;
    Eleman dizi[];
    int üst;
    public YığıtD(int N) {
        üst=-1;
        this.N=N;
        dizi=new Eleman[N];
    }boolean doluMu(){return N-1==üst;}
    boolean bosMu(){return üst==-1;}
    void push(Eleman yeni){
        if (!doluMu()){
            üst++;
            dizi[üst]=yeni;
        }
    }Eleman pop(){
        Eleman tmp=dizi[üst];
        if (!bosMu()){
            dizi[üst]=null;
            üst--;
        }
        return tmp;
    }
    String çıktı(){
        String toplam="";
        for (int i=üst;i>0;i--){
            toplam=toplam+"->"+dizi[i].icerik;
        }
        return toplam;
    }
}
