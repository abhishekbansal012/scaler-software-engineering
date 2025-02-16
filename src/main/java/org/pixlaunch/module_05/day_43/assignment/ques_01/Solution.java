package org.pixlaunch.module_05.day_43.assignment.ques_01;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    private int preorderIndex = 0;
    private HashMap<Integer, Integer> inorderIndexMap = new HashMap<>();

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        preorderIndex = 0;
        inorderIndexMap.clear();
        for (int i = 0; i < B.size(); i++) {
            inorderIndexMap.put(B.get(i), i);
        }
        return constructTree(A, 0, B.size() - 1);
    }

    private TreeNode constructTree(ArrayList<Integer> preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootValue = preorder.get(preorderIndex++);
        TreeNode root = new TreeNode(rootValue);

        int inorderIndex = inorderIndexMap.get(rootValue);

        root.left = constructTree(preorder, left, inorderIndex - 1);
        root.right = constructTree(preorder, inorderIndex + 1, right);

        return root;
    }
}
