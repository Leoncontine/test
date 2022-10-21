import java.util.Scanner;
import java.math.BigInteger;

public class CSP4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cou=sc.nextInt();

        BigInteger ans = new BigInteger("1");
        BigInteger temp = new BigInteger("1");
        for(int i=2;i<=cou;i++)
        {
            BigInteger mul = new BigInteger(i+"");
            temp=temp.multiply(mul);
           // System.out.println(temp);
            ans=ans.add(temp);
           // System.out.println(ans);
        }
    
        System.out.print(ans);
        System.out.print('\n');

        sc.close();
    }
    
}
