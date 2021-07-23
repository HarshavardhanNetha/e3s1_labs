//fifo page replacement algo

#include <stdio.h>

int main(){
	
	int i,j,k,page_len,page_frame,flag;
	int page_ref[20];
	
	printf("Enter no. of page references:");
	scanf("%d",&page_len);
	
	printf("Enter references <space seperated>:");
	for(i=0;i<page_len;i++){	//take page ref input
		scanf("%d",&page_ref[i]);
	}
	
	//print page references
	printf("Page reference: ");
	for(k=0;k<page_len;k++)
		printf("%d ",page_ref[k]);
	printf("\n");
	
	printf("Enter Page Frame Length:");
	scanf("%d",&page_frame);
	
	
	int queue[page_frame];
	for(k=0;k<page_frame;k++)
		queue[k]=-1;
	int start = -1, end = -1;
	
	for(i=0;i<page_len;i++){
		int temp = page_ref[i];
		flag = 0;
		for (j = 0; j < page_frame; j++){
			if(temp==queue[j]){
				printf("%d\tHit\t",temp);
				//queue print
				for(k=0;k<page_frame;k++)
					printf("%d ",queue[k]);
				printf("\n");
				flag=1;
				break;
			}
		}
		if(flag==0){
			if(start<page_frame-1){
				//enqueue directly at start position
				start++;
				queue[start]=temp;
				printf("%d\tMiss\t",temp);
				for(k=0;k<page_frame;k++)
					printf("%d ",queue[k]);
				printf("\n");
			}
			else{
				//increase rear dequeue the first arrived value
				end++;
				queue[end]=temp;
				printf("%d\tMiss\t",temp);
				for(k=0;k<page_frame;k++)
					printf("%d ",queue[k]);
				printf("\n");
			}
		}
	}
		
	return 0;
}
