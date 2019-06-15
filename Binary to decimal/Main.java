#include<stdio.h>
int main()
{
  //Type your code here
  int num,binary,decimal,base=1,rem;
  scanf("%d",&num);
  binary=num;
  while(num>0)
  {
    rem=num%10;
    decimal=decimal+rem*base;
    num=num/10;
    base=base*2;
  }
  printf("%d", decimal);
  return 0;
}