public class kuyruk {
    Eleman2 bas,son;
    kuyruk(){
        bas=null;
        son=null;
    }
    boolean bosmu(){
        return bas==null;
    }
    public void ekle(Eleman2 yeni){
        if (!bosmu()){
            bas=yeni; son=yeni;
        }else {
            son.ileri=yeni;
            son=yeni;
        }
    }
    Eleman sil(){
        Eleman2 sonuç;
        if (!bosmu()){
            sonuç=bas;
            bas=bas.ileri;
            if (bas==null){
                son=null;
            }
        }
        return null;
    }
}
