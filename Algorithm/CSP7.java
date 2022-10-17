import java.util.Scanner;
/*
 * 应用差分法+前缀和
 * @author LeonCT
 */
public class CSP7 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]ans=new int [n+1][n+1];
        for(int  i=0;i<m;i++){
            int x1,y1,x2,y2;
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            for(int j=x1;j<=x2;j++)
            {
                ans[j][y1]++;
                ans[j][y2+1]--;
            }
        }
           
                
        sc.close();

        for(int i=1; i<=n; i++){//行
            for(int j=1; j<=n; j++){//列
              ans[i][j]+=ans[i][j-1];//对每行求前缀和
            }
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(ans[i][j]);
                System.out.print(" ");
            }
            System.out.print('\n');
        }

    }

}
