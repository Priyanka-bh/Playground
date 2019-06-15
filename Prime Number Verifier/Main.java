// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,i,count=0;
  scanf("%d",&n);
  if(n==0||n==1)
  {
    printf("neither");
    return 0;
  }
  if(n<0)
  {  
    printf("composite");
    return 0;
  }
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
      count++;
  }
  if(count==2)
     printf("prime");
  else
     printf("composite");
  return 0;
}