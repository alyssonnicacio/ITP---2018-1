#include <stdio.h>

int main() {

	unsigned char imagem1[800][800][3];
	unsigned char imagem2[800][800][3];

	int w, h, max, i, j;
	char formato[3];

	//leitura da imagem1
	scanf("%s %d %d %d", formato, &w, &h, &max);

	for(i = 0; i < h; i++) {
		for(j = 0; j < w; j++) {
			scanf("%hhu %hhu %hhu", &imagem1[i][j][0], &imagem1[i][j][1], &imagem1[i][j][2]);
		}
	}

	//seu codigo para processar a imagem!
	for(i = 0; i < h; i++) { 		//para cada linha i
		for(j = 0; j < w; j++) { 	//para cada coluna j
			imagem2[i][j][0] = imagem1[i][j][2]; //pixel (i, j) canal vermelho passa a ter o valor de (i, j) canal azul
			imagem2[i][j][2] = imagem1[i][j][0]; //pixel (i, j) canal azul passa a ter o valor de (i, j) canal vermelho
		}
	}

	//escrita da imagem2
	printf("%s\n%d %d\n%d\n", formato, w, h, max);
	for(i = 0; i < h; i++) {
		for(j = 0; j < w; j++) {
			printf("%hhu %hhu %hhu ", imagem2[i][j][0], imagem2[i][j][1], imagem2[i][j][2]);
		}
		printf("\n");
	}



	return 0;
}
