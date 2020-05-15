#include<iostream>
using namespace std;
int main()
{
  int rows,columns,tree;
  cin>>rows>>columns>>tree;
  int trees; 
  trees=rows*columns;
  if(tree % rows == 1)
  {
    cout<<"Yes";
  }
  else if( tree < rows )
  {
    cout<<"Yes";
  }
  else if( tree > (trees-rows))
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  //Type your code here.
}