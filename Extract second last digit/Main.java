#include<stdio.h>
int main()
{
  int n, digit;
  scanf("%d", &n);
  digit = n/10;
  digit = digit%10;
  printf("%d", digit);
  //Type your code here
  return 0;
}