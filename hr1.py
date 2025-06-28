#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    n = len(arr)
    count_neg =0
    count_pos =0
    countz=0
    for i in arr:
        if i < 0:
            count_neg +=1
        elif i > 0:
            count_pos += 1
        else:
            countz +=1
    
    print(f"{count_pos/n:.6f}")
    print(f"{count_neg/n:.6f}")
    
    print(f"{countz/n:.6f}")
    

            

        
        

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
