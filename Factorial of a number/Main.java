#include<iostream>
int main(){
int n,f=1,i;
std::cin>>n;
if(n<0) 
std::cout<<"Negative";
else
for(i=1;i<=n;++i) {
  f *=i;}
  std::cout<<f;
}