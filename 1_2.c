#include<stdio.h>
#include<ctype.h>
int main()
{
    int t,n,i,flag=0,c=0;;
    char str[500];
    char ch[500];
    char dummy[5];
    scanf("%d",&t);
    while(t!=0)
    {
        scanf("%d",&n);
        gets(dummy);
        if(n>=1&&n<=500)
        {
            t--;
            c=0;
            flag=0;
            for(i=0;i<n;i++)
            {
                str[i]=getchar();
              if(isalpha(str[i])>0)
              {
                  ch[c]=str[i];
                  c++;
              }
            }
            ch[c]='\0';
            if(c==0)
            printf("Valid\n");
            else
            {
               if(ch[0]=='T')
               printf("Invalid\n");
               else
                if(ch[c-1]=='H')
                 printf("Invalid\n");
               else
               {
                   for(i=0;i<c;i++)
                    if(ch[i]==ch[i+1])
                   {
                       flag=1;
                       printf("Invalid\n");
                       break;
                   }
                   if(flag==0)
                    printf("Valid\n");
               }
 
               }
            }
 
 
        }
        return  0;
    } 