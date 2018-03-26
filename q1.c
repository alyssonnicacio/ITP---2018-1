#include <stdio.h>

int main () {

	//vetor com 17 numeros
	int v[] = {1, 14, 17, 6, 5, 9, 2, 12, 8, 13, 10, 15, 11, 3, 4, 7, 16};
	int i, indiceMenor, aux;

	for (i = 0; i < 16; i++) {
		indiceMenor = 1;
		for (j = i+1; j < 17; j++) {
			if (v[j] < v[indiceMenor]) {
				indiceMenor = j;
			}
		}
		aux = v[i];
		v[i] = v[indiceMenor];
		v[indiceMenor] = aux;
	}

	return 0;
}
