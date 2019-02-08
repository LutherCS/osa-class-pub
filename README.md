# Operating Systems and Architecture

This is a public repository for CS450.

## Arduino

- [Voltage, Current, Resistance, and Ohm's Law - learn.sparkfun.com](https://learn.sparkfun.com/tutorials/voltage-current-resistance-and-ohms-law)
- [Arduino - Foundations](https://www.arduino.cc/en/Tutorial/Foundations)
- [Adafruit Learning System](https://learn.adafruit.com/series/learn-arduino)
- [37-piece-sensor-description.pdf](https://katie.luther.edu/pluginfile.php/339520/mod_page/content/4/37-piece-sensor-description.pdf)
- [Arduino 37 sensors - TkkrLab](https://tkkrlab.nl/wiki/Arduino_37_sensors)

## Raspberry Pi

- [51+ Raspberry Pi Projects for Beginners - Pi My Life Up](https://pimylifeup.com/category/projects/beginner/)
- [Top 10 Raspberry Pi Projects for Beginners](https://lifehacker.com/top-10-raspberry-pi-projects-for-beginners-1791002723)
- [16 Fun Projects for Your New Raspberry Pi](https://gizmodo.com/16-fun-projects-for-your-new-raspberry-pi-1657769448)
- [Raspberry Pi Projects](https://www.instructables.com/id/Raspberry-Pi-Projects/)

## Data representation

- [Representing data](http://www.toves.org/books/datarep/)
- [Floating Point Demystified, Part 1](http://blog.reverberate.org/2014/09/what-every-computer-programmer-should.html)
- [The Floating-Point Guide - What Every Programmer Should Know About Floating-Point Arithmetic](http://floating-point-gui.de/)
- [What Every Computer Scientist Should Know About Floating-Point Arithmetic](https://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html)
- [Lahey - Floating point](http://www.lahey.com/float.htm)
- [15. Floating Point Arithmetic: Issues and Limitations — Python 3.7.2 documentation](https://docs.python.org/3/tutorial/floatingpoint.html)
- [Increment a python floating point value by the smallest possible amount - Stack Overflow](http://stackoverflow.com/questions/6063755/increment-a-python-floating-point-value-by-the-smallest-possible-amount)
- [IEEE floating point - Wikipedia](https://en.wikipedia.org/wiki/IEEE_floating_point)
- [Unit in the last place - Wikipedia](https://en.wikipedia.org/wiki/Unit_in_the_last_place)

## Digital circuits

- [Logic & circuits](http://www.toves.org/books/logic/)
- [Components of digital circuits](http://www.toves.org/books/comps/)
- [What is logic gate (AND, OR, XOR, NOT, NAND, NOR and XNOR)? - Definition from WhatIs.com](https://whatis.techtarget.com/definition/logic-gate-AND-OR-XOR-NOT-NAND-NOR-and-XNOR)

### QUCS

- [Qucs project: Quite Universal Circuit Simulator](http://qucs.sourceforge.net/index.html)
- [qucs | LinuxG.net](http://linuxg.net/?s=qucs&submit=Go)
- [qucs : FransSchreuder](https://launchpad.net/~fransschreuder1/+archive/ubuntu/qucs)
- [Qucs - A Tutorial](http://qucs.sourceforge.net/docs/tutorial/digital.pdf)
- [What's the difference between Verilog and VHDL? - Quora](https://www.quora.com/Whats-the-difference-between-Verilog-and-VHDL)
- [How To Install Qucs 0.0.18 On Ubuntu 14.10, Ubuntu 14.04 And Derivative Systems | LinuxG.net](http://linuxg.net/how-to-install-qucs-0-0-18-on-ubuntu-14-10-ubuntu-14-04-and-derivative-systems/)
- [Component Reference — Qucs Reference Manual 0.0.19 documentation](http://qucs.github.io/qucs-manual/0.0.19/html-en/component_reference.html)

```
sudo add-apt-repository ppa:fransschreuder1/qucs
sudo apt update
sudo apt install qucs
sudo apt install libtool-bin
sudo apt install freehdl # may need this in order to use vhdl
sudo nano /usr/local/bin/qucsdigi # may have to fix path to qucsconv
sudo apt install iverilog # may need this in order to use verilog
```
[Qucs Ubuntu](https://www.youtube.com/watch?v=DZvP6CkWfdU)

## Threads

- [pthreads in C – a minimal working example « timmurphy.org](http://timmurphy.org/2010/05/04/pthreads-in-c-a-minimal-working-example/)
- [debian - Sort top 10 processes by the number of threads each created in Linux - Super User](https://superuser.com/questions/530291/sort-top-10-processes-by-the-number-of-threads-each-created-in-linux)
- [Linux Tutorial: POSIX Threads](http://www.yolinux.com/TUTORIALS/LinuxTutorialPosixThreads.html)
- [mingrammer/os-assign: OS programming assignment](https://github.com/mingrammer/os-assign)
- [17.1. threading — Thread-based parallelism — Python 3.5.6 documentation](https://docs.python.org/3.5/library/threading.html)
- [threading — Manage Concurrent Operations Within a Process — PyMOTW 3](https://pymotw.com/3/threading/)
- [Thread (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
- [Lesson: Concurrency (The Java™ Tutorials > Essential Classes)](https://docs.oracle.com/javase/tutorial/essential/concurrency/)

### Java

```
javac DriverSummation.java
java DriverSummation <n>
```

### POSIX

```
gcc main_summation.c -lpthread
./a.out <n>
```

## Processes

- [Inside the Linux 2.6 Completely Fair Scheduler – IBM Developer](https://developer.ibm.com/tutorials/l-completely-fair-scheduler/)

## Memory

- [latency - Approximate cost to access various caches and main memory? - Stack Overflow](https://stackoverflow.com/questions/4087280/approximate-cost-to-access-various-caches-and-main-memory)
- [The hierarchy of memory & caches](http://www.toves.org/books/cache/index.html)
- [Understanding page faults and memory swap-in/outs: when should you worry? | Scout APM Blog](https://scoutapp.com/blog/understanding-page-faults-and-memory-swap-in-outs-when-should-you-worry)
- [A CLOCK-Pro page replacement implementation [LWN.net]](https://lwn.net/Articles/147879/)
- [Better active/inactive list balancing [LWN.net]](https://lwn.net/Articles/495543/)

## Storage

- [Microsoft Word - SNIA Technical Position - DDF v2.0.doc](http://www.snia.org/sites/default/files/SNIA_DDF_Technical_Position_v2.0.pdf)
- [Coding for SSDs – Part 1: Introduction and Table of Contents | Code Capsule](http://codecapsule.com/2014/02/12/coding-for-ssds-part-1-introduction-and-table-of-contents/)
- [Why Old Operating Systems Never Really Go Away](https://tedium.co/2017/04/20/obscure-operating-systems-os2-qnx/)

## File system

- [single.dvi](http://pages.cs.wisc.edu/~remzi/OSTEP/file-implementation.pdf)
- [File System Implementation](https://gcallah.github.io/OperatingSystems/FileImplementation.html)

## Security

- [I dared two expert hackers to destroy my life. Here's what happened.](https://splinternews.com/i-dared-two-expert-hackers-to-destroy-my-life-heres-wh-1793854995)
