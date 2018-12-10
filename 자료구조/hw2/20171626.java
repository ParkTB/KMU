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
			// set the data field 
			this.data = data;
		}
		DblListNode(U data, DblListNode<U> right) {
			// set the data field and right field
			this.data = data;
			this.right = right;
		}
	};

	private DblListNode<T> first; // reference to the dummy head node
	private DblListNode<T> current; // current position of the hand
	private DblListNode<T> cutnode; // Node that has been cut
	private int q = 0;

	DblList() { 
		// DblList constructor. Create a dummy head node

		first = new DblListNode<T>(); 
		first.right = first.left = first;
		current = first; // current position of the hand
		cutnode = null; // Node that has been cut
	}


	/**
	 * Show all the elements in DblList
	 */
	public String toString() {
		
		DblListNode<T> p = first.left;
	//	cerr << "NEED TO IMPLEMENT" << endl;
		String str = new String();
		str = "";
		while (p!= first){
			if (p == current){
				str+= ("["+ p.data+ "]"+" ");
				p = p.left;
				continue;
			}
			str += (" " + p.data+"  ");
			p = p.left;
		}
		if (cutnode!=null){
			str+= (": "+cutnode.data);
		}
		return str;
	}


	boolean  PutRight()  {
	//	cerr << "NEED TO IMPLEMENT" << endl;
		if (cutnode == null){
			return false;
		}
		
		current.left.right = cutnode;
		cutnode.left = current.left;
		current.left = cutnode;
		cutnode.right = current;
		current = current.left;
		cutnode = null;
		return true;
	}



	boolean  PutLeft()  {
		if (cutnode == null){
			return false;
		}
		current.right.left = cutnode;
		cutnode.right = current.right;
		current.right = cutnode;
		cutnode.left = current;
		current = cutnode;
		cutnode = null;
		return true;
	
		//	cerr << "NEED TO IMPLEMENT" << endl;
	}


	boolean  MoveRight()  {
	//	cerr << "NEED TO IMPLEMENT" << endl;
		if (current.left == first){
			return false;
		}
		else{
			current = current.left;
			return true;
		}
		
	}


	boolean  MoveLeft()  {
		//	cerr << "NEED TO IMPLEMENT" << endl;
		if (current.right ==  first){
			return false;
		}
		else{
			current = current.right;
		}
		return true;
	}
	
	void  MoveEnd()  {
		//	cerr << "NEED TO IMPLEMENT" << endl;
		while(current.left != first){
			current = current.right;
		}
	}


	boolean  Cut()  {
		
		if (cutnode!=null){

			return false;
		}
		if (first.left.equals(first)){
			return false;
		}
		cutnode = first.left;
		while(cutnode!=current){
			cutnode = cutnode.left;
		}
		if (cutnode.left==first){
			current = cutnode.right;
		}
		else{
			current = cutnode.left;
		}
	
		
		cutnode.left.right = cutnode.right;
		cutnode.right.left = cutnode.left;
		
		
		
		return true;
	}

	void  InsertBack(final T e) {	
		// insert the element into the back of the list
		//	cerr << "NEED TO IMPLEMENT" << endl;
		DblListNode<T> temp = new DblListNode<T>(); 
		DblListNode<T> p;
		temp.data = e;
		p = first;
		
		if (first == null){
			first = temp;
		}
		else{
			temp.left = p;
			temp.right = p.right;
			p.right.left = temp;
			p.right =temp;
			

		}
		current = temp;

	}

	void Reverse() { 
		// Reverse the list
		//	cerr << "NEED TO IMPLEMENT" << endl;
		
		DblListNode<T> tail = first.right;
		DblListNode<T> head = first.left;
		T temp;
		while(true){
			if (first.left.equals(first)){
				break;
			}
			if (tail.data.toString().equals(head.data.toString())){
				break;
			}
			if (tail == current){
				current = head;
			}
			else if (current == head){
				current = tail;
			}
			
			temp = head.data;
			head.data = tail.data;
			tail.data = temp;
			head = head.left;
			if (head.data.toString().equals(tail.data.toString())){
				break;
			}
			tail = tail.right;
			
			
		}
	
		
	}

	boolean equals(DblList<T> dbl) { 
		// check whether the two lists are equal
		//	cerr << "NEED TO IMPLEMENT" << endl;
		DblListNode<T> aa = dbl.first.left;
		DblListNode<T> bb = first.left;
		int num = 0;
		int num2 = 0;
		if (cutnode!=null){
			return false;
		}
		while (bb != first){
			if (aa==dbl.first){
				return false;
			}
			
			else if (aa.data.toString().equals(bb.data.toString())){
				num = num + 1; 
			}
			num2 = num2+1;
			
			aa = aa.left;
			bb = bb.left;
			
		}
		while(aa!=dbl.first){
			num = num + 1;
			aa = aa.left;
		}
		if (num==num2){
			return true;
		}
		return false;
	}

}

