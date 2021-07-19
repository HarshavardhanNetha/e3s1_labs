#include <stdio.h>

int main(){
	
	int list[20];
	int n,i;
	int prev = 50, sum = 0;
	
	printf("Enter number of inputs:");
	scanf("%d",&n);
	printf("Input numbers:");
	for(i=0;i<n;i++){
		scanf("%d",&list[i]);
	}
	//int flag=0;
	for(i=0;i<n;i++){
		if(list[i]>prev){
			sum+=list[i]-prev;
			printf("(%d - %d) ",list[i],prev);
			prev = list[i];
		}
		else{
			sum+=prev-list[i];
			printf("(%d - %d) ",prev,list[i]);
			prev = list[i];
		}
	}
	printf(" = %d",sum);
	return 0;
}
