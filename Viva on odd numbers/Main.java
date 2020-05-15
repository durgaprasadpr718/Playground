#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0;
  float c=0;
  do{
    cin>>n;
    if(n<0)
      c-=1;
    else if(n%2==0)
      c-=0.5;
    else{
      c+=1;
      i++;
    }
  }
  while(n>0&&i<3);
  cout<<fixed;
  cout<<setprecision (1)<<c;
}