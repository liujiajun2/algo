package com.liujiajun.algo.basic;

import java.util.List;

/**
 * @author liujiajun
 * @date 2022-01-05 14:48
 **/
public class LinkedListUtils {


    public static ListNode createLinkedList(List<Integer> list) {

        if (list.isEmpty()) {
            return null;
        }
        ListNode head = new ListNode(list.get(0));
        ListNode tmpNode = createLinkedList(list.subList(1, list.size()));
        head.next = tmpNode;
        return head;
    }

    public static void print(ListNode header) {
        while (header != null) {
            System.out.print(header.val);
            System.out.print(" ");
            header = header.next;
        }
        System.out.println();
    }

}
