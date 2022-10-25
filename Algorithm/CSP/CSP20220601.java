import java.util.*;

public class CSP20220601 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double []num=new double [n];
        double sum=0;
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextDouble();
            sum+=num[i];
        }

        double var_sum=0.0;
        for(int i=0; i<n;i++){
            var_sum+=(num[i]-sum)*(num[i]-sum);
        }

        for(int i=0;i<n;i++)
        {
            double temp=(n*num[i]-sum)/Math.pow(var_sum*n, 1/2);
            System.out.print(temp);
        }
        
        sc.close();

    }
}
