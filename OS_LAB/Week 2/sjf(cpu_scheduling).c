  //program for the fcfs(cpu schedulign algorithm)
 
 #include<stdio.h>
 #include<stdlib.h>
 void main()
 {
 	int n,i,j;
 	printf("Enter the number of process:");
 	scanf("%d",&n);
 	int Pid[n],At[n],Bt[n],Ct[n],Ta[n],Wt[n],visit[n];
 	printf("Enter the PID arrival and burst time of process\n");
 	for(i=0;i<n;i++)
 	{
 		scanf("%d %d %d",&Pid[i],&At[i],&Bt[i]);
		 visit[i]=0;	
	}
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(At[j]>At[j+1])
			{
				Bt[j]=Bt[j]+Bt[j+1]-(Bt[j+1]=Bt[j]);
				At[j]=At[j]+At[j+1]-(At[j+1]=At[j]);
				Pid[j]=Pid[j]+Pid[j+1]-(Pid[j+1]=Pid[j]);	
			}
		}
	}
	int time=At[0];
	int min=0;
	printf("|%d|",time);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(visit[j]==0 && At[j]<=time)
			{
				min=j;
				break;
			}
		}
		for(j=0;j<n;j++)
		{
			if(visit[j]==0 && At[j]<=time && Bt[min]>Bt[j])
				min=j;
		}
		time+=Bt[min];
		printf("|P%d|%d|",Pid[min],time);
		visit[min]=1;
		Ct[min]=time;
		Ta[min]=Ct[min]-At[min];
		Wt[min]=Ta[min]-Bt[min];
	}
	
	printf("\n\n");
	printf("id\tAt\tBt\tCt\tTa\tWt\t\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t%d\t%d\t%d\t%d\t%d\n",Pid[i],At[i],Bt[i],Ct[i],Ta[i],Wt[i]);
	}
 }
