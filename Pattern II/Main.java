#include<iostream>
using namespace std;
int main()
{
    int n,sum=1;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        if(i%2==0)
        {
            sum+=i;
            for(int j=1;j<=i;j++)
            {
                cout<<sum-j;
                if(j+1<=i)
                cout<<"*";
                
                
            }
        }
        else
        {
            for(int j=1;j<=i;j++)
            {
                cout<<sum;
                sum++;
                if(j+1<=i)
                cout<<"*";
            }
        }
        cout<<endl;
    }
}