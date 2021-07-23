//optimal page ref: page replacement algo

#include <stdio.h>

int main(){
	
	int i,j,k,x,page_len,page_frame,flag;
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
			start++;
			if(start<page_frame){
				//enqueue directly at start position
				queue[start]=temp;
				printf("%d\tMiss\t",temp);
				for(k=0;k<page_frame;k++)
					printf("%d ",queue[k]);
				printf("\n");
			}
			else{
				//need to check whether we have use with elements in array
				//int min = -1;
				//check all elements in queue so ti iterate, using while loop
				int temp_end;
				for(temp_end=0;temp_end<page_frame;temp_end++){
					//check if it is there
					//if there, take the value of index into temp_min
					//out from loop, if used == 1 break; ---and temp_min<min;---					
					int used=0;
					int var = queue[temp_end];

					for(x=i+1;x<page_len;x++){
						if(var == page_ref[x]){
							used=1;
							break;
						}
					}
					if(used==0){
						queue[temp_end]=temp;
						printf("%d\tMiss2\t",temp);
						for(k=0;k<page_frame;k++)
							printf("%d ",queue[k]);
						printf("\n");
					}
				}
			}
		}
	}
		
	return 0;
}
