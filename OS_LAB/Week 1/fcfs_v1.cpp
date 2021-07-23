//FCFS CPU SCHEDULING B171325

#include<stdio.h>

int main()
{
    int n,avg_wt=0,avg_tat=0,i,j;
    int burst_time[20],wait_time[20],turn_around_time[20];
    printf("Enter no of processes:");
    scanf("%d",&n);
 
    printf("\nEnter burst time of process\n");
    for(i=0;i<n;i++)
    {
        printf("P[%d]:",i+1);
        scanf("%d",&burst_time[i]);
    }
 
    wait_time[0]=0;
 
    for(i=1;i<n;i++)
    {
        wait_time[i]=0;
        for(j=0;j<i;j++)
            wait_time[i]+=burst_time[j];
    }
 
    printf("\nProcess\t\tBurst Time\tWaiting Time\tTurnaround Time");
 
    for(i=0;i<n;i++)
    {
        turn_around_time[i]=burst_time[i]+wait_time[i];
        avg_wt+=wait_time[i];
        avg_tat+=turn_around_time[i];
        printf("\nP[%d]\t\t%d\t\t%d\t\t%d",i+1,burst_time[i],wait_time[i],turn_around_time[i]);
    }
 
    avg_wt/=i;
    avg_tat/=i;
    printf("\n\nAverage Waiting Time:%d",avg_wt);
    printf("\nAverage Turnaround Time:%d",avg_tat);
 
    return 0;
}
