package org.pixlaunch.module_05.day_42.assignment.ques_02;

public class Solution {

    public TreeNode sortedArrayToBST(final int[] A) {
        return constructTree(A, 0, A.length-1);
    }

    private TreeNode constructTree(int[] arr, int startIndex, int endIndex) {

        if(startIndex > endIndex) {
            return null;
        }

        int middle = (startIndex+endIndex)/2;
        TreeNode node = new TreeNode(arr[middle]);

        node.left = constructTree(arr, startIndex, middle-1);
        node.right = constructTree(arr, middle+1, endIndex);

        return node;
    }


}
