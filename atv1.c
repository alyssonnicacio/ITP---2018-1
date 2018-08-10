#include <stdio.h>

int main (){

	int a,b;
	
	scanf("%d", &a);
	scanf("%d", &b);

	if(a == b){
		printf("%d\n",a * b);
	}if(a < b){
		printf("%d\n",b - a);
	}if(a > b){
		printf("%d\n",a - b);
	}
	return 0;
}
