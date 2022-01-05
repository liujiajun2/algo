package com.liujiajun.algo.leetcode;

import com.liujiajun.algo.basic.LinkedListUtils;
import com.liujiajun.algo.basic.ListNode;

import java.util.Arrays;

/**
 * 链表反转：
 * <p>
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author liujiajun
 * @date 2022-01-05 14:46
 **/
public class ReverseLinkedList {

    public ListNode reverseList(ListNode header) {

        if (header == null) {
            return header;
        }
        //指向空，可以想象成位于第一个节点之前
        ListNode newNode = null;
        //指向第一个节点
        ListNode currNode = header;

        while (currNode != null) {

            ListNode next = currNode.next;
            //把currNode反向往前指
            currNode.next = newNode;
            //newNode向后移动
            newNode = currNode;
            //currNode向后移动
            currNode = next;
        }

        return newNode;
    }

    public static void main(String[] args) {
        ListNode node = LinkedListUtils.createLinkedList(Arrays.asList(9, 7, 8, 3, 1, 5));

        LinkedListUtils.print(node);

        ListNode reverseNode = new ReverseLinkedList().reverseList(node);

        LinkedListUtils.print(reverseNode);

        LinkedListUtils.print(node);
    }
}
