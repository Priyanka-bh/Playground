#include<stdio.h>
#define pi 3.14
int main()
{
  float r, area=0;
  scanf("%f",&r);
  area = (pi*r*r);
  printf("%.2f",area);
  return 0;
}