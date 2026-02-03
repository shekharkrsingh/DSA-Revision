package Graph;

import java.util.ArrayDeque;
import java.util.Queue;


class Pairs{
    Integer x;
    Integer y;
    Integer dis;
    Pairs(Integer x, Integer y, Integer dis){
        this.x=x;
        this.y=y;
        this.dis=dis;
    }
}

public class NearestCellWithOne {
    public static void main(String[] args) {
        int[][] mat= {  {0,0,0},
                        {0, 1, 0},
                        {1, 0, 0}};
        int[][] vis= {{0,0,0}, {0, 0, 0,}, {0,0,0}};
        int[][] res= {{0,0,0}, {0, 0, 0,}, {0,0,0}};
        Queue<Pairs> qu= new ArrayDeque<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    qu.offer(new Pairs(i, j, 0));
                    vis[i][j]=1;
                }
            }
        }
        while(!qu.isEmpty()){
            Pairs node= qu.poll();
            int x=node.x;
            int y=node.y;
            int dis=node.dis;
            if(x-1>=0 && mat[x-1][y]==0 && vis[x-1][y]==0){
                vis[x-1][y]=1;
                res[x-1][y]=dis+1;
                qu.offer(new Pairs(x-1, y, dis+1));
            }
            if(x+1<n && mat[x+1][y]==0 && vis[x+1][y]==0){
                vis[x+1][y]=1;
                res[x+1][y]=dis+1;
                qu.offer(new Pairs(x+1, y, dis+1));
            }
            if(y-1>=0 && mat[x][y-1]==0 && vis[x][y-1]==0){
                res[x][y-1]=dis+1;
                vis[x][y-1]=1;
                qu.offer(new Pairs(x, y-1, dis+1));
            }
            if(y+1<m && mat[x][y+1]==0 && vis[x][y+1]==0){
                vis[x][y+1]=1;
                res[x][y+1]=dis+1;
                qu.offer(new Pairs(x, y+1, dis+1));
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
