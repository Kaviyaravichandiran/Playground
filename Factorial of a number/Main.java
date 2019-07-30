#include <stdio.h>
int main() {
	int n,sum=0,fact=1;
  scanf("%d",&n);
  for(int factorial=1;factorial<=n;factorial++)
  {
    fact=factorial*fact;
    
  }
  printf("%d",fact);
	return 0;
}