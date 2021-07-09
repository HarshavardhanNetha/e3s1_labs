#include <stdio.h>
#include <stdbool.h>

int main(){
	
	int n;
	int arr_time[20],burst_time[20];
	int comp_time[20],turn_ar_time[20],wait_time[20],priority[20],dup_burst[20];
	
	int avg_tat,avg_wt;
	printf("Enter no. of processes (Max 20):");
	scanf("%d",&n);
	
	int i,j;
	for(i=0;i<n;i++){
		printf("Enter Priority <space> Arrival Time <space> Burst Time (P%d):",i+1);
		scanf("%d %d %d",&priority[i],&arr_time[i],&burst_time[i]);
		dup_burst[i]=burst_time[i];
	}
	int visit[20] = {0};
	
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(arr_time[j]>arr_time[j+1]){
				//swap in one line
				burst_time[j]=burst_time[j]+burst_time[j+1]-(burst_time[j+1]=burst_time[j]);
				arr_time[j]=arr_time[j]+arr_time[j+1]-(arr_time[j+1]=arr_time[j]);
				priority[j]=priority[j]+priority[j+1]-(priority[j+1]=priority[j]);
			}
		}
	}

	int time=arr_time[0];
	int min=0;
	//printf("|%d|",time);
	while(1)
	{
		bool flag=false;
		for(j=0;j<n;j++)
		{
			if(visit[j]==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			break;
		for(j=0;j<n;j++)
		{
			if(visit[j]==0 && arr_time[j]<=time)
			{
				min=j;
				break;
			}
		}
		for(j=0;j<n;j++)
		{
			if(visit[j]==0 && arr_time[j]<=time && priority[min]>priority[j])
				min=j;
		}
		time+=1;
		dup_burst[min]--;
		//printf("|P%d|%d|",min,time);
		if(dup_burst[min]==0)
		{
			visit[min]=1;
			comp_time[min]=time;
			turn_ar_time[min]=comp_time[min]-arr_time[min];
			wait_time[min]=turn_ar_time[min]-burst_time[min];
		}
	}
	
	printf("\nPreemptive Priority based Scheduling Algorithm\n");
	printf("P(ID)\tPriority\tArrival Time\tBurst Time\tCompletion Time\tTurn-around Time\tWaiting Time\tResponse Time\n");
	for(i=0;i<n;i++){
		printf("P%d\t\t%d\t%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n",i+1,priority[i],arr_time[i],burst_time[i],comp_time[i],turn_ar_time[i],wait_time[i],wait_time[i] );
		avg_wt+=wait_time[i];
		avg_tat+=turn_ar_time[i];
	}

	printf("Average Turn-around Time: %d\nAverage Waiting Time: %d\n",avg_tat/n,avg_wt/n);
}
