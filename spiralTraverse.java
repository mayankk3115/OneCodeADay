import java.util.Arrays;

public class SprialTraverse {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        int[] result = spriralTraverse(arr);
        for(int i : result) {
            System.out.println(i);
        }
    }

    private static int[] spriralTraverse(int[][] arr) {
        int sc = 0;
        int sr = 0;
        int er = arr.length-1;
        int ec = arr[0].length-1;
        int[] finalResult = new int[]{};

        while (sc <= ec && sr <= er) {
            //i isEqual row and j isEqual column
            for (int j=sc;j<=ec;j++) {
                finalResult = addElement(finalResult,arr[sr][j]);
            }

            for (int i=sr+1; i<=er; i++) {
                finalResult = addElement(finalResult,arr[i][ec]);
            }
            if (sr < er) {
                for (int j=ec-1;j>=sc;j--) {
                    finalResult = addElement(finalResult,arr[er][j]);
                }
            }
            if (sc < ec) {
                for (int i=er-1;i>sr;i--) {
                    finalResult = addElement(finalResult,arr[i][sc]);
                }
            }
            sr=sr+1;
            sc=sc+1;
            er=er-1;
            ec=ec-1;
        }

        return finalResult;
    }

    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
}
