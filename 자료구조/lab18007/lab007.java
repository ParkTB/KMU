import java.util.*;
import java.lang.reflect.*;

/**
 * Generic version of the MinHeap class.
 * @param <T> the type of the value being added
 */

class MinHeap <T extends Comparable> {
	private T[] heapArray;
	private int heapSize;	// number of heap elements

	/**
	 * Create an empty MinHeap of size capacity
	 */
	MinHeap(Class<T> elemType, int capacity) {
		heapArray = (T []) Array.newInstance(elemType, capacity);
		heapSize = 0;
	}


	/**
	 * Insert item into the MinHeap
	 */
	void Insert (T item) { 

		heapSize++;
		int aa = heapSize;
		heapArray[aa] = item;
		int pidx = aa/2;
		while (pidx > 0&&(heapArray[aa].compareTo(heapArray[pidx])<0)){
			
			T tmp = heapArray[aa];
			heapArray[aa] = heapArray[pidx];
			heapArray[pidx] = tmp;
			aa = pidx;
			pidx = aa/2;
		}
		

	}

	

	void PostOrder (final int idx) { 

		if (idx > heapSize)return;

		PostOrder(2*idx);
		PostOrder(2*idx + 1);
	
		System.out.print(heapArray[idx] + " ");


	}


	public String toString() {
		String a = new String();
        a = "Min Heap : - ";
        for(int i = 1; i <= heapSize; i++) {
            a += heapArray[i] + "  ";
        }
        return a;
    }
}; 




