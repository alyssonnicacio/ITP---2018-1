#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {

	char nomeDigitado[100];
	char nomeArquivo[100];
	FILE *arq;
	int encontrou = 0;

	arq = fopen("nomes.txt", "r");

	printf("Digite um nome: ");
	scanf("%s", nomeDigitado);

	while(fscanf(arq, "%s", nomeArquivo) != EOF) {
		if(strcmp(nomeDigitado, nomeArquivo) == 0) {
			encontrou = 1;
			break;
		}
	}

	if(encontrou == 1) {
		printf("Registro encontrado\n");
	} else {
		printf("Registro nao encontrado\n");
	}

	fclose(arq);

	return 0;
}

