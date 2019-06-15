#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d\n%d\n",&a,&b,&c);
  if(a>b&&a>c)
  {
    if(b>c)
      printf("second gratest = %d",b);
    else
      printf("second greatest = %d",c);
  }
  else if(b>c)
  {
    if(a>c)
      printf("second greatest = %d", a);
    else
      printf("second greatest = %d",c);
  }
  else
    printf("second greatest = %d",b);
      
  return 0;
    
}