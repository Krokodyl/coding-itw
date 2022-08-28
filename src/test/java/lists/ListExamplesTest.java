package lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
}