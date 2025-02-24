#include <cs50.h>
#include <stdio.h>
float devision(void);

int main(void)
{
    long dollars = 1;
    while (1)
    {
        char c = get_char("Here's $%li. Double it and give it to next person?(y/n) ", dollars);
        if (c == 'y')
        {
            dollars *= 2;
        }
        else
        {
            break;
        }

    }
  
    printf("Here's $%li.\n", dollars);
    printf("Start devision\n");
    devision();
}

float devision(void)
{
   int x = get_int("x: ");
   int y = get_int("y: ");

    printf("%.5f\n", (float) x / y);
    return (float) x/y;
}

