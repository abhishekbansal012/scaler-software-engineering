package org.pixlaunch.module_03.day_16.assignment.ques_05;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        //return transposeArray(A); //Solution will work only for NxN Matrix. This means a square matrix only
        return  transposeArrayNonBalanced(A);
    }

    private ArrayList<ArrayList<Integer>> transposeArrayNonBalanced(ArrayList<ArrayList<Integer>> matrix) {

        // Get the dimensions of the original matrix
        int rows = matrix.size();
        int cols = matrix.get(0).size();

        // Create the transposed matrix
        ArrayList<ArrayList<Integer>> transposed = new ArrayList<>();
        for (int i = 0; i < cols; i++) {
            transposed.add(new ArrayList<>());
        }

        // Fill the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed.get(j).add(matrix.get(i).get(j));
            }
        }

        return transposed;
    }

    private ArrayList<ArrayList<Integer>> transposeArray(ArrayList<ArrayList<Integer>> A) {

        for(int i=0;i<A.size();i++) {
            for(int j=i+1;j<A.get(0).size();j++) {
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
        printMatrix(A);
        return A;
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
