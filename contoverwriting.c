#include<stdio.h>
int main()
{
FILE *fp;
fpos_t position;
fp=fopen("file.txt","w+");
fgetpos(fp,&position);
fputs("Hello!",fp);
fsetpos(fp,&position);
fputs("Haleluah!Bethelem ruins",fp);
fclose(fp);
return 0;
}
