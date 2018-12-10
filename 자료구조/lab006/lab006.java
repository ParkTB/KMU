import java.util.*;

// Name :
// Student ID :


class DblList <T> {
	class DblListNode <U> {
		private U data;	// storage for data
		private DblListNode<U> left;	// link to the left node
		private DblListNode<U> right;	// link to the right node

		// constructors come here
		DblListNode() {
			this.right = this;
			// the right field contains the DblListNode itself
		}
		DblListNode(U data) {
			// set the data field and right field
			this.data = data;
		}
		DblListNode(U data, DblListNode<U> right) {
			// set the data field and right field
			this.data = data;
			this.right = right;
		}
	};

	private DblListNode<T> first; // pointer to the dummy head node


	DblList() { 
		// DblList constructor. Create a dummy head node

		first = new DblListNode<T>(); 
		first.right = first.left = first;
	}


	/**
	 * Show all the elements in sequence
	 */
	public String toString() {
		DblListNode<T> p = first.left;

		String str = new String();

		str = String.format("Dbl List From the Last (%d) : ", Size());

		// show all the nodes
		while (p != first) {
			str += (p.data + " ");
			p = p.left;
		}
		return str;
	}

	/**
	 * Insert the element e at the front position
	 */
	void InsertFront(final T e) { 
		DblListNode<T> temp = new DblListNode<T>(); 
		DblListNode<T> p;
		
		temp.data = e;
		p = first;
		
		if (first == null){
			first = temp;
		}
		else{

			temp.left = first.left;
			first.left = temp;
		}
		
		

	}

	/**
	 * delete an element that has the item
	 *  if there is no such item, return false
	 * if exists, return true
	 */
	boolean Delete(final T  e) {
		DblListNode<T> p = first.left;
		
		
		
		for(int i = 0; i<1000; i++){
			if (p.data == e){
				p.right.left = p.left;
				p.left.right = p.right;
				
				return true;
			}
			
			p = p.left;
			
		}
		return false;
		
	}

	final int  Size() {
		DblListNode<T> p = first.left;
		int cnt = 0;

		while (p != first) {
			cnt = cnt + 1;
			p = p.left;
		}
		return cnt;
	}

}


