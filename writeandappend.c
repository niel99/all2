#include<stdio.h>
void main()
{
FILE *fp1,*fp2;
char a;
fp1=fopen("test.txt","r");
if(fp1==NULL)
{
puts("Cannot open this file");
}
fprintf(fp1,"Good morning....Good night");
fp2=fopen("test1.txt","w");
if(fp2==NULL)
{
puts("Cannot open this file");
fclose(fp1);
}
do{
a=fgetc(fp1);
fputc(a,fp2);
}
while(a!=EOF);
}
