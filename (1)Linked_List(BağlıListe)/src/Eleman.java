public class Eleman {

    //tek yönlü bağlı liste için
    int icerik;
    Eleman ileri;

    //çift yönlü bağlı liste için
    Eleman geri;

    public Eleman(int icerik) {
        this.icerik = icerik;
        ileri=null;
        geri=null;
    }

}
