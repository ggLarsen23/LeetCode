import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyHashMapLeetCode {

    class MyHashMap {
        int[] mappedValued;

        /** Fill the array with -1 values */
        public MyHashMap() {
            mappedValued = new int[1000];
            Arrays.fill(mappedValued, -1);
        }

        public void put(int key, int value) {
            mappedValued[key] = value;
        }

        public int get(int key) {
            return mappedValued[key];
        }

        public void remove(int key) {
            mappedValued[key] = -1;
        }
    }

    @Test
    void MyHashMapTest() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(4,6);
        assertEquals(6, myHashMap.get(4));
        assertEquals(-1, myHashMap.get(6));
        myHashMap.remove(4);
        assertEquals(-1, myHashMap.get(4));
    }

}
