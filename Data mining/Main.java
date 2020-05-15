#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,rem,count1=0,count2=0;
  std::cin>>n;
  while(n){
    rem=n%10;
    if(rem%2==0)
      count1=count1+rem;
    else
      count2=count2+rem;
    n=n/10;
  }
  if(count1==count2)
    std::cout<<"Yes";
  else
    std::cout<<"No";
  
}