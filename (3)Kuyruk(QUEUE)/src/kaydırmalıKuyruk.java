public class kaydırmalıKuyruk {//KAYDIRMALI KUYRUK

    private int N;
    private int[] kuyrukdizi;
    private int bas;
    private int son;
    private int elemansayısı;

    public kaydırmalıKuyruk(int N) {
        this.N=N;
        kuyrukdizi=new int[N];
        bas=0;
        son=-1;
        elemansayısı=0;
    }
    public void ekle(int yeni){//kuyruğun sonuna eleman ekler
        if (son==N-1){
            son=-1;
        }
        kuyrukdizi[++son]=yeni;
        elemansayısı++;
    }
    public int çikar(){
        int tmp=kuyrukdizi[bas++];
        for (int i=0;i<elemansayısı-1;i++){
            kuyrukdizi[i]=kuyrukdizi[i+1];

        }
        son--;
        elemansayısı--;
        return tmp;
    }
    public boolean bosMu(){
        return elemansayısı==0;
    }
    public boolean doluMu(){
        return elemansayısı==N-1;
    }
    String listele(){
        String sonuc="";
        if (!bosMu()){
            for (int i=0;i<elemansayısı;i++){
                sonuc=sonuc+kuyrukdizi[i]+"<-";
            }
        }else return null;
        return sonuc;
    }

}
