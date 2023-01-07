public class kaydırmalı {
    Eleman []dizi;
    int bas;
    int son;
    int N;
    public kaydırmalı(int N){
        this.N=N;
        dizi=new Eleman[N];
        bas=0;
        son=-1;
    }

    void ekle(Eleman yeni){
        son++;
        dizi[son]=yeni;
    }Eleman çıkar(){
        Eleman tmp=dizi[bas];
        if (!bosMu()){

            for (int i=0;i<son;i++){
                dizi[i]=dizi[i+1];
            }
            son--;
        }
        return tmp;
    }
    boolean bosMu(){
        return dizi[bas]==null;
    }boolean doluMu(){
        return N-1==son;
    }
    String listele(){
        String sonuç="";
        if (!bosMu()){
            for (int i=0;i<=son;i++){
                sonuç=sonuç+dizi[i].icerik+"<-";
            }
        }
        return sonuç;
    }
}
