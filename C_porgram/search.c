#include <cs50.h>
#include <stdio.h>
#include <string.h>


int main(void)
{
    string strings[] = {"battleship", "boot", "cannon", "iron", "thimble", "top hat"};

    string s = get_string("String: ");

    for (int i = 0; i < 6; i ++){
        if ( strcmp(s, strings[i]) == 0)
        {
            printf("Found in %d\n",i);
            return 0;
        }

    }
    printf("Not found\n");
    return 1;
}