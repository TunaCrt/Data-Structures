import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Heap y1=new Heap(10);
        Heap y2=new Heap(10);
        Scanner k1=new Scanner(System.in);
        System.out.println("Heap-1 sayıları virgül ile gir");
        String h1=k1.nextLine();
        String []s1=h1.split(",");
        for (int i=0;i< s1.length;i++){
            y1.ekle(new Eleman(Integer.parseInt(s1[i])));
        }
        y1.yazdir();
        System.out.println("Heap-2 sayıları virgül ile gir");
        String h2=k1.nextLine();
        String []s2=h2.split(",");
        for (int i=0;i< s2.length;i++){
            y2.ekle(new Eleman(Integer.parseInt(s2[i])));
        }
        y2.yazdir();
        int [] a=new int[s2.length-1];
        for (int i=0;i< s2.length-1;i++){
            a[i]=Integer.parseInt(s2[i]);
        }
        //System.out.println(y2.heapMi(a));

    }
}
