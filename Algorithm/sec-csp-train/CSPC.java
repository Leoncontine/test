import java.util.*;

public class CSPC {
    static int[] dx = {1,1,1, 0, 0,-1,-1 -1};
    static int[] dy = {0,1,-1,1,-1,1,0,-1};
    static Queue<int[]> queue = new LinkedList<int[]>();
    static int ans=0;

    public static void bfs(char[][]grid)
    {
        int m=grid.length,n=grid[0].length;
        while (!queue.isEmpty()) 
        {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int k = 0; k < 8; k++) 
            {
            int mx = x + dx[k], my = y + dy[k];
                if (mx >= 0 && mx < m && my >= 0 && my < n && grid[mx][my] =='w') 
                {
                    grid[mx][my] = '.';
                    queue.offer(new int[]{mx, my});
                }
            }
        }
        ans++;
    }

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        char [][]grid=new char[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=sc.nextInt();
                
                grid[i][j]=(char)temp;
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='w')
                {
                    queue.offer(new int[]{i, j});
                    bfs(grid);
                }
            }
        }

       sc.close();
       System.out.println(ans);
        

    }
}
