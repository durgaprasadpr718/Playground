#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int target;
  std::cin>>target;
  int n,marks=0,count=0;
  do{
    count++;
    std::cin>>n;
    marks=marks+n;
  }
  while(marks<target);
  std::cout<<"The number of turns is "<<count;
}