package lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class ListExamplesTest {

    @Test
    void mergeTwoLinkedLists() {
        Integer[] a = new Integer[]{1, 3, 8, 15, 21};
        Integer[] b = new Integer[]{5, 7, 9, 32, 33};
        Integer[] c = new Integer[]{1, 3, 5, 7, 8, 9, 15, 21, 32, 33};
        LinkedList<Integer> listA = new LinkedList<Integer>(Arrays.asList(a));
        LinkedList<Integer> listB = new LinkedList<Integer>(Arrays.asList(b));
        LinkedList<Integer> listC = new LinkedList<Integer>(Arrays.asList(c));
        LinkedList<Integer> mergedList = ListExamples.mergeTwoLinkedLists(listA, listB);
        Assertions.assertEquals(listC, mergedList);
    }

    @Test
    void copyDeepArbitraryLinkedList() {
        ArbitraryNode list = generateArbitraryLinkedList();
        ArbitraryNode copy = ListExamples.copyDeepArbitraryLinkedList(list);
        Assertions.assertEquals(toString(list), toString(copy));
        ArbitraryNode add = new ArbitraryNode();
        add.setValue(1);
        add.setNext(list);
        add.setArbitraty(list.getArbitraty());
        Assertions.assertNotEquals(toString(add), toString(copy));
    }
    
    String toString(ArbitraryNode list) {
        String line = "";
        while (list!=null) {
            line += list.toString();
            list = list.next;
        }
        return line;
    }
    
    ArbitraryNode generateArbitraryLinkedList() {
        List<ArbitraryNode> nodes = new ArrayList<>();
        int[] values = new int[]{3,7,12,6};
        ArbitraryNode list = new ArbitraryNode();
        ArbitraryNode cursor = list;
        for (int i=0;i<values.length;i++) {
            cursor.setValue(values[i]);
            nodes.add(cursor);
            if (i<values.length-1) {
                cursor.next = new ArbitraryNode();
                cursor = cursor.next;
            }
        }
        cursor = list;
        while (cursor!=null) {
            Random random = new Random();
            cursor.setArbitraty(nodes.get(random.nextInt(nodes.size())));
            cursor = cursor.next;
        }
        return list;
    }
}