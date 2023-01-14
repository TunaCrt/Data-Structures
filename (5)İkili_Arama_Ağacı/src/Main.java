public class Main {

    public static void main(String[] args) {
	İkiliAğaç i̇kiliAğaç=new İkiliAğaç();
    /*
                        5
                     6     7
                             11 onceki
                                19 tmp
                             17
     */
        Eleman bı=new Eleman(5);
        Eleman a=new Eleman(7);
        Eleman b=new Eleman(6);
        Eleman c=new Eleman(11);
        Eleman d=new Eleman(19);
        Eleman e=new Eleman(17);

        Eleman e1=new Eleman(20);


        i̇kiliAğaç.ekle(bı);
        i̇kiliAğaç.ekle(a);
        i̇kiliAğaç.ekle(b);
        i̇kiliAğaç.ekle(c);
        i̇kiliAğaç.ekle(d);
        i̇kiliAğaç.ekle(e);

        i̇kiliAğaç.ekle(e1);
        System.out.println(i̇kiliAğaç.ara(19).icerik);


        System.out.println(i̇kiliAğaç.sil(19).icerik);


        System.out.println("---");
        System.out.println(i̇kiliAğaç.asgari(bı).icerik);
        System.out.println(i̇kiliAğaç.azami(bı).icerik);







    }
}
