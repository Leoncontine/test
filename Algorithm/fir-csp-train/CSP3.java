import java.math.BigInteger;
import java.util.Scanner;

public class CSP3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();

        BigInteger ans = new BigInteger(num1);
        BigInteger temp = new BigInteger(num2);

        System.out.println(ans.multiply(temp));

        sc.close();


    

    }
}
