#include <stdio.h>
void print_row(int n);

int main(void)
{
    const int n =3;

    // Print n rows
    for (int r = 0; r < n; r++)
    {
        print_row(n);
        
    }
}

void print_row(int n)
{
    for (int c = 0; c < 3; c++)
    {
        printf("#");
    }
    printf("\n");
}