package lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class ListExamples {

    /**
     * Given two sorted linked lists, merge them so that the resulting linked list is also sorted.
     * @param listA
     * @param listB
     * @return
     */
    static LinkedList<Integer> mergeTwoLinkedLists(LinkedList<Integer> listA, LinkedList<Integer> listB) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        Iterator<Integer> itA = listA.iterator();
        Iterator<Integer> itB = listB.iterator();
        Integer a = null,b = null;
        boolean end = false;
        while (!end) {
            if (a==null) a = itA.next();
            if (b==null) b = itB.next();
            if (a<b) {
                mergedList.addLast(a);
                if (itA.hasNext()) a = itA.next();
                else end = true;
            } else {
                mergedList.addLast(b);
                if (itB.hasNext()) b = itB.next();
                else end = true;
            }
        }
        if (itA.hasNext()) {
            mergedList.addLast(a);
            while (itA.hasNext()) mergedList.addLast(itA.next());
        }
        if (itB.hasNext()) {
            mergedList.addLast(b);
            while (itB.hasNext()) mergedList.addLast(itB.next());
        }
        return mergedList;
    }

    /**
     * You are given a linked list where the node has two pointers.
     * The first is the regular next pointer.
     * The second pointer is called arbitrary and it can point to any node in the linked list.
     * Your job is to write code to make a deep copy of the given linked list.
     * Here, deep copy means that any operations on the original list should not affect the copied list.
     * 
     */
    static ArbitraryNode copyDeepArbitraryLinkedList(ArbitraryNode list) {
        Map<ArbitraryNode, ArbitraryNode> nodes = new HashMap<>();
        ArbitraryNode cursor = list;
        ArbitraryNode copy = new ArbitraryNode();
        ArbitraryNode cursorCopy = copy;
        while (cursor!=null) {
            cursorCopy.setValue(cursor.value);
            cursorCopy.setArbitraty(cursor.arbitraty);
            nodes.put(cursor, cursorCopy);
            cursor = cursor.next;
            if (cursor!=null) {
                cursorCopy.next = new ArbitraryNode();
                cursorCopy = cursorCopy.next;
            }
        }
        cursorCopy = copy;
        while (cursorCopy!=null) {
            cursorCopy.setArbitraty(nodes.get(cursorCopy.getArbitraty()));
            cursorCopy = cursorCopy.next;
        }
        return copy;
    }
}
