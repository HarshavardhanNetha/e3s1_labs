#include<stdio.h>
struct procs
{
	int priority,arr_time,burst_time,complete_time,turn_around_time,wait_time,respond_time,temp_burst_time,flag;
}p[20];
struct gant
{
	int pind,work_complete_time;
}g[20];
int gant(int n){
	int i,pid=0,time_quant=1,j,gi=0,sum=0;
	g[gi].pind=0;
	g[gi].work_complete_time=1;
	if(p[gi].temp_burst_time>time_quant){
		p[gi].temp_burst_time=p[gi].temp_burst_time-time_quant;
	}
	else{
		p[gi].temp_burst_time=0;
	}
	for(i=0;i<n;i++){
		sum=sum+p[i].burst_time;
	}
	while(gi<sum){
		int a[20],pid=0;
		for(i=0;i<n;i++){
			if((p[i].arr_time<=g[gi].work_complete_time)&&p[i].flag==0){
				a[pid]=i;
				pid++;
			}
		}
		int mi=a[0],max=p[a[0]].priority;
		for(j=1;j<pid;j++){
			if(p[a[j]].priority<max){
				mi=a[j];
			}
		}
		gi++;
		g[gi].pind=mi;
		g[gi].work_complete_time=g[gi-1].work_complete_time+time_quant;
		p[mi].temp_burst_time=p[mi].temp_burst_time-time_quant;
		if(p[mi].temp_burst_time==0){
			p[mi].flag=1;
		}
	}
	return gi;
}
int main(){
	int n,i,pid=0,gi;
	float avg_tat,avg_wt,sum=0;
	printf("Enter no. of processes (Max 20):");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("Enter Priority <space> Arrival Time <space> Burst Time (P%d):",i+1);
		scanf("%d %d %d",&p[i].priority,&p[i].arr_time,&p[i].burst_time);
		p[i].temp_burst_time=p[i].burst_time;
		p[i].flag=0;
	}
	gi=gant(n);
	while(pid<n){
		for(i=0;i<gi;i++){
			if(g[i].pind==pid)
				p[pid].complete_time=g[i].work_complete_time;
		}
		pid++;
	}
	for(i=0;i<n;i++){
		p[i].turn_around_time=p[i].complete_time-p[i].arr_time;
		p[i].wait_time=p[i].turn_around_time-p[i].burst_time;
	}
	pid=0;
	p[pid].respond_time=0;
	pid++;
	while(pid<n){
		for(i=0;i<gi;i++){
			if(g[i].pind==pid){
				p[pid].respond_time=g[i-1].work_complete_time-p[pid].arr_time;
				break;
			}	
		}
		pid++;
	}
	
	printf("\nPreemptive Priority based Scheduling Algorithm\n");
	printf("P(ID)\tPriority\tArrival Time\tBurst Time\tCompletion Time\tTurn-around Time\tWaiting Time\tResponse Time\n");
	for(i=0;i<n;i++){
		printf("P%d\t\t%d\t%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n",i+1,p[i].priority,p[i].arr_time,p[i].burst_time,p[i].complete_time,p[i].turn_around_time,p[i].wait_time,p[i].respond_time);
		avg_wt+=p[i].wait_time;
		avg_tat+=p[i].turn_around_time;
	}

	printf("Average Turn-around Time: %f\nAverage Waiting Time: %f\n",avg_tat/n,avg_wt/n);	
	
}
