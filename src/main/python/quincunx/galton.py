#!/usr/bin/env python3
"""
Galton board

@author:
@version:
"""

import argparse
import random
import threading


class Board:
    """
    Class Board

    Contains multiple bins that collect beans
    Contains multiple levels of pegs
    """

    def __init__(self, bins: int):
        """Make a new board of the specified size"""
        self._bins = [0] * bins
        self._pegs = bins // 2

    def status(self):
        """Print status of the board in some meaningful format"""
        ...

    def __len__(self):
        """Return the board size"""
        return len(self._bins)

    def __getitem__(self, idx: int):
        """Get number of beans in the specified bin"""
        return self._bins[idx]

    def __setitem__(self, idx: int, new_value: int):
        """Set number of beans in the specified bin"""
        self._bins[idx] = new_value

    @property
    def bins(self):
        """Return the bins"""
        return self._bins

    @property
    def pegs(self):
        """Return number of levels of pegs"""
        return self._pegs


class Bean(threading.Thread):
    """
    Class Bean

    Data members:
    - board: Board
    - current position: position of the bean on the board
    - probability: probability of a bean falling to the right on a peg
    - lock: lock
    """

    def __init__(self, board: object, start: int, prob: float, lock: object):
        """Make a new Bean"""
        ...

    def move_left(self):
        """Move a bean left"""
        ...

    def move_right(self):
        """Move a bean right"""
        ...

    def run(self):
        """Run a bean through the pegs"""
        ...


def main():
    """Main function"""
    # Parse command-line arguments.
    # Their short/long names are provided by you must complete the parsing section
    parser = argparse.ArgumentParser(description="Process the arguments.")
    parser.add_argument("-bb", "--beans")
    parser.add_argument("-b", "--bins")
    parser.add_argument("-s", "--start")
    parser.add_argument("-p", "--prob")

    print("Start")
    # Create a list of jobs
    # Create a shared lock
    # Create a board
    # Create jobs (beans)
    # Print the board status
    # Start jobs
    # Stop jobs
    # Print the board status
    print("Done")


if __name__ == "__main__":
    main()
