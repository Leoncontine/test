#include<algorithm>
#include<cstdio>
#include<cmath>
#include<iostream>
using namespace std;

int main()
{
    int len=0;
    cin>>len;
    int count=0;
    cin>>count;

    int *num=new int(count);

    int min_val=0,max_val=0;

    for(int i=0;i<count;i++)
    {
        cin>>num[i];
        if(min_val < min(num[i], len - num[i])){
                min_val = min(num[i], len- num[i]);
            }
            if(max_val < max(num[i],len - num[i])){
                max_val = max(num[i], len- num[i]);
            }
    }
     printf("%d %d\n", min_val, max_val );

}