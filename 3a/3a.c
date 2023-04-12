#include<reg51.h>
void delay(int t);
void main(){
	P1=00000000;
	while(1){
		P1++;
		delay(100);
	}
}

void delay(int t){
	int i,j;
	for(i=0;i<t;i++){
		for(j=0;j<23;j++);
	}
}