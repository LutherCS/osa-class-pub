#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

#define NUM_OF_THREADS 10

long number;

void* summer(void* param) {
	int id = (uintptr_t)param;
	long partSum = 0;
	// printf("thread id: %ld\n", pthread_self());
	// printf("thread #%d", id);
	long lower = number / NUM_OF_THREADS * id + 1;
	long upper = number / NUM_OF_THREADS * (id + 1);

	// printf(" calculating sum between %ld and %ld\n", lower, upper);
	for (long i = lower; i <= upper; i++) {
		partSum += i;
	}

	pthread_exit((void*)partSum);
}

int main(int argc, char *argv[]) {
	long sum = 0;
	void *partSum;
    clock_t t;
	pthread_t threads[NUM_OF_THREADS];

	if (argc != 2) {
		fprintf(stderr, "usage: %s [number]\n", argv[0]);
		return -1;
	}

	if (atoi(argv[1]) < 1) {
		fprintf(stderr, "%d must be positive\n", atoi(argv[1]));
		return -1;
	}
	number = atoi(argv[1]);
	
	// printf("creating %d threads\n", NUM_OF_THREADS);
    t = clock();
	for (int t = 0; t < 100; t++) {
		sum = 0;
		for (size_t i = 0; i < NUM_OF_THREADS; i++) {
			pthread_create(&threads[i], NULL, summer, (void *)i);
		}
		for (size_t i = 0; i < NUM_OF_THREADS; i++) {
			pthread_join(threads[i], &partSum);
			sum += (long)partSum;
		}
	}
	t = clock() - t;

	printf("sum = %ld\n", sum);
	printf("calculated in %f seconds\n", ((float)t)/CLOCKS_PER_SEC);
}
