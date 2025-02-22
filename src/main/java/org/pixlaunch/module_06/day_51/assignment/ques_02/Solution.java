package org.pixlaunch.module_06.day_51.assignment.ques_02;

import java.util.HashMap;

public class Solution {

    private final int capacity;
    private final HashMap<Integer, ListNode> hashMap;
    private final ListNode head, tail;

    static class ListNode {
        int key, val;
        ListNode prev, next;
        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }


    public Solution(int capacity) {
        this.capacity = capacity;
        this.hashMap = new HashMap<>();
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!hashMap.containsKey(key)) {
            return -1;
        }
        ListNode node = hashMap.get(key);
        moveToBack(node);
        return node.val;
    }

    public void set(int key, int value) {
        if (hashMap.containsKey(key)) {
            // Update existing value and move to back
            ListNode existingNode = hashMap.get(key);
            existingNode.val = value;
            moveToBack(existingNode);
        } else {
            if (hashMap.size() == capacity) {
                // Evict LRU node (head.next)
                ListNode lru = head.next;
                deleteNode(lru);
                hashMap.remove(lru.key);
            }
            ListNode newNode = new ListNode(key, value);
            insertBack(newNode);
            hashMap.put(key, newNode);
        }
    }

    private void moveToBack(ListNode node) {
        deleteNode(node);
        insertBack(node);
    }

    private void deleteNode(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertBack(ListNode newNode) {
        ListNode temp = tail.prev;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = tail;
        tail.prev = newNode;
    }
}
