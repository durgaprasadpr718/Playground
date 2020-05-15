#include<iostream>
using namespace std;
int main()
{
  int n,x=2,i=0;
  cin>>n;
  if(n==1)
    cout<<i;
  else if(n>=2)
  {
    cout<<i<<" "<<x<<" ";
    n=n-2;
    while (n>=2)
    {
      x=x+(6+i);
      cout<<x<<" ";
      x=x+(6+i);
      cout<<x<<" ";
      i=i+4;
      n=n-2;
    }
    if(n==1)
      cout<<x+(6+i);
  }
}