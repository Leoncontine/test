import java.util.*;

public class CSP1 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            Set<Integer> set=new TreeSet<>();
            int num=input.nextInt();
            for(int i=0;i<num;i++)
            {
                set.add(input.nextInt());
            }
        
            System.out.print(set.size());
            System.out.print('\n');
            
            for(Integer nums :set)
            {
                System.out.print(nums);
                System.out.print(" ");
            }

            input.close();
       }
   }
   