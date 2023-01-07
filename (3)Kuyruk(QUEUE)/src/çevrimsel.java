public class çevrimsel {
    Eleman []dizi;
    int bas;
    int son;
    int N;

    public  çevrimsel(int N){
        this.N=N;
        dizi=new Eleman[N];
        bas=0;
        son=-1;
    }

    void ekle(Eleman yeni){
        if (!doluMu()){
            son=(son+1)%N;
            dizi[son]=yeni;
        }
    }
    boolean bosMu(){
        return dizi[bas]==null;
    }boolean doluMu(){
        return dizi[(son+1)%N]!=null;
    }
    Eleman çıkar(){
        Eleman tmp=dizi[bas];
        if (!bosMu()){
            bas=(bas+1)%N;
        }
        return tmp;
    }
    String listele(){
        String sonuç="";
        if (!bosMu()){
            for (int i=bas;i<=son;i=(i+1)%N){
                sonuç=sonuç+dizi[i].icerik+"<-";
            }
        }
        return sonuç;
    }

}
