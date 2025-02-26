package org.pixlaunch.module_07.day_57.assignment.ques_02;

public class Solution {

    public int[] buildHeap(int[] A) {
        int n = A.length;
        // Start heapifying from the last non-leaf node down to the root
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(A, n, i);
        }
        return A;
    }

    private void heapify(int[] A, int n, int i) {
        int smallest = i; // Assume current node is smallest
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index

        // Check if left child exists and is smaller than root
        if (left < n && A[left] < A[smallest]) {
            smallest = left;
        }

        // Check if right child exists and is smaller than smallest so far
        if (right < n && A[right] < A[smallest]) {
            smallest = right;
        }

        // If smallest is not root, swap and continue heapifying
        if (smallest != i) {
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;

            // Recursively heapify the affected subtree
            heapify(A, n, smallest);
        }
    }

}
