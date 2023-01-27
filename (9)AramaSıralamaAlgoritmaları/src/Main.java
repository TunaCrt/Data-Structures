import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] dizi={1,2,3,4,5,6};
        int[] dizi2={5,4,1,2,3};

        //arama algoritmaları
        System.out.println(ArdisilArama(dizi,10));//O(n)
        System.out.println(ikiliArama(dizi,6));//O(log_n) dizi sıralı olmalı
        //sıralama algoritmaları
        System.out.println("Bubble Sort: "+Arrays.toString(bubbleSort(dizi2)));
        //en iyi durum O(n) en kötü durum O(n^2)
        System.out.println("Selection Sort: "+Arrays.toString(selectionSort(dizi2)));
        //listede en büyük veya en küçük eleman bulunup en başa alınır her zaman O(n^2)'de çalışır
        System.out.println("insertion sort: "+Arrays.toString(insertionSort(dizi2)));
        //dizi sıralıysa veya sıralıya yakınsa O(n) değilse O(n^2)
        System.out.println("Heap Sort: "+Arrays.toString(heapSort(dizi2)));//O(n.log n)
        int[] dizi3={5,4,1,2,3};
        MergeSort(dizi3,0,4);
        System.out.println("Merge Sort "+Arrays.toString(dizi3));
        QuickSort(dizi3,0,4);
        System.out.println("Quick Sort "+Arrays.toString(dizi3));


    }


    static int ArdisilArama(int[]dizi,int aranan){
        for (int i=0;i< dizi.length;i++){
            if (aranan==dizi[i])return i;
        }
        return -1;
    }static int ikiliArama(int[]dizi,int aranan){
        int bas=0;
        int son= dizi.length-1;
        int orta=0;
        while (bas<=son){
            orta=bas+son/2;
            if (dizi[orta]==aranan)return orta;

            else if (aranan<dizi[orta])son=orta-1;
            else bas=orta+1;
        }
        return -1;
    }static int []bubbleSort(int[]dizi){
        boolean continue1=true;

        while (continue1){
            continue1=false;
            for (int i=0;i<dizi.length-1;i++){
                if (dizi[i]>dizi[i+1]){
                    int tmp=dizi[i+1];
                    dizi[i+1]=dizi[i];
                    dizi[i]=tmp;
                    continue1=true;
                }
            }
        }
        return dizi;
    }static int[] selectionSort(int[]dizi){

        int min;
        for (int i=0;i< dizi.length-1;i++){
            int j=0;
            for (;j< dizi.length-1;j++){
                if (dizi[i]>dizi[j]){
                    min=dizi[j];
                }
            }
            int tmp=dizi[j];
            dizi[j]=dizi[i];
            dizi[j]=tmp;
        }
        return dizi;
    }static int[] insertionSort(int[] dizi){
        //5,4,0,3,2,1
        int j;
        for (int i=0;i<dizi.length-1;i++){
            j=i;
            while (j>0){
                    if (dizi[i]>dizi[i+1]){
                        int tmp=dizi[i+1];
                        dizi[i+1]=dizi[i];
                        dizi[i]=tmp;
                    }
                    j--;
            }
        }
        return dizi;
    }static int[] heapSort(int[]A){
        int i;
        Eleman e;
        Heap y=new Heap(A.length);
        for (i=0;i<A.length;i++){
            e=new Eleman(A[i]);
            y.ekle(e);
        }
        for (i=0;i<A.length;i++){
            e=y.azamiSil();
            A[i]=e.icerik;
        }

        return A;
    }static void MergeSort(int[]A,int bas,int son){
        int pivot;
        if (bas<son){
            pivot=(bas+son)/2;
            MergeSort(A,bas,pivot);
            MergeSort(A,pivot+1,son);
            Merge(A,bas,pivot,son);
        }
    } static void Merge(int[]A,int p,int q,int r){
        int L[],R[];
        int n1,n2,i,j,k;
        n1=q-p+1;
        n2=r-q;
        L=new int[n1+1];
        R=new int[n2+1];
        for (i=0;i<n1;i++) L[i]=A[p+i];

        for (i=0;i<n2;i++) R[i]=A[q+i];

        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;
        i=0;j=0;



        /*int[]c=new int[A.length+B.length];
        int i=0;//A için
        int j=0;
        for (int k=0;k<c.length;k++){
            if (A[i]<B[j]){
                c[k]=A[i];
                i++;
            }else {
                c[k]=B[j];
                j++;
            }return c;*/
        }

     static void QuickSort(int[] A,int bas,int son){
        int pivot;
        if (bas<son){
            pivot=parcala(A,bas,son);
            QuickSort(A,bas,pivot-1);
            QuickSort(A,pivot+1,son);

        }
    }static int parcala(int[]A,int bas,int son){
        int x=A[son],tmp;
        int i=bas-1,j;
        for (j=bas;j<son;j++){
            if (A[j]<=x){
                i++;
                yerdegistir(A,i,j);
            }

        }
        yerdegistir(A,i+1,son);
        return i+1;

    }static void yerdegistir(int[]A,int i,int j){
        int tmp;
        tmp=A[i];
        A[i]=A[j];
        A[j]=tmp;
    }
}
