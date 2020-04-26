import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search1() {
        int myList[] = { 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79, 98};
        int number = 50;
        boolean expect = true;
        boolean result = BinarySearch.search(myList, number);
        assertEquals(expect, result);
    }
    @Test
    void search2() {
        int myList[] = {2, 4, 7, 10, 11, 45, 50, 59, 60, 69, 70, 79};
        int number = 70;
        boolean expect = true;
        boolean result = BinarySearch.search(myList, number);
        assertEquals(expect, result);
    }
    @Test
    void search3() {
        int myList[] = {2, 4, 7, 10, 11, 50, 59, 60, 66, 69, 70, 79, 98};
        int number = 10;
        boolean expect = true;
        boolean result = BinarySearch.search(myList, number);
        assertEquals(expect, result);
    }
    @Test
    void search4() {
        int myList[] = {2, 4, 7, 10, 11, 45, 50, 69, 70, 79, 98};
        int number = 18;
        boolean expect = false;
        boolean result = BinarySearch.search(myList, number);
        assertEquals(expect, result);
    }
    @Test
    void search5() {
        int myList[] = {2, 4, 7, 10, 45, 50, 59, 60, 66, 69, 70, 79, 98};
        int number = 100;
        boolean expect = false;
        boolean result = BinarySearch.search(myList, number);
        assertEquals(expect, result);
    }
}