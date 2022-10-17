#include<cstdio>
#include<iostream>
using namespace std;
int n,a[500001],b[500001];
long long ans;

void merge(int l,int r){
    if(l>=r)return ;
    int mid=(l+r)/2;
    merge(l,mid);
    merge(mid+1,r);
    int i=l,j=mid+1,k=l;

    while(i<=mid&&j<=r)
    {
        if(a[i]>a[j]){
            ans+=mid-i+1;
            b[k]=a[j];
            k++;
            j++;
        }
        else{
            b[k]=a[i];
            k++;
            i++;
        }
    }

    while(i<=mid){
        b[k++]=a[i];
        ++i;
    }
    while(j<=r){
        b[k++]=a[j];
        ++j;
    }
    for(int i=l;i<=r;i++)
        a[i]=b[i];
    return ;

}


int main(){
    cin>>n;
    for(int i=1;i<=n;i++)
        cin>>a[i];
    merge(1,n);
    cout<<ans;
    return ans;
}
