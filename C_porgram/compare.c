#include <cs50.h>
#include <stdio.h>
#include <string.h>

int main(void)
{
  string s = get_string("s:");
  string t = get_string("t: ");

  if ( *s == *t  && *(s+1) == *(t+1))
  {
    printf("Same first two char\n");

  }
  else
  {
    printf("Different\n");
  }
}