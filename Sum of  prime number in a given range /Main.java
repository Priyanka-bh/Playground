#include<stdio.h>
int main()
{
  int n,sum=0,i,j,flag;
  scanf("%d",&n);
  for(i=2;i<n;i++)
  {
    flag=1;
    for(j=2;j<=i/2;j++)
    {
      if(i%j==0)
      {
        flag=0;
        break;
      }
    }
    if(flag==1)
    {
       sum=sum+i;
    }
  }
  printf("%d",sum);
  
  //Type youe code here
  return 0;
}