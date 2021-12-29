//sjf
#include <stdio.h>

int main(){
	
	int n;
	int arr_time[20],burst_time[20],Pid[20];
	int comp_time[20],turn_ar_time[20],wait_time[20];
	//no special variable is required for response time as waiting time and response time are equal in preemptive
	int avg_tat=0,avg_wt=0;
	printf("Enter no. of processes (Max 20):");
	scanf("%d",&n);
	
	int i,j;
	for(i=0;i<n;i++){
		printf("Enter Arrival Time <space> Burst Time (P%d):",i+1);
		scanf("%d %d",&arr_time[i],&burst_time[i]);
		Pid[i]=i+1;
	}
	int visit[20] = {0};
	
	//sorting processes based on arrival_time
	//bubble sort
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(arr_time[j]>arr_time[j+1]){
				//swap in one line
				burst_time[j]=burst_time[j]+burst_time[j+1]-(burst_time[j+1]=burst_time[j]);
				arr_time[j]=arr_time[j]+arr_time[j+1]-(arr_time[j+1]=arr_time[j]);
				Pid[j]=Pid[j]+Pid[j+1]-(Pid[j+1]=Pid[j]);
			}
		}
	}
	
	int time=arr_time[0];
	int min=0;
	printf("|%d|",time);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(visit[j]==0 && arr_time[j]<=time){
				min=j;
				break;
			}
		}
		for(j=0;j<n;j++){
			if(visit[j]==0 && arr_time[j]<=time && burst_time[min]>burst_time[j])
				min=j;
		}
		time+=burst_time[min];
		printf("|P%d|%d|",Pid[min],time);
		visit[min]=1;
		comp_time[min]=time;
		turn_ar_time[min]=comp_time[min]-arr_time[min];
		wait_time[min]=turn_ar_time[min]-burst_time[min];
	}
	printf("\nShortest Job Next/First Scheduling Algorithm\n");
	printf("P(ID)\tArrival Time\tBurst Time\tCompletion Time\tTurn-around Time\tWaiting Time\tResponse Time\n");
	for(i=0;i<n;i++){
		printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n",Pid[i],arr_time[i],burst_time[i],comp_time[i],turn_ar_time[i],wait_time[i],wait_time[i] );
	}
	
	for(i=0;i<n;i++){
		avg_tat+=turn_ar_time[i];
		avg_wt+=wait_time[i];
	}

	printf("Average Turn-around Time: %d\nAverage Waiting Time: %d\n",avg_tat/n,avg_wt/n);
	
	return 0;

}
