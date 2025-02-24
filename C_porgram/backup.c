#include <stdio.h>

int main(void)
{
    typedef char *string;

    string s = "HI!";
    printf("%s\n", s);
    printf("%c\n", *s);
    printf("%c\n", *(s+1));
    printf("%c\n", *(s + 2));
    printf("%c\n", *(s + 3));
    
    
    


}