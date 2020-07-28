package main.java.com.priya.leetcode.LinkedList;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.next = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();
        System.out.println("Before");
        obj.printAll(head);
        System.out.println("After");
        head = obj.removeNthFromEnd(head, 6);
        obj.printAll(head);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }

        int targetIndex = list.size() - n;
        ListNode removeNode = list.get(targetIndex);
        if (targetIndex == 0) {
            return list.get(targetIndex).next;
        } else {
            ListNode prevNode = list.get(targetIndex - 1);
            prevNode.next = removeNode.next;
            return head;
        }
    }

    public void printAll(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
