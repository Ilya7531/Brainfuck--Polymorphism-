package javaapplication7;
import java.io.IOException;

abstract public class Term {
	
	protected static int data[];
	protected static int dataPointer;
	
	static {
		dataPointer = 0;
		data = new int [30];
		for (int i = 0; i < data.length; ++i) data[i] = 0;
	}
	
	abstract public void doProcess();
}


/*
class BracketLeft extends Term {
	
	public void doProcess() {
		if (data[dataPointer] == 0) {
			int i = 1;
			while (i > 0) {
				char c2 = str.charAt(++charPointer);
				if (c2 == Symbol.BRACKET_LEFT) i++;
				else if (c2 == Symbol.BRACKET_RIGHT) i--;
			}
		}
	}
}

class BracketRight extends Term {
	
	public void doProcess() {
		int i = 1;
		while (i > 0) {
			char c2 = str.charAt(--charPointer);
			if (c2 == Symbol.BRACKET_LEFT) i--;
			else if (c2 == Symbol.BRACKET_RIGHT) i++;
		}
		charPointer--;
	}
}
*/
