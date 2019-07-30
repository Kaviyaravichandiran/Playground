#include<stdio.h>
int main()
{
  int a,b,c,d;
  scanf("%d",&a);
  b=a%1000;
  c=b%100;
  d=c/10;
  printf("%d",d);
  return 0;
}