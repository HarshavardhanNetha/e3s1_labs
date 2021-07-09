#include <stdio.h>

int main(){
	
	int n;
	int arr_time[20],burst_time[20];
	int comp_time[20],turn_ar_time[20],wait_time[20],resp_time[20],dup_burst[20];
	int quantum_time;
	int queue[100], start=0,end=0;
	int avg_tat,avg_wt;
	
	printf("Enter no. of processes (Max 20):");
	scanf("%d",&n);
	
	int i,j,k;
	for(i=0;i<n;i++){
		printf("Enter Arrival Time <space> Burst Time (P%d):",i+1);
		scanf("%d %d",&arr_time[i],&burst_time[i]);
		dup_burst[i]=burst_time[i];
	}
	int visit[20] = {0};
	printf("Enter the time quantum:");
	scanf("%d",&quantum_time);
	
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(arr_time[j]>arr_time[j+1]){
				//swap in one line
				burst_time[j]=burst_time[j]+burst_time[j+1]-(burst_time[j+1]=burst_time[j]);
				arr_time[j]=arr_time[j]+arr_time[j+1]-(arr_time[j+1]=arr_time[j]);
			}
		}
	}
	int time=arr_time[0];
	int min=0;
	queue[0]=0;
	start=1;
	for(i=1;i<n;i++){
		if(arr_time[i]==time)
			queue[start++]=i;
	}
	//printf("|%d|",time);
	while(1){
		if(start==end)
			break;
		min=queue[end++];
		
		if(dup_burst[min]>=quantum_time){
			dup_burst[min]-=quantum_time;
			k=quantum_time;
		}
		else{
			k=dup_burst[min];
			dup_burst[min]=0;
		}
		if(dup_burst[min]==0){
			visit[min]=1;
			comp_time[min]=time+k;
			turn_ar_time[min]=comp_time[min]-arr_time[min];
			wait_time[min]=turn_ar_time[min]-burst_time[min];
		}
		for(i=0;i<n;i++){
			if(visit[i]==0 && arr_time[i]>time && arr_time[i]<=time+k)
				queue[start++]=i;
		}
		if(dup_burst[min]>0)
			queue[start++]=min;
		time=time+k;
		//printf("P%d|%d|",min+1,time);
	}
	
	for(i=0;i<n;i++){
		//resp_time = 
	}
	printf("\nRound Robin Scheduling Algorithm\n");
	printf("P(ID)\tArrival Time\tBurst Time\tCompletion Time\tTurn-around Time\tWaiting Time\tResponse Time\n");
	for(i=0;i<n;i++){
		printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n",i+1,arr_time[i],burst_time[i],comp_time[i],turn_ar_time[i],wait_time[i],wait_time[i] );
		avg_wt+=wait_time[i];
		avg_tat+=turn_ar_time[i];
	}

	printf("Average Turn-around Time: %d\nAverage Waiting Time: %d\n",avg_tat/n,avg_wt/n);
	
}
