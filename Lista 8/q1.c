#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
	char matricula[50], nome[50], entrada[50];
	float media, nota1, nota2, nota3;
	int encontrou = 0;
	
	gets(entrada);
	
	FILE *file = fopen("notas.csv", "r");

	while(fscanf(file, "%s %s %f %f %f", matricula, nome, &nota1, &nota2, &nota3) != EOF) {
		if(strcmp(entrada, nome) == 0) {
			media = (nota1+nota2+nota3) / 3;
			encontrou = 1;
			break;
		}
	}

	if(encontrou) {
		printf("%s %.2f\n", matricula, media);
	} else {
		printf("não encontrado\n");
	}

	fclose(file);

}
