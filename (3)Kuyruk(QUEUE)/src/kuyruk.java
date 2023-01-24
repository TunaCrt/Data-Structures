public class kuyruk {
    Eleman bas,son;
    kuyruk(){
        bas=null;
        son=null;
    }
    boolean bosmu(){
        return bas==null;
    }
    public void ekle(Eleman yeni){
        if (bosmu()){
            bas=yeni; son=yeni;
        }else {
            son.ileri=yeni;
            son=yeni;
        }
    }
    Eleman sil(){
        Eleman sonuç;
        if (!bosmu()){
            sonuç=bas;
            bas=bas.ileri;
            if (bas==null){
                son=null;
            }
        }
        return null;
    }String listele(){
        String sonuç="";
        Eleman tmp=bas;
        if (!bosmu()){
            while (tmp!=null){
                sonuç=sonuç+tmp.icerik+"<-";
                tmp= tmp.ileri;
            }
        }
        return sonuç;
    }
}
