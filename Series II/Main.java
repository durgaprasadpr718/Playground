#include<iostream>
using namespace std;
int main()
{
  int n,i=0,x;
  cin>>n;
  while(n!=0)
  {
    x=(11+i)*(11+i);
    cout<<x<<" ";
    i=i+4;
    n--;
  }
}