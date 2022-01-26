import java.util.*;
//Problem link: https://leetcode.com/problems/n-queens/
//Youtube link: https://youtu.be/i05Ju7AftcM

public class NQueenBrute {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ansList = new ArrayList<>();
        int[][] ans=new int[n][n];
        queens(0,n,ans,ansList);
        return ansList;
    }

    public boolean queens(int col, int n, int[][] ans, List<List<String>> ansList) {
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
            if(isSafe(row,col,n,ans)) {
                ans[row][col]=1;
                queens(col+1,n,ans, ansList);
                ans[row][col]=0;
            }
        }
        return false;
    }

    public boolean isSafe(int row, int col,int n, int[][] ans) {
        for(int i=row,j=col;i>=0 && j>=0;j--) {
            if(ans[i][j]==1) return false;
        }
        for(int i=row,j=col;i<n && j>=0;i++,j--) {
            if(ans[i][j]==1) return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
            if(ans[i][j]==1) return false;
        }
        return true;
    }





}
