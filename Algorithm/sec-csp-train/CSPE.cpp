#include<iostream>
#include<cmath>
#include<algorithm>
#include<cstdio>
#include<string.h>

using namespace std;

int main()
{
    int count;
    cin >> count;
    string str[110];
    for (int i = 0; i < count; i++)
        cin >> str[i];

    int ans[110];

    for (int i = 0; i < count; i++)
    {
        ans[i] = str[i].size();

        for (int j = 0; j < str[i].size(); j++)
        {
            int temp = 0;
            while (j < str[i].size() && str[i][j] >= 'A' && str[i][j] <= 'Z')
            {
                temp++;
                j++;
            }
            if (temp > 1)
                ans[i] += 2;
            if (temp == 1)
                ans[i] += 1;
        }
    }

    for (int i = 0; i < count; i++)
        cout << ans[i] << endl;
        
    return 0;

}