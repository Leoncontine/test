#include<algorithm>
#include<cstdio>
#include<cmath>
#include<iostream>
using namespace std;

int main()
{
    int len;
    cin>>len;
    string str;
    cin>>str;
    int left=0,right=str.length();
    string ans;
    
    while(left<=right)
    {
        if(str[left]<str[right])
        {
            int i=0;
            for(i = 0;left + i <= right; i++)
            {
			    if(str[left + i] < str[right])
                {
                    ans=ans+str[left+i];
                }
                else break;
            }
            left+=i;
        }
        else
        {
            int i=0;
            for(i = 0;left<= right-i; i++)
            {
			    if(str[left] < str[right-i])
                {
                    ans=ans+str[right-i];
                }
                else break;
            }
            right-=i;
        }
        cout<<ans;
        return 0;

    }
}