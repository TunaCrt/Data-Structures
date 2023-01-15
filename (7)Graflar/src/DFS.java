public class DFS {
    int[][] komsuluk=new int[6][6];//komşuluk matrisi
    /*  A B C D E F
     A  0 1 1 1 0 0
     B  0 1 1 1 0 0
     C  0 0 1 0 1 0
     D  0 0 0 0 0 1
     E  0 0 1 0 0 0
     F  0 0 1 1 0 0
     */
    int [] ziyaret=new int[6];
    Yığıt y=new Yığıt();
    public DFS(){
        komsuluk[0][1]=1;//A->B
        komsuluk[0][2]=1;//A->C
        komsuluk[0][3]=1;//A->D
        komsuluk[2][4]=1;//C->E
        komsuluk[3][5]=1;//D->F
        komsuluk[5][2]=1;//F->C
    }
    void DFSgez(int dugum){
        int v=dugum;
        System.out.println(v);
        ziyaret[v]=1;
        while (komsuBul(v)!=-1 || !y.bosMu()){
            if (komsuBul(v)!=-1){
                y.push(v);
                v=komsuBul(v);
                ziyaret[v]=1;
                System.out.println(v);

            }else {
                v=y.pop().icerik;
            }
        }
    }int komsuBul(int dugum){
        for (int i=0;i<6;i++){
            if (komsuluk[dugum][i]!=0&&ziyaret[i]==0)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        DFS dfs=new DFS();
        dfs.DFSgez(0);
    }

}
