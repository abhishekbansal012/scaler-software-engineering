# Equal Tree Partition.

## Problem Description
Given a binary tree A. Check whether it is possible to partition the tree to two trees which have equal sum of values after removing exactly one edge on the original tree.


Problem Constraints
1 <= size of tree <= 100000
0 <= value of node <= 109


Input Format
First and only argument is head of tree A.


Output Format
Return 1 if the tree can be partitioned into two trees of equal sum else return 0.


Example Input
Input 1:

                5
               /  \
              3    7
             / \  / \
            4  6  5  6
Input 2:

                1
               / \
              2   10
                  / \
                 20  2


Example Output
Output 1:
1
Output 2:
0