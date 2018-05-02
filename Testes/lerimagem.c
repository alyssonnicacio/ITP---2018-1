#include <stdio.h>

int main() {

	int imagem1[800][800];
	int imagem2[800][800];

	int w, h, max, i, j;
	char formato[3];

	//leitura da imagem1
	scanf("%s %d %d %d", formato, &w, &h, &max);
	for(i = 0; i < h; i++) {
		for(j = 0; j < w; j++) {
			scanf("%d", &imagem1[i][j]);
		}
	}

	//seu codigo para processar a imagem!
	for(i = 0; i < h; i++) {
		for(j = 0; j < w; j++) {
			imagem2[i][j] = imagem1[i][j]/2; //reduz a intensidade pela metade
		}
	}

	//escrita da imagem2
	printf("%s\n%d %d\n%d\n", formato, w, h, max);
	for(i = 0; i < h; i++) {
		for(j = 0; j < w; j++) {
			printf("%d ", imagem2[i][j]);
		}
		printf("\n");
	}



	return 0;
}
