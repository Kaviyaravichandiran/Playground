#include<stdio.h>
int main()
{
  int year,a;
  scanf("%d",&year);
  a=year%4;
  if(a==0)
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
  return 0;
}