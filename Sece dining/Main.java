#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  int rail;
  cin>>str>>rail;
  if(str == "front")
  {
    if( rail == 1)
    {
      cout<<"Left Handed";
    }
    else 
    {
      cout<<"Right Handed";
    }
  }
  else
  {
    if(  rail ==1)
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
  //Type your code here.
}