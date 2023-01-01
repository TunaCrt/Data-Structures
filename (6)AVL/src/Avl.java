public class Avl {

    Eleman kok;
    public Avl() {
        kok=null;
    }
    Eleman ekle(Eleman tmp,Eleman yeni){//tmp=kök
        if (tmp==null) return yeni;
        else {
            if (tmp.deger>yeni.deger) tmp.sol=ekle(tmp.sol,yeni);
            else tmp.sag=ekle(tmp.sag,yeni);
        }
        tmp.yukseklik=max(yükseklik(tmp.sol),yükseklik(tmp.sag))+1;
        int fark=yükseklik(tmp.sol)-yükseklik(tmp.sag);
        if (fark>1&&yeni.deger<tmp.sol.deger){
            return sagaDondur(tmp);
        }if (fark>1&&yeni.deger>tmp.sol.deger){
            tmp.sol=solaDondur(tmp.sol);
            return sagaDondur(tmp);
        }
        if (fark<-1&&yeni.deger>tmp.sag.deger){
            return solaDondur(tmp);
        }if (fark<-1&&yeni.deger<tmp.sol.deger){
            tmp.sol=sagaDondur(tmp.sol);
            return solaDondur(tmp);
        }
        return tmp;
    }
    int yükseklik(Eleman n){
        if (n==null) return 0;
        return n.yukseklik;
    }
    int max(int a,int b){
        if (a>b) return a;
        else return b;
    }

    Eleman sagaDondur(Eleman a){
        Eleman b=a.sol;
        Eleman t3=b.sag;

        a.sol=t3;
        b.sag=a;

        a.yukseklik=max(yükseklik(a.sol),yükseklik(a.sag))+1;
        b.yukseklik=max(yükseklik(b.sol),yükseklik(b.sag))+1;

        return b;
    }Eleman solaDondur(Eleman a){
        Eleman b=a.sag;
        Eleman t2=b.sol;

        b.sol=a;
        a.sag=t2;

        a.yukseklik=max(yükseklik(a.sol),yükseklik(a.sag))+1;
        b.yukseklik=max(yükseklik(b.sol),yükseklik(b.sag))+1;

        return b;
    }
    void inorder(Eleman d){
        if (d!=null){
            inorder(d.sol);
            System.out.println(d.deger+" ");
            inorder(d.sag);
        }
    }/*int denge(Eleman N){
        if (N==null)return 0;
        else return yükseklik(N.sol)-yükseklik(N.sag);
    }*/
}
