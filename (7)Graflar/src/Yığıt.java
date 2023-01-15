public class Yığıt {
    Eleman üst;
    public Yığıt() {
        üst=null;
    }
    void push(int yeni){
        Eleman e=new Eleman(yeni);
        e.ileri=üst;
        üst=e;
    }Eleman pop(){
        Eleman tmp=üst;
        if (!bosMu()){
            üst=üst.ileri;
        }
        return tmp;
    }boolean bosMu(){return üst==null;}


}class Eleman{
    int icerik;
    Eleman ileri;
    public Eleman(int  icerik) {
        this.icerik = icerik;
        ileri=null;
    }
}
