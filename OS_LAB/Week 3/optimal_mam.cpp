#include<stdio.h>
int main()
{
int no_frames,no_pages,i,j,f1,f2,fault=0,f3,k,p,max;
printf("Enter number of frames:");
scanf("%d",&no_frames);
printf("Enter number of pages:");
scanf("%d",&no_pages);
int frames[no_frames],pages[no_pages],check[no_frames];
printf("Enter page reference string:");
for(i=0;i<no_pages;i++)
scanf("%d",&pages[i]);
for(i=0;i<no_frames;i++)
frames[i]=-1;
for(i=0;i<no_pages;i++)
{
f1=0,f2=0;
for(j=0;j<no_frames;j++)
{
if(pages[i]==frames[j])
{
f1=1;
f2=1;
break;
}
}
if(f1==0) //miss
{
for(j=0;j<no_frames;j++)
{
if(frames[j]==-1)
{
frames[j]=pages[i];
fault+=1;
f2=1;
break;
}
}
}
if(f2==0)
{
f3=0;
for(j=0;j<no_frames;j++)
{
check[j]=-1;
for(k=i+1;k<no_pages;k++)
{
if(frames[j]==pages[k])
{
check[j]=k;
break;
}
}
 }
for(j=0;j<no_frames;j++)
{
if(check[j]==-1)
{
p=j;
f3=1;
break;
}
}
 if(f3 ==0)
{
max=check[0];
p=0;
for(j =0; j < no_frames;j++)
{
if(check[j] > max)
{
max=check[j];
p=j;
}
}
 }
frames[p] = pages[i];
fault++;
 }printf("\n");
 printf("%d :",pages[i]);
 for(j = 0; j < no_frames;j++)
{
if(frames[j]!=-1)
printf("%d ", frames[j]);
 else
printf("- ");
 }
 }
 printf("\nPage Faults = %d", fault);
 }
