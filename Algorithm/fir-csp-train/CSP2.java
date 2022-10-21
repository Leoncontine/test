import java.util.Scanner;

class CSP2  {
    public static void main(String[] args)
    {
        String ans=new String();
        String temp=new String();
        Scanner sc=new Scanner(System.in);
        int cou=sc.nextInt();
        int [] xishu=new int [cou+1];
        for(int i=0;i<cou+1;i++)
            xishu[i]=sc.nextInt();
        
        if(xishu[0]!=0)
        {
            if(cou!=0)      
            {
                if(cou==1)
                    temp="x";
                if(cou>1)
                    temp="x^"+cou;
            }
            else
                temp="";
            if(xishu[0]<0)
            {
                if(xishu[0]!=-1)
                    ans=ans+xishu[0]+temp;
                else
                    ans=ans+"-"+temp;
            }
            else if(xishu[0]==1)
                ans= ans+temp;
            else 
                ans=ans+xishu[0]+temp;
        }

        for(int j=1;j<cou+1;j++)
        {
            if(xishu[j]!=0)
            {
                if(cou-j!=0)
                {
                    if(cou-j==1)
                        temp="x";
                    if(cou-j>1)
                        temp="x^"+(cou-j);
                }
                else
                    temp="";
                if(xishu[j]<0)
                {
                    if(xishu[j]!=-1)
                        ans=ans+xishu[j]+temp;
                    else
                        ans=ans+"-"+temp;
                }
                else if(xishu[j]==1)
                    ans= ans+"+"+temp;
                else 
                    ans=ans+"+"+xishu[j]+temp;
            }
        }

        System.out.print(ans);
        sc.close();
    }
}
