package org.pixlaunch.module_05.day_42.assignment.ques_03;

import java.util.Objects;

public class Solution {

    public TreeNode solve(TreeNode node, int B) {
        return delete(node, B);
    }

    TreeNode delete(TreeNode node, int k) {

        if (node.val == k) {

            //CASE-1: Leaf node
            if (node.left == null && node.right == null) {
                return null;
            }

            //CASE-2: Node with 1 Child
            if (node.left == null || node.right == null) {
                return Objects.requireNonNullElseGet(node.left, () -> node.right);
                /*if (node.left == null) {
                    return node.right;
                } else {
                    return node.left;
                }*/
            } else {
                //CASE-3: Node has both child

                //Find Largest value of LeftSubTree(LST)
                TreeNode curr = node.left;
                while (curr.right != null) {
                    curr = curr.right;
                }
                //Swap the largest value of LST with root node
                swapValues(node, curr);


                //Make recursive call
                node.left = delete(node.left, k);

            }
        } else if (k < node.val) {
            node.left = delete(node.left, k);
        } else {
            node.right = delete(node.right, k);
        }

        return node;
    }

    private void swapValues(TreeNode node, TreeNode curr) {
        int temp = curr.val;
        curr.val = node.val;
        node.val = temp;
    }

}
