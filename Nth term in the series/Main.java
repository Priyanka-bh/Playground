#include<stdio.h>

int main()
{
  int n,res;
  scanf("%d", &n);
   if(n%2==1)
   {
     res=n-1;
     printf("%d",res);
   }
  else
  {
    res=(n/2-1);
    printf("%d",res);
  }
  return 0;
  // Type your code here
}