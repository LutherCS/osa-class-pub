/*
 * Multithreading in C++
 */
#include <iostream>
#include <thread>
#include <chrono>


using namespace std;

void foo() {
    for (int i = 0; i < 10; i++) {
        cout << "foo\n";
        this_thread::sleep_for(chrono::milliseconds(200));
    }
}

void bar(int x) {
    for (int i = 0; i < 10; i++) {
        cout << "bar\n";
        this_thread::sleep_for(chrono::milliseconds(200));
    }
}

int main() {
    /* Create two new threads that call foo() and bar(0), respectively */
    thread first(foo);
    thread second(bar, 0);

    cout << "main, foo, and bar are running concurrently...\n";

    /* Use join to wait and synchronize threads */
    first.join();
    second.join();

    cout << "foo and bar completed\n";

    return 0;
}