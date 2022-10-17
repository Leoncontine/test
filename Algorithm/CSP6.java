import java.util.*;

public class CSP6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int max=sc.nextInt();
        int cou=sc.nextInt();

        long [] nums=new long [cou];
        long ans=0;
        for(int i=0;i<cou;i++)
            nums[i]=sc.nextLong();

        Arrays.sort(nums);

        int l=0,r=nums.length-1;

        while(l<=r)
        {
            if(nums[l]+nums[r]<=max)
            {
                l++;
            }
            ans++;
            r--;
        }

        System.out.print(ans);

        sc.close();
    }
    
}
