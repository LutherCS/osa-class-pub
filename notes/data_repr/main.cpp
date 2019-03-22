//http://www.cplusplus.com/reference/climits/
//http://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
using namespace std;

#include <iostream>
#include <climits>

int main() {
    cout << "hello" << endl;
    int x = INT_MAX;
    cout << "x: " << x << endl;
    x = x + 1;
    cout << "x: " << x << endl;
    unsigned long long int very_long_int = ULLONG_MAX;
    cout << "max ulli: " << very_long_int << endl;

    int a = INT_MAX;
    int b = 1;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    a = a + b;
    b = a - b;
    a = a - b;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
}
