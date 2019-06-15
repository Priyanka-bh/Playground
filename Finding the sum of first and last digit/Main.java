#include <stdio.h>
int main() {
  int n, ld,fd,temp;
  scanf("%d", &n);
  temp=n;
  ld=n%10;
  while(temp>=10)
    temp=temp/10;
  fd=temp%10;
  int sum=ld+fd;
  printf("%d", sum);
	//Type your code
	return 0;
}