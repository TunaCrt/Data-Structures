public class Main {

    public static void main(String[] args) {
	/* ekle,saga,solo kır,yükseklik,maks,denge
                     30
                  20    40
               10  25      50
        */
        Avl avl=new Avl();
        avl.kok=avl.ekle(avl.kok,new Eleman(10));
        avl.kok=avl.ekle(avl.kok,new Eleman(20));
        avl.kok=avl.ekle(avl.kok,new Eleman(30));
        avl.kok=avl.ekle(avl.kok,new Eleman(40));
        avl.kok=avl.ekle(avl.kok,new Eleman(50));
        avl.kok=avl.ekle(avl.kok,new Eleman(25));
        avl.inorder(avl.kok);
    }
}
