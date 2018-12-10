import java.util.*;

/**
 */

class WinnerTree  {
	int[] tree; // Winner tree

	int capacity;	// size of the tree
	int n;	// number of external elements in WinnerTree


	WinnerTree(int theCapacity) { // WinnerTree constructor. 
		capacity = theCapacity;
		tree = new int[capacity];	// tree[0] is not used
		n = 0;
	}

	public String toString() { // Show all the element in sequence
		String str = new String();
		str = "WT : - ";

		// print all the nodes in the tree
		for(int i = 1; i < n * 2; i++)
			str += tree[i] + "  ";
		return str;

	}

	void  Init(int[] treedata, int nitems) {	
		// initialize the tree by using the input
		n = nitems / 2;

		int i = 1; 
		for(i = 1; i < nitems; i++) {
			tree[i] = treedata[i];
		}
	}

	void PopNReplace(int data) {	
		// NEED TO IMPLEMENT
		int b = 0;
		for (int a = n*2-1; a>0;){
			if (a/2 >= 0){
				b = b + 1;
				a = a/2;
			}
		}
		
		int c = (int)Math.pow(2, b-1);
		for (;c>n; ){
			if (c-1 >= n){
				c = c -1;
			}
		}
		
		for (int i = c; i<n*2; i++){
			if (tree[i] == tree[1]){
				tree[i] = data;
				break;
			}
		}

		for (int j = n*2-1; j>1; j = j -2){
			int h = j-1;
			int k = (j)/2;
			if (tree[j]<tree[h]){
				tree[k] = tree[j];
			}
			if (tree[j]>=tree[h]){
				tree[k] = tree[h];
			}
		}
		




	}

}

