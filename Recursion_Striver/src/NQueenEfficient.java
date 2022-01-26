import java.util.ArrayList;
import java.util.List;
//Problem link: https://leetcode.com/problems/n-queens/
//Youtube link: https://youtu.be/i05Ju7AftcM

public class NQueenEfficient {

    public boolean queens(int col, int n, int[][] ans, List<List<String>> ansList, int[] firstHash, int[] secondHash, int[] thirdHash) {
        if(col==n) {
            List<String> arr = new ArrayList<>();
            for(int i=0;i<n;i++) {
                String ds="";
                for(int j=0;j<n;j++) {
                    if(ans[i][j]==1) ds+="Q";
                    else ds+=".";
                }
                arr.add(ds);
            }
            ansList.add(arr);
            return true;
        }

        for(int row=0;row<n;row++) {
            if(isSafe2(row,col,n,firstHash,secondHash,thirdHash)) {
                ans[row][col]=1;
                firstHash[row]=1;
                secondHash[row+col]=1;
                thirdHash[n-1+col-row]=1;
                queens(col+1,n,ans, ansList,firstHash,secondHash,thirdHash);
                ans[row][col]=0;
                firstHash[row]=0;
                secondHash[row+col]=0;
                thirdHash[n-1+col-row]=0;
            }
        }
        return false;
    }

    public boolean isSafe2(int row, int col,int n, int[] firstHash, int[] secondHash, int[] thirdHash) {
        if(firstHash[row]==1 || secondHash[row+col]==1 || thirdHash[n-1+col-row]==1) return false;
        return true;
    }
}
