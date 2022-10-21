import java.util.Scanner;

public class CSP8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cou=sc.nextInt();

        long [] nums=new long [cou];
        long ans=0;
        nums[0]=sc.nextLong();
        
        long big=nums[0],small=nums[0];

        for(int i=1;i<cou;i++)
        {
            nums[i]=sc.nextLong();
            if(nums[i]<small)
            {
                small=Math.min(small,nums[i]);
                ans+=i;
            }
            else if(nums[i]==small)
            {
                ans+=i-1;
            }
            else if(nums[i]>big)
                big=Math.max(big,nums[i]);
            else
            {
                for(int j=i;j>=0;j--)
                    if(nums[j]<nums[i])
                        ans++;
            }
            
        }

        System.out.print(ans);

        sc.close();
    }
    
}
