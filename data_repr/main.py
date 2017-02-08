'''
## References ##
 * [Representing data](http://www.toves.org/books/datarep/)
 * [Floating Point Demystified, Part 1](http://blog.reverberate.org/2014/09/what-every-computer-programmer-should.html)
 * [The Floating-Point Guide - What Every Programmer Should Know About Floating-Point Arithmetic](http://floating-point-gui.de/)
 * [What Every Computer Scientist Should Know About Floating-Point Arithmetic](https://docs.oracle.com/cd/E19957-01/806-3568/ncg_goldberg.html)
 * [Lahey - Floating point](http://www.lahey.com/float.htm)
 * [15. Floating Point Arithmetic](Issues and Limitations — Python 3.6.0 documentation: https://docs.python.org/3/tutorial/floatingpoint.html)
 * [Increment a python floating point value by the smallest possible amount - Stack Overflow](http://stackoverflow.com/questions/6063755/increment-a-python-floating-point-value-by-the-smallest-possible-amount)
 * [IEEE floating point - Wikipedia](https://en.wikipedia.org/wiki/IEEE_floating_point)
 * [Unit in the last place - Wikipedia](https://en.wikipedia.org/wiki/Unit_in_the_last_place)
'''
#!/usr/bin/env python3
#encoding: UTF-8

import math
import sys

def test_float():
    '''test float'''
    for i in range(1, 10):
        sum_ = 0
        j = 0.1
        for _ in range(0, i):
            sum_ += j
        print("{}) {} == {}: {}".format(i, i/10, sum_, i/10 == sum_))


def test_float_format():
    '''test float format'''
    for i in range(1, 10):
        sum_ = 0
        j = 0.1
        for _ in range(0, i):
            sum_ += j
        print("{} is {:.30f} {}".format(i/10, round(sum_, 1), sum_.as_integer_ratio()))


def main():
    '''main'''
    print("Testing floating-point numbers")
    x = 1.0
    p = 0
    while x != x + 1:
        x *= 2
        p += 1
    print("x = {}; p = {}".format(x, p))
    test_float_format()
    test_float()
    print("Integers representation")
    #'18014398509481985'
    print('3602879701896397 * 5 = {:d}'.format(3602879701896397 * 5))
    #'18014398509481984.000000'
    print('3602879701896397 * 5 = {:f}'.format(3602879701896397 * 5))
    print("log2(3602879701896397 * 5) = {}".format(math.log2(3602879701896397 * 5)))
    print('18014398509481984 / 2**55 = {:f}'.format(18014398509481984 / 2**55))
    print('18014398509481985 / 2**55 = {:f}'.format(18014398509481984 / 2**55))
    print("Smallest increment is {}".format(sys.float_info.epsilon))
    print("Over and out.")


if __name__ == "__main__":
    main()
