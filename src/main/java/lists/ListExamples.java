package lists;

import java.util.Iterator;
import java.util.LinkedList;

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
}
