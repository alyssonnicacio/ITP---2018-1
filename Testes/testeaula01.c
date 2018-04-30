#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
	int a, b;
	FILE *arq;
	arq = fopen("numeros.txt", "w");
	scanf("d%d%", &a, &b);
	for (i = a; i <= b; i++) {
		fprintf(arq, "%D", i)
	}

	fclose(arq);
	
	return 0;
}
