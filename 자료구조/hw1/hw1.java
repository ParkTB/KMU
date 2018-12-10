import java.util.*;



class Expression {

	static double Eval(Vector<String> infix) throws Exception {
		char testCh;
		
		int expSize = infix.length();
		LinkedStack Stack = new LinkedStack();

		for(int i = 0; i<expSize; i++){
			testCh = infix.charAt(i);
			switch(testCh){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				break;
			case '+':
			case '-':
			case '/':
			case '*':
				stack.push(testCh);
				break;
			case ')':
				break;
			default:
			}
		}
	// NEED TO IMPLEMENT
		return testCh;
	}
	
}; 



