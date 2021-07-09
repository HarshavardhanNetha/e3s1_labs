//round robin
#include<stdio.h>

struct procs {
    int arr_time, burst_time, complete_time, turn_around_time, wait_time, respond_time, temp_burst_time;
}p[20];
struct gant {
    int pind, work_complete_time;
}g[20];
int main(){
    int n, i, pid = 0, ready_que[20], time_quant, r = -1, f = -1, j, gi = 0;
    float avg_tat, avg_wt, sum = 0;
    printf("Enter no. of processes (Max 20) and time quantum:");
    scanf("%d %d", & n, & time_quant);
    for (i = 0; i < n; i++) {
        printf("Enter Arrival Time <space> Burst Time (P%d):", i + 1);
        scanf("%d %d", & p[i].arr_time, & p[i].burst_time);
        p[i].temp_burst_time = p[i].burst_time;
    }
    r++;
    ready_que[r] = pid;
    while (r != f) {
        f++;
        if (gi == 0) {
            if (p[ready_que[f]].temp_burst_time > time_quant) {
                g[gi].pind = ready_que[f];
                g[gi].work_complete_time = time_quant;
                p[gi].temp_burst_time = p[gi].temp_burst_time - time_quant;
            } else {
                g[gi].pind = ready_que[f];
                g[gi].work_complete_time = p[gi].temp_burst_time;
                p[gi].temp_burst_time = 0;
            }
        } else {
            if (p[ready_que[f]].temp_burst_time > time_quant) {
                g[gi].pind = ready_que[f];
                g[gi].work_complete_time = g[gi - 1].work_complete_time + time_quant;
                p[ready_que[f]].temp_burst_time = p[ready_que[f]].temp_burst_time - time_quant;
            } else {
                g[gi].pind = ready_que[f];
                g[gi].work_complete_time = g[gi - 1].work_complete_time + p[ready_que[f]].temp_burst_time;
                p[ready_que[f]].temp_burst_time = 0;
            }
        }
        int max = g[gi].work_complete_time;
        gi++;
        for (i = pid + 1; i < n; i++) {
            if (pid < n) {
                if (p[i].arr_time <= max) {
                    r++;
                    pid++;
                    ready_que[r] = pid;
                }
            }
        }
        if (p[ready_que[f]].temp_burst_time > 0) {
            r++;
            ready_que[r] = ready_que[f];
        }
    }
    pid = 0;
    while (pid < n) {
        for (i = 0; i < gi; i++) {
            if (g[i].pind == pid)
                p[pid].complete_time = g[i].work_complete_time;
        }
        pid++;
    }
    for (i = 0; i < n; i++) {
        p[i].turn_around_time = p[i].complete_time - p[i].arr_time;
        p[i].wait_time = p[i].turn_around_time - p[i].burst_time;
    }
    pid = 0;
    while (pid < n) {
        for (i = 0; i < gi; i++) {
            if (g[i].pind == pid) {
                p[pid].respond_time = g[i - 1].work_complete_time - p[pid].arr_time;
                break;
            }
        }
        pid++;
    }
	
	printf("\nRound Robin Scheduling Algorithm\n");
	printf("P(ID)\tArrival Time\tBurst Time\tCompletion Time\tTurn-around Time\tWaiting Time\tResponse Time\n");
	for(i=0;i<n;i++){
		printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n",i+1,p[i].arr_time,p[i].burst_time,p[i].complete_time,p[i].turn_around_time,p[i].wait_time,p[i].respond_time);
		avg_wt+=p[i].wait_time;
		avg_tat+=p[i].turn_around_time;
	}

	printf("Average Turn-around Time: %f\nAverage Waiting Time: %f\n",avg_tat/n,avg_wt/n);
	
	return 0;
}
