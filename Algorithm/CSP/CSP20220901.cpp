#include<stdio.h>
int main()
{
	int n, m;
	scanf("%d%d", &n, &m);
 
	int i;
	int a[21] = { 0 };
	for (i = 1; i <= n; i++)
	{
		scanf("%d", &a[i]);
	}
 
	int tmp = 1;
	int c[21] = { 0 };
	c[0] = 1;
	for (i = 1; i <= n; i++)
	{		
		tmp *= a[i];
		c[i] = tmp;
	}
 
	int b[21] = { 0 };
	tmp = 0;
    
	for (i = 1; i <= n; i++) 
	{	
		b[i] = m % c[i] - tmp;
		tmp += b[i];
	}
 
	for (i = 1; i <= n; i++)
	{
		printf("%d ", b[i] / c[i - 1]);//最后输出再除以Ci-1
	}
	return 0;
}