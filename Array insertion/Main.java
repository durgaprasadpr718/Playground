#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,pos,val;
  std::cout<<"Enter the number of elements in the array\n"; 
  std::cin>>n;
  int a[n+1];
  std::cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  a[n]=0;
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>pos;
  if(pos<=n)
  {
  std::cout<<"Enter the value to insert\n";
  std::cin>>val;
  for(int i=n;i>=pos;i--)
    a[i]=a[i-1];
  a[pos-1]=val;
  std::cout<<"Array after insertion is\n";
  for(int i=0;i<=n;i++)
    std::cout<<a[i]<<"\n";
}
  else
    std::cout<<"Invalid Input";
}