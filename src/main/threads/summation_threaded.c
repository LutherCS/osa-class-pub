/* Multi-threaded summation */

#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <time.h>

#define NUM_OF_THREADS 10

long sum = 0;
long number;

void *summer(void *param)
{
    int id = (uintptr_t)param;
    long partSum = 0;
    printf("thread #%3d (%ld)\n", id, pthread_self());
    long lower = number / NUM_OF_THREADS * id + 1;
    long upper = number / NUM_OF_THREADS * (id + 1);

    printf("calculating sum between %ld and %ld\n", lower, upper);
    for (long i = lower; i <= upper; i++)
    {
        partSum += i;
    }

    pthread_exit((void *)partSum);
}

int main(int argc, char *argv[])
{
    pthread_t threads[NUM_OF_THREADS];
    clock_t t;
    void *partSum;

    if (argc != 2)
    {
        fprintf(stderr, "usage: %s [number]\n", argv[0]);
        return -1;
    }

    number = atol(argv[1]);
    if (number < 1)
    {
        fprintf(stderr, "%ld must be positive\n", number);
        return -1;
    }

    // printf("creating %d threads\n", NUM_OF_THREADS);
    t = clock();
    for (size_t i = 0; i < NUM_OF_THREADS; i++)
    {
        pthread_create(&threads[i], NULL, summer, (void *)i);
    }
    for (size_t i = 0; i < NUM_OF_THREADS; i++)
    {
        pthread_join(threads[i], &partSum);
        sum += (long)partSum;
    }
    t = clock() - t;

    printf("sum = %ld\n", sum);
    if (t < 500000)
    {
        printf("calculated in %3.1f μseconds\n", ((float)t));
    }
    else
    {
        printf("calculated in %3.1f seconds\n", ((float)t) / CLOCKS_PER_SEC);
    }
}
