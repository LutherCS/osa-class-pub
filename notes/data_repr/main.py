#!/usr/bin/env python3
"""
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
"""

import math
import sys


def test_float():
    """test float"""
    for i in range(1, 10):
        this_sum = 0
        j = 0.1
        for _ in range(0, i):
            this_sum += j
        print(f"{i}) {i / 10} == {this_sum}: {i / 10 == this_sum}")


def test_float_format():
    """test float format"""
    for i in range(1, 10):
        this_sum = 0
        j = 0.1
        for _ in range(0, i):
            this_sum += j
        print(f"{i / 10} is {round(this_sum, 1):.30f} {this_sum.as_integer_ratio()}")
        print(f"{i/10:.20f}=={this_sum:.20f} : {i/10 == this_sum}")


def main():
    """main"""
    print("Testing floating-point numbers")
    print("Simple test")
    mant = 1.0
    exp = 0
    while mant != mant + 1:
        mant = mant * 2
        exp = exp + 1
    print(f"mantissa = {mant}; exponent = {exp}")
    print()
    print("Storing decimals")
    test_float_format()
    print()
    print("Comparing decimals")
    test_float()
    print()
    print("0.1 * 5 == 0.5 paradox")
    one_tenth = 0.1 .as_integer_ratio()
    print(f"0.1 = {one_tenth[0]} / {one_tenth[1]}")
    print(f"log2({one_tenth[1]}) = {math.log2(one_tenth[1])}")
    print(f"{one_tenth[0]} * 5 = {one_tenth[0] * 5:d}")  # 18014398509481985
    print(f"{one_tenth[0]} * 5 = {one_tenth[0] * 5:f}")  # 18014398509481984.000000
    print(f"log2({one_tenth[0]} * 5) = {math.log2(one_tenth[0] * 5)}")
    magic_number = one_tenth[0] * 5
    print(f"{magic_number} has {math.log2(magic_number)} binary digits")
    print(f"{magic_number - 3} / 2**55 == 0.5 is {(magic_number - 3) / 2 ** 55 == 0.5}")
    print(f"{magic_number - 2} / 2**55 == 0.5 is {(magic_number - 2) / 2 ** 55 == 0.5}")
    print(f"{magic_number - 1} / 2**55 == 0.5 is {(magic_number - 1) / 2 ** 55 == 0.5}")
    print(f"{magic_number} / 2**55 == 0.5 is {magic_number / 2 ** 55 == 0.5}")
    print(f"{magic_number + 1} / 2**55 == 0.5 is {(magic_number + 1) / 2 ** 55 == 0.5}")
    print(f"{magic_number + 2} / 2**55 == 0.5 is {(magic_number + 2) / 2 ** 55 == 0.5}")
    print(f"{magic_number + 3} / 2**55 == 0.5 is {(magic_number + 3) / 2 ** 55 == 0.5}")
    print(f"Smallest increment is {sys.float_info.epsilon}")
    print("---")
    print("Over and out.")


if __name__ == "__main__":
    main()
