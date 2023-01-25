import java.util.Random;

public class İkiliAğaç {
    Eleman kök;
    public İkiliAğaç() {
        kök=null;
    }void ekle(Eleman yeni){
        Eleman tmp=kök;
        Eleman onceki=null;
        if (tmp!=null){
            while (tmp!=null){
                onceki=tmp;
                if (yeni.icerik<tmp.icerik) tmp=tmp.sol;
                else tmp=tmp.sag;
            }
            if (onceki.icerik<yeni.icerik) onceki.sag=yeni;
            else onceki.sol=yeni;
        }else kök=yeni;
    }Eleman ara(int sayi){
        Eleman tmp=kök;
        while (tmp!=null){
            if (tmp.icerik==sayi)return tmp;
            else if (tmp.icerik<sayi) tmp= tmp.sag;
            else tmp=tmp.sol;
        }
        return null;
    }Eleman asgari(Eleman köks){
        Eleman tmp=köks;
        while (tmp.sol!=null){
            tmp=tmp.sol;
        }
        return tmp;
    }Eleman azami(Eleman köks){
        Eleman tmp=köks;
        while (tmp.sag!=null){
            tmp=tmp.sag;
        }
        return tmp;
    }Eleman sil(int sayi){// silmek için 3 farklı durum vardır
        Eleman tmp=kök;
        Eleman önceki=null;
        while (/*tmp.sag!=null ||tmp.sol!=null && */tmp.icerik!=sayi){
            önceki=tmp;
            if (tmp.icerik<sayi)tmp=tmp.sag;
            else if (tmp.icerik>sayi)tmp=tmp.sol;
        }//sayiyi bulduk burada sileceğiz

                if (tmp.sol==null && tmp.sag==null){//1.)silinecek düğümün hiç çocuğu olmaması
                    System.out.println("çocuksuz düğüm siliniyor");
                    if (tmp==kök)kök=null;
                    else if (önceki.icerik<tmp.icerik) önceki.sag=null;
                    else önceki.sol=null;
                    return tmp;
                }
                else if (tmp.sag!=null && tmp.sol!=null){//3.)silinecek düğümün 2 çocuğu olması
                    System.out.println("2 çocuk'lu düğüm siliniyor");
                   /* tmp=azami(tmp.sol);
                    sil(azami(tmp.sol).icerik);*/

                    tmp=sil(azami(tmp.sol).icerik);

                    return tmp;
                }else {//silinecek düğümün 1 çocuğu olması
                    System.out.println("1 çocuk'lu düğüm siliniyor");
                    if (tmp==kök && tmp.sol==null)kök=tmp.sag;
                    else if (tmp==kök && tmp.sag==null) kök=tmp.sol;

                    else if (önceki.icerik<tmp.icerik &&tmp.sol==null) önceki.sag=tmp.sag;
                    else önceki.sag=tmp.sol;
                    return tmp;
                }






    }
    void güncelle(int yeni,int eski){
        sil(eski);
        Eleman yeni1=new Eleman(yeni);
        ekle(yeni1);
    }String çıktı(){
        Eleman tmp=kök;
        String sonuç="";

        if (yükseklik(tmp)==0){
            sonuç=sonuç+"\t"+tmp.icerik+"\n";
        }else if (yükseklik(tmp)==1) sonuç=sonuç+"\t"+tmp.icerik;

        return sonuç;
    }int yükseklik(Eleman eleman){
        Eleman tmp=eleman;
        int sags=0;
        int sols=0;
        while (tmp!=null){
            tmp=tmp.sag;
            sags++;
        }tmp=eleman;
        while (tmp!=null){
            tmp=tmp.sol;
            sags++;
        }
        if (sags<sols)return sols;
        else return sags;
    }

}
