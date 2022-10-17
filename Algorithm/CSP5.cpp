#include <iostream>
#include <cstdio>
#include <cmath> 
#include <cstring>
#include <algorithm>

using namespace std;
const int N=200005;
typedef long long LL;

struct point
{
    /* data */
    double x;
    double y;
}p[N];

int temp[N];

bool cmp(const point &a,const point &b)
{
    if(a.x==b.x)
        return a.y<b.y;
    else return  a.x<b.x;
}

bool cmpy(const int &a,const int &b)
{
	return p[a].y<p[b].y;
}

double dis(int i,int j)
{
	return sqrt((p[i].x-p[j].x)*(p[i].x-p[j].x)+(p[i].y-p[j].y)*(p[i].y-p[j].y));
}

double merge(int l,int r)
{
    double res=0x3f3f3f3f;
    if(l>=r)
	    return res;
    if(l==r-1)
        return dis(l,r);

    int mid=(l+r)>>1;

    res=min(merge(l,mid),merge(mid+1,r));

    int k=0;

    for(int i=l;i<=r;i++)
    {
        if(fabs(p[mid].x-p[i].x)<=res) 
		{
			temp[k++]=i;  //横向符合要求的点已经筛选出来，最终的成对的点都在temp数组里面找 
		} 
    }
    sort(temp,temp+k,cmpy); 

	for(int i=0;i<k;i++) 
	{
		for(int j=i+1;j<k;j++) 
		{
			if(fabs(p[temp[j]].y-p[temp[i]].y)<res)  //纵向也要符合要求
			    res=min(res,dis(temp[j],temp[i]));   //结果的更新 
		}
	}

    return res;
}


int main()
{
    int n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>p[i].x>>p[i].y;
    }
    sort(p,p+n,cmp);
    printf("%.4lf\n",merge(0,n-1));
    return 0;
}