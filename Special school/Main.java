#include <iostream> 
#include<string>
using namespace std;
int main()
{ 
  string str1,str2; 
  getline(cin,str1);
  getline(cin,str2); 
  for(int i=0;i<str1.length()/2; i++)
  {  
    swap(str1[i],str1[str1.length()-1-i]);
  }  
  int flag = 1; 
  for(int i=0; i<=str1.size(); i++)  
    if(str1[i] != str2[i])
    {  
      flag = 0; 
      break;  
    }
  
  
  if(flag == 1)       cout<<"It is correct";  else      cout<<"It is wrong"; }
