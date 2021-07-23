#include <stdio.h>

int main(){
	
	int list1[20], list2[20];
	int n,i,j;
	int prev = 50, sum = 0;
	
	printf("Enter number of inputs:");
	scanf("%d",&n);
	printf("Input numbers:");
	int l1=0, l2=0;
	for(i=0;i<n;i++){
		int temp;
		scanf("%d",&temp);
		
		if(temp<50){
			list1[l1]=temp;
			l1++;
		}
		else{
			list2[l2]=temp;
			l2++;
		}
	}
	
	int list[l1+l2];
	
	//sort list1 descending and list2 ascending
	int max;
	int point = 0;

	while(point<l1){

		max = list1[point];
		int temp = max;
		for(j=point+1;j<l1;j++){
			if(max<list1[j]){
				max=list1[j];
				list1[j]=temp;
				temp = max;
			}
		}
		list1[point]=max;
		point++;
	}
	//list 1 sorted descending
	
	
	int min;
	point = 0;

	while(point<l2){

		min = list2[point];
		int temp = min;
		for(j=point+1;j<l2;j++){
			if(min>list2[j]){
				min=list2[j];
				list2[j]=temp;
				temp = min;
			}
		}
		list2[point]=min;
		point++;
	} //list 2 sorted ascending
		
	//combining as single list and fcfs is executed
	int x_ind = 0;
	//adding list1 elements to list
	for(i=0;i<l1;i++){
		list[x_ind]=list1[i];
		x_ind++;
	}
	//adding list2 elements to list	
	for(i=0;i<l2;i++){
		list[x_ind]=list2[i];
		x_ind++;
	}	
	
	//print list
	for(i=0;i<l1+l2;i++)
		printf("%d ",list[i]);
	printf("\n");
	
	//execute fcfs logic
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
