#include<stdio.h>
int main()
{
  int n1, sum;
  scanf("%d", &n1);
  sum = n1/100 + n1%10;
  printf("%d", sum);
  //Type your code here
  return 0;
}