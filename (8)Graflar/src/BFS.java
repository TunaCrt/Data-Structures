public class BFS {
    int[][] komsuluk=new int[6][6];//komşuluk matrisi
    /*  A B C D E F
     (0)A  0 1 1 1 0 0
     (1)B  0 0 0 0 0 0
     (2)C  0 0 0 0 1 1
     (3)D  0 0 0 0 0 1
     (4)E  0 0 0 0 0 0
     (5)F  0 0 0 0 0 0
     */
    int [] ziyaret=new int[6];
    Kuyruk k=new Kuyruk();
    public BFS(){
        komsuluk[0][1]=1;//A->B
        komsuluk[0][2]=1;//A->C
        komsuluk[0][3]=1;//A->D
        komsuluk[2][4]=1;//C->E
        komsuluk[3][5]=1;//D->F
        komsuluk[2][5]=1;//c->f
    }
    void BFSgez(int dugum){
        int v= dugum;
        System.out.println(v);
        ziyaret[v]=1;
        k.ekle(v);
        while (!k.bosMu()){
            //komsubul
            for (int i=0;i<6;i++){
                if (komsuluk[v][i]==1 &&ziyaret[i]==0){
                    k.ekle(i);
                    ziyaret[i]=1;
                    System.out.println(i);
                }
            }
            v=k.sil();
        }
    }

    public static void main(String[] args) {
        BFS bfs=new BFS();
        bfs.BFSgez(0);
    }
}
