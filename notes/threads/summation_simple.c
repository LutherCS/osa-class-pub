#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <time.h> 

long sum = 0;

void* summer(void *param) {
	long lower = 1;
	long upper = (uintptr_t)param;

	// printf("calculating sum between %ld and %ld\n", lower, upper);
	for (long i = lower; i <= upper; i++) {
		sum += i;
	}
	return 0;
}

int main(int argc, char *argv[]) {
    clock_t t;

	if (argc != 2) {
		fprintf(stderr, "usage: %s [number]\n", argv[0]);
		return -1;
	}

	if (atoi(argv[1]) < 1) {
		fprintf(stderr, "%d must be positive\n", (atoi)(argv[1]));
		return -1;
	}

    long number = atoi(argv[1]);
    t = clock();
	for (int t = 0; t < 100; t++) {
		sum = 0;
		summer((void*)number);
	}
    t = clock() - t;
	printf("sum = %ld\n", sum);
	printf("calculated in %f seconds\n", ((float)t)/CLOCKS_PER_SEC);
}

