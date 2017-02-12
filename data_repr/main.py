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
    print("# Testing floating-point numbers #")
    print("## Simple test ##")
    mant_ = 1.0
    exp_ = 0
    while mant_ != mant_ + 1:
        mant_ = mant_ * 2
        exp_ = exp_ + 1
    print("mantissa = {}; exponent = {}".format(mant_, exp_))
    print()
    print("## Storing decimals ##")
    test_float_format()
    print()
    print("## Comparing decimals ##")
    test_float()
    print()
    print("## 0.1 * 5 == 0.5 paradox ##")
    one_tenth = 0.1.as_integer_ratio()
    print("0.1 = {} / {}".format(one_tenth[0], one_tenth[1]))
    print("log2({}) = {}".format(one_tenth[1], math.log2(one_tenth[1])))
    print('{} * 5 = {:d}'.format(one_tenth[0], one_tenth[0] * 5))  # 18014398509481985
    print('{} * 5 = {:f}'.format(one_tenth[0], one_tenth[0] * 5))  # 18014398509481984.000000
    print("log2({} * 5) = {}".format(one_tenth[0], math.log2(one_tenth[0] * 5)))
    magic_number = one_tenth[0] * 5
    print("{} has {} binary digits".format(magic_number, math.log2(magic_number)))
    print('{} / 2**55 == 0.5 is {}'.format(magic_number - 3, (magic_number - 3) / 2**55 == 0.5))
    print('{} / 2**55 == 0.5 is {}'.format(magic_number - 2, (magic_number - 2) / 2**55 == 0.5))
    print('{} / 2**55 == 0.5 is {}'.format(magic_number - 1, (magic_number - 1) / 2**55 == 0.5))
    print('{} / 2**55 == 0.5 is {}'.format(magic_number, (magic_number) / 2**55 == 0.5))
    print('{} / 2**55 == 0.5 is {}'.format(magic_number + 1, (magic_number + 1) / 2**55 == 0.5))
    print('{} / 2**55 == 0.5 is {}'.format(magic_number + 2, (magic_number + 2) / 2**55 == 0.5))
    print('{} / 2**55 == 0.5 is {}'.format(magic_number + 3, (magic_number + 3) / 2**55 == 0.5))
    print("Smallest increment is {}".format(sys.float_info.epsilon))
    print('---')
    print("Over and out.")


if __name__ == "__main__":
    main()
