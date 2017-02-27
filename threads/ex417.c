#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>

int value = 0;
void *runner(void *param);

int main(int argc, char *argv[]) {
	pid_t pid;
	pthread_t tid;
	pthread_attr_t attr;

	pid = fork();

	if (pid == 0) {
		pthread_attr_init(&attr);
		pthread_create(&tid, &attr, runner, NULL);
		pthread_join(tid, NULL);
		printf("CHILD: value =  %d\n", value);
	} else if (pid > 0) {
		wait(NULL);
		value = value + 10;
		printf("PARENT: value =  %d\n", value);
	}
}

void *runner(void *param) {
	value = 450;

	pthread_exit(0);
}
