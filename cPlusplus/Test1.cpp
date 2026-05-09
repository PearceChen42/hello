#include <iostream> // Header
#include "TestingHeader.h"
// #include is - Pre Processor directive
// Headers --> 1. Pre-existing Headers
// 2. user defined headers


// PPD tells the compiler to process the files
// in header for compilation
int main()
{
    std::cout << "Hello World!\n";
    int x = addNumbers(2,2);
    std::cout << x ;
}