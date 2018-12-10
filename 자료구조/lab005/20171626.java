import java.util.*;

// Name : 박태범
// Student ID : 20171626


class Chain <T> {
	class ChainNode <U> {
		private U data;	// storage for data
		private ChainNode<U> link;	// link to the next node

		// constructors come here
		ChainNode() {
			this.link = null;
			// the link field is null 
		}
		ChainNode(U data) {
			// set the data field only 
			this.data = data;
		}
		ChainNode(U data, ChainNode<U> link) {
			// set the data field and link field
			this.data = data;
			this.link = link;
		}
	};

	private ChainNode<T> first; // reference to the fist node

	Chain() { 
		first = null;
	}

	boolean IsEmpty() {return first == null;}

	/**
	 * Show all the elements in the Chain in sequence
	 */
	public String toString() { 
		ChainNode<T> p = first;

		String str = new String();
		str = String.format("List (%d) : ", Size());

		// show all the nodes
		while (p != null) {
			str += p.data + " ";
			p = p.link;
		}
		return str;
	}

	/**
	 * insert theElement in theIndex
	 */ 

	boolean Insert(int theIndex, T theElement) {
			
		ChainNode<T> temp = new ChainNode<T>();
		ChainNode<T> p;
	
		temp.data = theElement;
		p = first;
		
		if (theIndex > Size()){
			return false;
		}
		

		int i = 0;
		if (first == null){
			first = temp;
		}

		else if (theIndex == 0){
			temp.link = first;
			first = temp;
		}	
		
		else {
			while (i != theIndex - 1){

				p = p.link;
				i++;
			}
			temp.link = p.link;
			p.link = temp;
		}

		return true;
	}
		
		
		
		

	/**
	 * delete an element from the first 
	 */
	T DeleteFront() {
		ChainNode<T> p = first;
		if (first==null)
			return null;
		
		first = first.link;
		return p.data;
	}

	/**
	 * return the number of elements in Chain
	 */
	final int  Size() {
		ChainNode<T> p = first;
		int cnt = 0;
		while (p != null) {
			cnt = cnt + 1;
			p = p.link;
		}
	
		return cnt;
	}

}


