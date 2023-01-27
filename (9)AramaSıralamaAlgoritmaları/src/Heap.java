public class Heap {//maxHeap
    //2*n+1    2*n+2
    Eleman dizi[];
    int adet;

    public Heap(int N) {
        dizi=new Eleman[N];
        adet=0;
    }boolean bosMu(){
        return adet==0;}

    void asagiIn(int no){
        int altsol=2*no+1,altsag=2*no+2;
        while (altsol<adet&&dizi[no].icerik<dizi[altsol].icerik||
                altsag<adet&&dizi[no].icerik<dizi[altsag].icerik){
            if (altsag>=adet||dizi[altsol].icerik>dizi[altsag].icerik){
                Eleman tmp=dizi[no];
                dizi[no]=dizi[altsol];
                dizi[altsol]=tmp;
                no=altsol;
            }else {
                Eleman tmp=dizi[no];
                dizi[no]=dizi[altsag];
                dizi[altsag]=tmp;
                no=altsag;
            }
            altsol= 2*no+1;
            altsag=2*no+2;
        }
    }void yukarıÇık(int no){
        int ata=(no-1)/2;
        while (ata>=0&&dizi[ata].icerik<dizi[no].icerik){
            Eleman tmp=dizi[ata];
            dizi[ata]=dizi[no];
            dizi[no]=tmp;
            no=ata;
            ata=(no-1)/2;
        }
    }void ekle(Eleman yeni){
        dizi[adet]=yeni;
        yukarıÇık(adet);
        adet++;
    }Eleman sil(){
        if (!bosMu()){
            Eleman tmp=dizi[0];
            dizi[0]=dizi[adet-1];
            asagiIn(0);
            adet--;
            return tmp;
        }else return null;
    }
    Eleman azamiSil(){
        if (!bosMu()){
            Eleman tmp=dizi[0];
            dizi[0]=dizi[adet-1];
            adet--;
            asagiIn(0);

            return tmp;
        }else return null;
    }
    void yazdir(){
        for (int i=0;i<adet/2;i++){
            int sol=2*i+1;
            int sag=2*i+2;
            System.out.println("Ata dugum "+dizi[i].icerik);
            if (sol<adet){
                System.out.println("sol cocuk "+dizi[sol].icerik);
            }
            if (sag<adet)
                System.out.println("sag cocu "+dizi[sag].icerik);

            System.out.println("");

        }
    }
}class Eleman {
    int icerik;
    public Eleman(int icerik) {
        this.icerik = icerik;
    }
}
