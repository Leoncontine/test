import java.util.HashMap;
import java.util.Scanner;

public class CSPB {
    public static void main(String[] args)
    {
        HashMap <String,Integer> fruits=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();

        String max=sc.nextLine();
        fruits.put(max, 1);

        for(int i=1;i<m;i++)
        {
            String temp=sc.nextLine();
            fruits.replace(temp, fruits.getOrDefault(temp,0)+1); 
            if(fruits.get(max)< fruits.get(temp))
                max=temp;
        }
        

        System.out.print(max);
        System.out.print('\n');

        boolean flag=true;
        for (Integer i : fruits.values()) {
            if(i%2!=0) flag=false;
        }
        if(flag==true)
            System.out.println("yes");
        else System.out.println("no");
        System.out.print('\n');

        sc.close();

    }
}
