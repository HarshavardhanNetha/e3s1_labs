//page replacement algo

#include <stdio.h>

int main(){
	
	int i,j,k,x,page_len,page_frame,flag;
	int page_ref[20] = {7,0,1,2,0,3,0,4,2,3,0,3,2,3};
	
	printf("Enter no. of page references:");
	//scanf("%d",&page_len);
	page_len = 14;
	
	printf("Enter references <space seperated>:");
	/*for(i=0;i<page_len;i++){	//take page ref input
		scanf("%d",&page_ref[i]);
	}*/
	
	//print page references
	printf("Page reference: ");
	for(k=0;k<page_len;k++)
		printf("%d ",page_ref[k]);
	printf("\n");
	
	printf("Enter Page Frame Length:\n");
	//scanf("%d",&page_frame);
	page_frame = 4;
	
	int queue[page_frame];
	//int len_q[page_frame];
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
				int len_q[page_frame] = {0};
				int end = 0;
				for(end=0;end<page_frame;end++){
					//check if it is there
					//if there, take the value of index into temp_min
					//out from loop, if used == 1 break; ---and temp_min<min;---					
					int var = queue[end];
					printf("%d \t %d---",var,end);
					for(x=0;x<i;x++){
						if(var == page_ref[x]){
							len_q[end]=x;
						}
					}
					
					for(x=0;x<4;x++)
						printf("%d ",len_q[x]);
					printf("\n\n");
					
					int tm=len_q[0];
					for(x=page_frame-1;x>=0;x--){
						if(tm>len_q[x])	
							tm=len_q[x];
					}
					
					//printf("%d----\n",tm);
					
					for(x=0;x<page_frame;x++){
						if(len_q[x]==tm){
							queue[x]=temp;
							break;
						}
					}
				}
				printf("%d\tMiss2\t",temp);
				for(k=0;k<page_frame;k++)
					printf("%d ",queue[k]);
				printf("\n");
			}
		}
	}
		
	return 0;
}


