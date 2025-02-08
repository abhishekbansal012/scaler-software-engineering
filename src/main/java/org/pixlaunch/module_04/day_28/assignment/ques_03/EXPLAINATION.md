# Example Walkthrough
Let’s take an example to understand it better.

## Input:
A = [3, 4, -2, 5, 2, -3, 1];
B = 5;
## Step 1: Compute Prefix Sums
Index i	Element A[i]	Prefix Sum prefixSum[i]
0	3	3
1	4	7
2	-2	5 ✅ (We found sum B from index 0 to 2)
3	5	10
4	2	12
5	-3	9
6	1	10
## Step 2: Check for Valid Subarrays
We maintain a hashmap (prefixSumMap) where we store the count of each prefix sum encountered so far.

Iterating Through the Array:
At index 2, prefix sum is 5.
Since prefixSum == B, we found one valid subarray [3, 4, -2].
At index 3, prefix sum is 10.
We check if prefixSum[j] - B = 10 - 5 = 5 exists in our hashmap.
Yes! It exists (prefixSum = 5 at index 2), meaning [5] itself is a valid subarray.
At index 6, prefix sum is 10 again.
Again, prefixSum[j] - B = 10 - 5 = 5 exists in the hashmap.
This means [2, -3, 1, 5] is another valid subarray.

## Final Count of Valid Sub-arrays: 3