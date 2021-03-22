#!/usr/bin/env python3
"""
The *bean machine*, also known as the *Galton Board* or *quincunx*, is a device invented by Sir Francis Galton to demonstrate the central limit theorem, in particular that the normal distribution is approximate to the binomial distribution.
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

    def status(self, pos: int):
        """Print status"""
        raise NotImplementedError

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

    Data members: board, current position, probability, lock
    """

    def __init__(self, board: object, start: int, prob: float, lock: object):
        """Make a new Bean"""
        raise NotImplementedError

    def move_left(self):
        """Move a bean left"""
        raise NotImplementedError

    def move_right(self):
        """Move a bean right"""
        raise NotImplementedError

    def run(self):
        """Run a bean through the pegs"""
        raise NotImplementedError


def main():
    """Main function"""
    # Parse command-line arguments
    parser = argparse.ArgumentParser(description="Process the arguments.")

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

