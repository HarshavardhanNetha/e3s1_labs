#include <stdio.h>

int main(){
	
	int n;
	int arr_time[20],burst_time[20];
	int comp_time[20],turn_ar_time[20],wait_time[20];
	//no special variable is required for response time as waiting time and response time are equal in fcfs
	int avg_tat,avg_wt;
	printf("Enter no. of processes (Max 20):");
	scanf("%d",&n);
	
	int i;
	for(i=0;i<n;i++){
		printf("Enter Arrival Time <space> Burst Time (P%d):",i+1);
		scanf("%d %d",&arr_time[i],&burst_time[i]);
	}
	
	//complete time
	
	comp_time[0] = arr_time[0]+burst_time[0];

	for(i=1;i<n;i++){
		if(arr_time[i]>comp_time[i-1])
			comp_time[i]=arr_time[i]+burst_time[i];
		else
			comp_time[i] = comp_time[i-1]+burst_time[i];
	}

	//turn around time
	for (i = 0; i < n; i++)
		turn_ar_time[i]=comp_time[i]-arr_time[i];

	//waiting time
	for(i=0;i<n;i++)
		wait_time[i] = turn_ar_time[i] - burst_time[i];

	printf("P(ID)\tArrival Time\tBurst Time\tCompletion Time\tTurn-around Time\tWaiting Time\tResponse Time\n");
	for(i=0;i<n;i++){
		printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n",i+1,arr_time[i],burst_time[i],comp_time[i],turn_ar_time[i],wait_time[i],wait_time[i] );
		avg_wt+=wait_time[i];
		avg_tat+=turn_ar_time[i];
	}

	printf("Average Turn-around Time: %d\nAverage Waiting Time: %d\n",avg_tat/n,avg_wt/n);
}
