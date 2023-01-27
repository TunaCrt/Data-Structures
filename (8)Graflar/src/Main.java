public class Main {

    public static void main(String[] args) {
	/*     Ağırlıksız graflarda

	         min spaning tree
	   DFS             BFS(En kısa yol)

	       Ağırlıklı graflarda
	        min spaning tree

	   Dijkstra     prim       kruskal
	   //min heap


	 */
        int[] derece={2,2,1,1};
        int[][] komsuluk=komsulukMatrisiYap(derece);
        System.out.println(toString(derece.length,komsuluk));

    }static int[][]komsulukMatrisiYap(int []derece){
        /*int[] derece={2,2,1,1}
        (0)  (1)  (2)  (3)
    (0)    0    1    1    0
    (1)    1    0    0    1
    (2)    1    0    0    0
    (3)    0    1    0    0*/
        int [][]komsuluk=new int[derece.length][derece.length];
        for (int i=0;i< derece.length;i++){
            for (int j=0;j< derece[i];j++){
                komsuluk[i][(int) (Math.random()*3)]=1;
            }
        }
        return komsuluk;
    }

    static String toString(int derece,int[][]komsuluk){
        String s="";
        for (int i=0;i<derece;i++){
            for (int j=0;j<derece;j++){
                s=s+komsuluk[i][j];
            }
            s=s+"\n";
        }
        return s;
    }
}
