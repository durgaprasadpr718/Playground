#include<iostream>
using namespace std;
int main()
{
  int box1,box2,box3;
    int largest,second;
  cin>>box1>>box2>>box3;
    if(box1<box2){ 
      largest = box2;
      second = box1;
   }
   else{ 
      largest = box1;
      second = box2;
   }
if (box3 > largest) {
         second = largest;
         largest = box3;
      }
      /* If current array element is less than largest but greater
       * then second largest ("second" variable) then copy the
       * element to "second"
       */
      else if (box3 > second && box3 != largest) {
         second = box3;
      }                                                                   
    	
  cout<<"The treasure is in box which has number "<<second;
    	
    	
  
  
  
  
  if(box1%box1==0 && box2%box1==0 && box3%box1==0)
  {
    cout<<"\nThe code to open the box is "<<box1;
  }
  else if(box1%box2==0 && box2%box2==0 && box3%box2==0)
  {
    cout<<"\nThe code to open the box is "<<box2;
  }
  else if(box1%box3==0 && box2%box3==0 && box3%box3==0)
  {
    cout<<"\nThe code to open the box is "<<box3;
  }
  else
  {
   	 cout<<"\nThe code to open the box is 1";
  }
  
  
  //Type your code here.
}